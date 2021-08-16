import React , { Component } from "react";
import JumbotronWrapper from '../JumbotronWrapper';
import NavPProfessionel from '../components/NavPProfessionel';
import { Clear,getTimeOut } from '../util';
import Footer from '../components/Footer';
import { Table } from "react-bootstrap";
import axios from "axios";
import {Button } from 'react-bootstrap'
import { findAllInRenderedTree } from "react-dom/test-utils";

class FindLivreur extends Component {
	
	constructor(props) {
		super(props);
	
		this.goBack = this.goBack.bind(this); 

	  this.state = {


		livreurs:[],
		livreur:"",
		  commandes: [],
		  commande: {},
		idcommande:""
		};
	  }

	  goBack(e){
		e.preventDefault();
		this.upSession()
	
		alert(JSON.stringify('ciao'));
		this.props.history.goBack();
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


		axios.get("/delicesafpa/findListLivreurSOnline").then((result) => {
			this.setState({ livreurs: result.data });

		})





	}
	
	assignerLivreur = (id) => {
		var idcommande = +  localStorage.getItem('commande');
		axios.put("/delicesafpa/updateCommandeLivreur",{ 
	  "idcommande":idcommande,
		"idlivreur": id,

		}
		).then((result) => {
			
			
			var idEmp = +  localStorage.getItem('id');
		
			axios.post("/delicesafpa/addADDtraitercommande",
			{ "idcommande":idcommande,
			"idemploye": idEmp,
			"idstatus" :4,
			}
			
			
			
			)
			
			
			alert("comm: "+idcommande+"livreur: "  +id + "  - assigner!");
		})
		

	
	
		
		
	}

		

	render() {
		return (<div>
			<NavPProfessionel></NavPProfessionel>

			<JumbotronWrapper title="FindLivreur " description="GestionCommande">
				
			<Table striped bordered hover>
  <thead>
    <tr>
      <th>idemploye</th>
      <th>in corso</th>
      <th>assegna!</th>

    </tr>
  </thead>
  {this.state.livreurs.map((item) => (
  <tbody>
    <tr>

      <td>{item.idemploye}   {item.nomemploye} </td>
	  <td> {item.adresse}</td>

      <td>			 <Button  variant="warning" onClick={(e) => {
                this.assignerLivreur(item.idemploye);
              }}>Assigne! </Button >


			</td>
    </tr>
    
  </tbody>
  ))}

  
</Table>

		</JumbotronWrapper>

		<div className="d-grid gap-2 m-3"> 
<Button size="lg" variant="outline-danger"  onClick={(e) => {
                this.goBack(e);
              }}>Go Back</Button></div>
		<Footer></Footer>

		</div>
		);
	}
}





export default FindLivreur;
