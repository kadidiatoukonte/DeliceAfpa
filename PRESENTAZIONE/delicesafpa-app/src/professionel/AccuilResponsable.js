import React , { Component } from "react";
import JumbotronWrapper from '../JumbotronWrapper';
import NavPProfessionel from '../components/NavPProfessionel';
import { Clear,  logout ,getTimeOut,isResponsable } from '../util';
import Footer from '../components/Footer';
import ButtonArchive from "./ButtonArchive";
import ButtonGestionCommande from "./ButtonGestionCommande";

import ButtonGestionReservation from "./ButtonGestionReservation";

class AccuilResponsable extends Component {
	
	 handleSubmit(e) {
		e.preventDefault();
		console.log('Hai cliccato Invia.');
		
		if(!JSON.stringify(localStorage.getItem('role')).includes('responsable'))
	{ localStorage.clear();
		window.location.reload(); }
	  }

	upSession(){

		getTimeOut('timeout')
	  }
	 
	  componentDidMount(){
		this.upSession()
		if(!isResponsable){ localStorage.clear(); }
	}
	
	
	alertciao(e){
		e.preventDefault();
		
		alert(JSON.stringify(localStorage.getItem('timeout')));
		
		if(!JSON.stringify(localStorage.getItem('role')).includes('responsable'))
	{ localStorage.clear();
		window.location.reload(); }
}



	handleLogout = (e) => {
		e.preventDefault();
	    Clear();
		this.props.history.push("/");	
		window.location.reload();
	}
	

	render() {
		return (<div>
			<NavPProfessionel></NavPProfessionel>

			<JumbotronWrapper title="AccuilResponsable" description="">
				
			<button  onClick={(e) => {
                this.alertciao(e);
              }}>alerttimeout </button>
		
		<div  class="m-3"> <ButtonGestionCommande></ButtonGestionCommande></div>
			<div  class="m-3" >	<ButtonGestionReservation></ButtonGestionReservation></div>
			<div class="m-3">	<ButtonArchive></ButtonArchive></div>

		
		

		
		</JumbotronWrapper>
		<Footer></Footer>

		</div>
		);
	}
}





export default AccuilResponsable;
