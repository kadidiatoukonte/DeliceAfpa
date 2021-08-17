import React from "react";
import FormsLogin from '../forms/FormsLogin';
import {getTimeOut,Clear } from '../util';
import {Spinner} from 'react-bootstrap'
import {Alert,Button,Table,Tab,Tabs} from 'react-bootstrap';
import {Card,Col,Row,CardColumns,Form} from 'react-bootstrap'
import JumbotronWrapper from '../JumbotronWrapper';
import Footer from '../components/Footer';
import NavPublic from "../components/NavPublic";
import NavPrivate from "../components/NavPrivate";
import {isClient} from "../util";
import axios from "axios";
import TimePicker from 'react-bootstrap-time-picker';


class ConfirmPCommandeClient extends React.Component {

  constructor(props) {
    super(props);


   
    this.state = {
      articles: [],
      article: {},
      client:{},
      idclient:0,
      nomclient:"",
mailclient:"",
    idarticle:"",
      nomarticle: "",
      descriptionarticle: "",
      descriptionoffresp: "",
	  prixarticle: "",
    quantitearticle:"",
    totpanier:0,
    totqtapanier:0,
    time: 0 
    };
  
    this.handleTimeChange = this.handleTimeChange.bind(this);


    this.goBack = this.goBack.bind(this); 
  }


  handleTimeChange(time) {
    console.log(time);     // <- prints "3600" if "01:00" is picked
    this.setState({ time });
  }


  componentWillMount() {
    this.upSession()

    if(!localStorage.getItem('panier')){ alert("panier  vuoto")}else{
   const p =   localStorage.getItem('panier')
const a = { idpanier : p};
axios.post("/delicesafpa/findConcernerPanArtPanier",a).then((result) => {
  this.setState({ articles: result.data });
  this.state.articles.forEach(element => 
    {  var a=   parseFloat(element.quantitearticle)  *  parseFloat(element.idarticle.prixarticle );
       var aqta= parseFloat(element.quantitearticle);
       this.setState({ totqtapanier:  this.state.totqtapanier+aqta });
      this.setState({ totpanier:  this.state.totpanier+a });
    
    
    
        }  )

    });

    const item = JSON.parse(localStorage.getItem('timeout') );
    var m =item.value.mail;
    
    this.setState({ mailclient: m });





    axios.post("/delicesafpa/clientinfo",{ "mailclient":m}).then((result) => {
      this.setState({ client: result.data });
    
    
    
    })
  

  }}

  
	upSession(){
		if (localStorage.getItem('timeout') ) {     // if no value exists associated with the key, return null
			getTimeOut('timeout')
		}
		
	  }
	 

  goBack(e){
    e.preventDefault();
    this.upSession()

    this.props.history.goBack();
  }

/*

		this.adressecommande = adressecommande;
		this.horaire = horaire;
		this.idclient = idclient;
		this.totcommande = totcommande;
	}*/ 



addLivraison = (e) =>{ 
  		e.preventDefault();
      const pan =localStorage.getItem('panier') ;
  const item = JSON.parse(localStorage.getItem('timeout') );
    var m =item.value.mail;
    this.setState({ mailclient: m });
  axios.post("/delicesafpa/addcommandeclient",
  { "adressecommande":"consegnare a ",
  "horaire": this.state.time ,
  "idclient":this.state.client.idclient,
  "totcommande" :this.state.totpanier,
  "idpanier":pan
  }

).then((result) => {
  

  axios.post("/delicesafpa/addADDtraitercommande",
  { "idcommande":result.data.idcommande,
  "idemploye": 1,
  "idstatus" :1,
  }


  
)




alert("comanda inviata")
localStorage.removeItem("panier");
this.props.history.push("/");	

 }

 

  )}

  addEmporter = (e) =>{ 
    e.preventDefault();
    const pan =localStorage.getItem('panier') ;
const item = JSON.parse(localStorage.getItem('timeout') );
  var m =item.value.mail;
  this.setState({ mailclient: m });
axios.post("/delicesafpa/addcommandeclient",
{ "adressecommande":"emporter",
"horaire": this.state.time ,
"idclient":this.state.client.idclient,
"totcommande" :this.state.totpanier,
"idpanier":pan
}

).then((result) => {


axios.post("/delicesafpa/addADDtraitercommande",
{ "idcommande":result.data.idcommande,
"idemploye": 1,
"idstatus" :1,
}



)




alert("comanda inviata")
localStorage.removeItem("panier");
this.props.history.push("/");	

}



)}




  render() {
    return (
      <div class="text-center ">
						   { !isClient()?<NavPublic></NavPublic>:
							<NavPrivate></NavPrivate>}
			<JumbotronWrapper title="" description="">


 


      <div class="text-center ">

      {this.state.time} time




      {this.state.client.idclient} idididi

      {this.state.client.nomclient} 
      {this.state.client.prenomclient} 
      {this.state.client.paysclient} 
      {this.state.client.adresseclient} 
      {this.state.client.complementadrclient} 
      {this.state.client.cpclient} 
      {this.state.client.villeclient} 
      {this.state.client.idclient} 
      {this.state.client.telclient} 

      
      {this.state.mailclient} 

      <Table striped bordered hover>
  <thead>
    <tr>
      <th>id</th>
      <th>Article</th>
      <th>qta</th>
      <th>prix</th>
      <th>tot</th>
    </tr>
  </thead>
  {this.state.articles.map((item) => (
  <tbody>
    <tr>
      <td> {item.idarticle.idarticle}</td>
      <td>{item.idarticle.nomarticle}
</td>
      <td>{item.quantitearticle}</td>
      <td>{item.idarticle.prixarticle} €</td>
    <td>  {parseFloat(item.quantitearticle)  *  parseFloat(item.idarticle.prixarticle )} €</td>
    </tr>
    
  </tbody>
  ))}

  <thead>
  <tr>
  <td colSpan="3"></td>
      <td>Tot qta: {this.state.totqtapanier} </td>
      
      <td>Tot panier:  {this.state.totpanier} €</td>
    </tr>
   
  </thead>
</Table>
<Tabs justify  defaultActiveKey="emporter" id="uncontrolled-tab-example" className="mb-3">
  <Tab eventKey="emporter" title="Emporter">
  <Form  onSubmit={this.addEmporter}>
  




  <Row className="mb-3">
  


    <Form.Group as={Col} controlId="formGridH">
      <Form.Label>Heure</Form.Label>
      <TimePicker onChange={this.handleTimeChange} value={this.state.time} start="19:00" end="23:00" step={30} />

    </Form.Group>
  </Row>
  
  
  

  <Button variant="primary" type="submit">
    Submit
  </Button>
 
</Form>
  </Tab>





  <Tab eventKey="livraison" title="Livraison">


  <Form  onSubmit={this.addLivraison}>
  
  <Form.Group className="mb-3" controlId="formGridAddress1">
    <Form.Label>Address</Form.Label>
    <Form.Control placeholder="1234 Main St" />
  </Form.Group>

  <Form.Group className="mb-3" controlId="formGridAddress2">
    <Form.Label>Address 2</Form.Label>
    <Form.Control placeholder="Apartment, studio, or floor" />
  </Form.Group>

  <Row className="mb-3">
    <Form.Group as={Col} controlId="formGridCity">
      <Form.Label>City</Form.Label>
      <Form.Control />





    </Form.Group>


    <Form.Group as={Col} controlId="formGridZip">
      <Form.Label>Zip</Form.Label>
      <Form.Control />
    </Form.Group>

    <Form.Group as={Col} controlId="formGridH">
      <Form.Label>Heure</Form.Label>
      <TimePicker onChange={this.handleTimeChange} value={this.state.time} start="19:00" end="23:00" step={30} />

    </Form.Group>
  </Row>
  
  
  

  <Button variant="primary" type="submit">
    Submit
  </Button>
 
</Form>


  </Tab>
  
</Tabs>



</div>







<Card >
  <Card.Body>
  <div class="text-center ">
  <Alert  variant={'warning'}>
<Alert.Heading className ="text-center">Confirm Commande Client</Alert.Heading>

 <div className="d-grid gap-2 m-3"> 
<Button size="lg" variant="outline-danger"  onClick={(e) => {
                this.goBack(e);
              }}>Go Back</Button></div>
     </Alert>   
     </div>
  </Card.Body>
</Card>
      



      </JumbotronWrapper>

      <br></br>
      <br></br>

      <br></br>

      <br></br>

      <br></br>

      <br></br>

      <br></br>

      <br></br>


      <Footer></Footer>

</div>
    );
  }
}
export default ConfirmPCommandeClient;
