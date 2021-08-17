import React , { Component } from "react";
import { Link } from 'react-router-dom';
import JumbotronWrapper from '../JumbotronWrapper';
import Footer from '../components/Footer';
import NavPProfessionel from '../components/NavPProfessionel';
import { isAdmin,isLivreur,isResponsable } from '../util';

import {isClient,getTimeOut} from "../util";
import { Table } from "react-bootstrap";
import axios from "axios";
import {Card,Button,Col,Row,CardColumns} from 'react-bootstrap'



class DetailCommande extends Component {
  constructor(props) {
    super(props);
    this.goBack = this.goBack.bind(this); 

    
  this.state = {
      articles: [],
      commande:{},
      article: {},
      client: {},
      commandeDetail:{},
      idclient:"",
    idarticle:"",
      nomarticle: "",
      descriptionarticle: "",
      descriptionoffresp: "",
	  prixarticle: "",
    quantitearticle:"",
    totpanier:0,
    totqtapanier:0
,
    idpanier:0


    };
  }
  goBack(e){
    e.preventDefault();
    this.upSession()

    alert(JSON.stringify('ciao'));
    this.props.history.goBack();
  }
  
  
  
  
  assignerLivreur = () => {
    var idE = +  localStorage.getItem('id');

		var idcommande = +  localStorage.getItem('commande');
		axios.put("/delicesafpa/updateCommandeLivreur",{ 
	  "idcommande":idcommande,
		"idlivreur": idE,

		}
		).then((result) => {
			
			
			var idEmp = +  localStorage.getItem('id');
		
			axios.post("/delicesafpa/addADDtraitercommande",
			{ "idcommande":idcommande,
			"idemploye": idEmp,
			"idstatus" :4,
			}
			
			
			
			)
			
			
			alert("comm: "+idcommande+"livreur: "  +idEmp + "  - assigner!");
      this.props.history.push("/gestioncommandedetaillivreur");	
      
		})
		

	
	
		
		
	}
  
  
  findlivreur(){

    this.props.history.push("/findlivreur");	



  }


  refuse(){
    var idEmp = +  localStorage.getItem('id');

    axios.post("/delicesafpa/addADDtraitercommande",
    { "idcommande":this.state.commande.idcommande,
    "idemploye": idEmp,
    "idstatus" :3,
    }
    
    
    
    )
	
  alert("refuse!")
  
    
  if (isAdmin()) {
    this.props.history.push("/gestioncommande");
     }else if(isResponsable()) {
     this.props.history.push("/gestioncommanderesponsable");
  
  }}










  accepte(){
    var idEmp = +  localStorage.getItem('id');

    axios.post("/delicesafpa/addADDtraitercommande",
    { "idcommande":this.state.commande.idcommande,
    "idemploye": idEmp,
    "idstatus" :2,
    }
    
    
    
    )
	
  alert("accepte!")
  
    
  if (isAdmin()) {
    this.props.history.push("/gestioncommande");
     }else if(isResponsable()) {
     this.props.history.push("/gestioncommanderesponsable");
  
  }
  
  }




      paye(){
   
        var idEmp = +  localStorage.getItem('id');
  
        axios.post("/delicesafpa/addADDtraitercommande",
        { "idcommande":this.state.commande.idcommande,
        "idemploye": idEmp,
        "idstatus" :5,
        }
        
        
        
        )
  
        alert("paye! ")
        if (isAdmin()) {
          this.props.history.push("/gestioncommande");
           }else if(isResponsable()) {
           this.props.history.push("/gestioncommanderesponsable");
          
           }else if(isLivreur()) {
           this.props.history.push("/gestioncommandelivreur");
          
           }else  {
           this.props.history.push("/loginprof");
          
           }         
        
        
  
  
        }
  
  

  
  
  upSession(){
		if (localStorage.getItem('timeout') ) {     // if no value exists associated with the key, return null
			getTimeOut('timeout')
		}
		
	  }



 
  componentWillMount() {
   

   this.upSession()
var id = +  localStorage.getItem('commande');
alert(id)
axios.get("/delicesafpa/commande/" +id)
    .then((result) => {  

      this.setState({ commande: result.data }); 
      
    })


    axios.get("/delicesafpa/getByIdTableDetail/" +id)
    .then((result) => {  

      this.setState({ commandeDetail: result.data }); 
    })


    axios.get("/delicesafpa/commandePanierId/" +id)
    .then((result) => {   
      
      localStorage.setItem("panier",result.data );
      this.setState({ idpanier: result.data });  
    
      this.setState({ idpanier: result.data });  
      alert(this.state.idpanier)
      
      var idpanierPP = +localStorage.getItem('panier');
const a = { idpanier : idpanierPP};

axios.post("/delicesafpa/findConcernerPanArtPanier",a).then((result) => {



  this.setState({ articles: result.data });

  this.state.articles.forEach(element => 
    {  var a=   parseFloat(element.quantitearticle)  *  parseFloat(element.idarticle.prixarticle );
       var aqta= parseFloat(element.quantitearticle);
       this.setState({ totqtapanier:  this.state.totqtapanier+aqta });
      this.setState({ totpanier:  this.state.totpanier+a });
    
  
        }  )   })

  
    
 
    
    })



  }



	render() {
		return (
			
			<div>
		
			<JumbotronWrapper title="Detail Commande" description="">
			<NavPProfessionel></NavPProfessionel>



      { this.state.commandeDetail.status===1?<div className="d-grid gap-2">  <Button disabled variant="warning" onClick={(e) => {
             
              }}>New! </Button ></div>:null
			}

{ this.state.commandeDetail.status===2?<div className="d-grid gap-2">  <Button disabled variant="success" onClick={(e) => {
               
              }}>Accepte! </Button ></div>:null
			}


{ this.state.commandeDetail.status===4?<div className="d-grid gap-2">  <Button disabled variant="primary" onClick={(e) => {
              
              }}>Pris!  Livreur: { this.state.livreur} </Button ></div>:null
			}



      <Table striped bordered hover>
  <thead>
    <tr>
      <th>adresse</th>     <td>{this.state.commande.adressecommande}</td> </tr>
      <tr>  <th>nom client</th>
    <td>{this.state.commandeDetail.nomclient}</td></tr>
      <tr> <th>huere</th> <td>{this.state.commandeDetail.horaire}</td></tr>
      <tr>  <th>telephone</th>    <td>{this.state.commandeDetail.telephone}</td></tr>
    
  </thead>
 


</Table>

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



{ this.state.commandeDetail.status===1  ?<div className="d-grid gap-2">  <Button  variant="outline-success" onClick={(e) => {
                this.accepte();
              }}>Accepte! </Button ></div>:null
			}   


{ this.state.commandeDetail.status===1  ?<div className="d-grid gap-2">  <Button  variant="outline-danger" onClick={(e) => {
                this.refuse();
              }}>Refuse! </Button ></div>:null
			}   
     

{ isLivreur()===false&&(this.state.commandeDetail.status===4 || (this.state.commandeDetail.status===2  )) ?<div className="d-grid gap-2">  <Button  variant="outline-success" onClick={(e) => {
                this.paye();
              }}>Paye! </Button ></div>:null
			}  

{isLivreur()===false&&(this.state.commandeDetail.status===4 || (this.state.commandeDetail.status===2 ) )?<div className="d-grid gap-2">  <Button  variant="outline-danger" onClick={(e) => {
                this.refuse();
              }}>Annulle! </Button ></div>:null
			}         

{isLivreur()===false&&(this.state.commandeDetail.status===2|| (this.state.commandeDetail.adressecommande!=="emporter" )) ?<div className="d-grid gap-2">  <Button  variant="outline-primary" onClick={(e) => {
                this.findlivreur();
              }}>FindLivreur! </Button ></div>:null
			}       

{isLivreur()===true&& (this.state.commandeDetail.status===2 && this.state.commandeDetail.adressecommande!=="emporter" ) ?<div className="d-grid gap-2">  <Button  variant="outline-primary" onClick={(e) => {
                this.assignerLivreur();
              }}>Pris! </Button ></div>:null
			}  

{ isLivreur()===true&&(this.state.commandeDetail.status===4 ) ?<div className="d-grid gap-2">  <Button  variant="outline-success" onClick={(e) => {
                this.paye();
              }}>Paye! </Button ></div>:null
			} 

		</JumbotronWrapper>
    <br></br>
    <br></br>
    <br></br>
    <div className="d-grid gap-2 m-3"> 
<Button size="lg" variant="outline-danger"  onClick={(e) => {
                this.goBack(e);
              }}>Go Back</Button></div>
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





export default DetailCommande;
