import React , { Component } from "react";
import JumbotronWrapper from '../JumbotronWrapper';
import NavPProfessionel from '../components/NavPProfessionel';
import { Clear,getTimeOut } from '../util';
import Footer from '../components/Footer';
import { Table } from "react-bootstrap";
import axios from "axios";
import {Button } from 'react-bootstrap'

class GestionCommandeLivreur extends Component {
	
	constructor(props) {
		super(props);
	
		
	  this.state = {
		  commandes: [],
		  commande: {},
		idcommande:""
		};
	  }


	upSession(){

		getTimeOut('timeout')
	  }
	 

	
	
	alertciao(e){
		e.preventDefault();
		
		alert(JSON.stringify(localStorage.getItem('timeout')));
		
		
		this.upSession()

}



	handleLogout = (e) => {
		e.preventDefault();
	    Clear();
		this.props.history.push("/");	
		window.location.reload();
	}

	
	componentDidMount() {
		this.upSession()
		const id = +localStorage.getItem('id');
		
		axios.get("/delicesafpa/commandeOnCourseLivreur/"+ id).then((result) => {
			this.setState({ commandes: result.data });
			if(this.state.commandes.length<1){alert("nessuna comanda!")}
		})





	}
	
	detailCommande = (id) => {
		
		localStorage.setItem("commande", id);
		if(localStorage.getItem("role")==='"admin"'){
		this.props.history.push("/gestioncommandedetail");	
		}
		if(localStorage.getItem("role")==='"responsable"'){
			this.props.history.push("/gestioncommandedetailresponsable");	
			}
			if(localStorage.getItem("role")==='"livreur"'){
				this.props.history.push("/gestioncommandedetaillivreur");	
				}
	}

		

	render() {
		return (<div>
			<NavPProfessionel></NavPProfessionel>

			<JumbotronWrapper title="GestionCommandeLivreur" description="GestionCommande">
				
			<Table striped bordered hover>
  <thead>
    <tr>
      <th>Orario</th>
      <th>Adress</th>
      <th>Status</th>

    </tr>
  </thead>
  {this.state.commandes.map((item) => (
  <tbody>
    <tr>

      <td>{item.horaire} - id: {item.idcommande}</td>
	  <td> {item.adresse}</td>

      <td>			{ item.idstatus===1?<div className="d-grid gap-2">  <Button  variant="warning" onClick={(e) => {
                this.detailCommande(item.idcommande);
              }}>New! </Button ></div>:null
			}

{ item.idstatus===2?<div className="d-grid gap-2">  <Button  variant="success" onClick={(e) => {
                this.detailCommande(item.idcommande);
              }}>Accepte! </Button ></div>:null
			}


{ item.idstatus===4?<div className="d-grid gap-2">  <Button  variant="primary" onClick={(e) => {
                this.detailCommande(item.idcommande);
              }}>Pris! </Button ></div>:null
			}
			
			</td>
    </tr>
    
  </tbody>
  ))}

  
</Table>

		</JumbotronWrapper>
		<Footer></Footer>

		</div>
		);
	}
}





export default GestionCommandeLivreur;
