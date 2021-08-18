import React , { Component } from "react";
import JumbotronWrapper from '../JumbotronWrapper';
import Footer from './Footer';
import NavPublic from "./NavPublic";
import NavPrivate from "./NavPrivate";
import {isClient,getTimeOut} from "../util";
import { Table } from "react-bootstrap";
import axios from "axios";
import ButtonAddtoCard from '../components/ButtonAddtoCard';
import {Card,Button,Col,Row,CardColumns} from 'react-bootstrap'
import ButtonDeleteFromCart from '../components/ButtonDeleteFromCart';
import ButtonMinusFromCart from '../components/ButtonMinusFromCart';


class Panier extends Component {
  constructor(props) {
    super(props);

    
  this.state = {
      articles: [],
      article: {},
    idarticle:"",
      nomarticle: "",
      descriptionarticle: "",
      descriptionoffresp: "",
	  prixarticle: "",
    quantitearticle:"",
    totpanier:0,
    totqtapanier:0
    };

    this.goBack = this.goBack.bind(this); 

  }
  
  goBack(){
		
		this.upSession()
	
		this.props.history.goBack();
	  }
  testClient(e){
    if (localStorage.getItem('client') ) {     // if no value exists associated with the key, return null
      this.props.history.push("/confirmcommandeclient"); 
      
		}else{         this.props.history.push("/loginclient"); 
  }
		
	  }



  

  
  
  upSession(){
		if (localStorage.getItem('timeout') ) {     // if no value exists associated with the key, return null
			getTimeOut('timeout')
		}
		
	  }

    addToPanier = (id) => {
      axios.post("/delicesafpa/findConcernerAddOne", {
        
            "idpanier": JSON.stringify(localStorage.getItem('panier'))
       ,
   
            "idarticle": id
       
    })

    this.props.history.push("/modifiepanier"); 

   
 

  }


  minusToPanier = (id) => {
    axios.post("/delicesafpa/findConcernerMinusOne", {
      
          "idpanier": JSON.stringify(localStorage.getItem('panier'))
     ,
 
          "idarticle": id
     
  })


  this.props.history.push("/modifiepanier"); 

}





  deleteFromPanier = (id) => {
    axios.post("/delicesafpa/findConcernerDelete",{
        
      "idpanier": JSON.stringify(localStorage.getItem('panier'))
 ,

      "idarticle": id
 
})

        
this.props.history.push("/modifiepanier"); 

}

 
  componentWillMount() {
    this.upSession()


    if(!localStorage.getItem('panier')){ alert("panier  vuoto")
    this.goBack()
  
  
  
  }else{
   const p =   localStorage.getItem('panier')
const a = { idpanier : p};
axios.post("/delicesafpa/findConcernerPanArtPanier",a).then((result) => {



  this.setState({ articles: result.data });
  if(this.state.articles.length<1){  alert("panier  vuoto");
  
  this.goBack()
  	
}
  this.state.articles.forEach(element => 
    {  var a=   parseFloat(element.quantitearticle)  *  parseFloat(element.idarticle.prixarticle );
       var aqta= parseFloat(element.quantitearticle);
       this.setState({ totqtapanier:  this.state.totqtapanier+aqta });
      this.setState({ totpanier:  this.state.totpanier+a });
    
    
    
        }  )

    });

    

  

  }}

 





	render() {
		return (
			
			<div>
			{ !isClient()?<NavPublic></NavPublic>:
			<NavPrivate></NavPrivate>}
			<JumbotronWrapper title="Panier" description="">

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
    <button type="button" onClick={(e) => {
                this.testClient(e);
     } }>Confirm!</button>
  </thead>
</Table>


     
     


     
      <Row >
   {this.state.articles.map((item) => (
    <Col xs={12}>
      <Card>
        <Card.Img variant="top" src={process.env.PUBLIC_URL + '/png/exampleplat.png'} />
        <Card.Body>
          <Card.Title>qta x{item.quantitearticle}</Card.Title>
          <Card.Text>
          {item.idarticle.idarticle}
          </Card.Text>
        </Card.Body>

        <div class="row">
       <table>
        <tr>
  <td >
       
        <form   onSubmit={(e) => {this.addToPanier(item.idarticle.idarticle)}}>
    <ButtonAddtoCard></ButtonAddtoCard>
   
    </form>
    </td>
    <td >

    {item.quantitearticle}
    </td >
    
    <td >
    <form   onSubmit={(e) => {this.minusToPanier(item.idarticle.idarticle)}}>

    <ButtonMinusFromCart></ButtonMinusFromCart>
    </form>
    </td >

    <td >
     <form   onSubmit={(e) => {this.deleteFromPanier(item.idarticle.idarticle)}}>

<ButtonDeleteFromCart></ButtonDeleteFromCart>


</form>
</td >
</tr>
</table>
</div>

      </Card>
      
    </Col>
  ))}
</Row>
  


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





export default Panier;
