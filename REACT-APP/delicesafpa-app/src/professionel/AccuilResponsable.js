import React , { Component } from "react";
import JumbotronWrapper from '../JumbotronWrapper';
import NavPProfessionel from '../components/NavPProfessionel';
import { Clear,  logout ,getTimeOut } from '../util';
import Footer from '../components/Footer';
import ButtonArchive from "./ButtonArchive";
import ButtonGestionCommande from "./ButtonGestionCommande";

import ButtonGestionReservation from "./ButtonGestionReservation";

class AccuilResponsable extends Component {
	
	

	upSession(){

		getTimeOut('timeout')
	  }
	 
	  componentDidMount(){
		this.upSession()

	}
	
	
	alertciao(e){
		e.preventDefault();
		
		alert(JSON.stringify(localStorage.getItem('timeout')));
		
		
		this.upSession()

}



	handleLogout = (e) => {
		e.preventDefault();
		logout();
	    Clear();
		this.props.history.push("/");	
		window.location.reload();
	}
	

	render() {
		return (<div>
			<NavPProfessionel></NavPProfessionel>

			<JumbotronWrapper title="AccuilResponsable" description="ciaociao">
				
			<button  onClick={(e) => {
                this.alertciao(e);
              }}>alerttimeout </button>
		
		<div  class="m-3"><ButtonGestionCommande></ButtonGestionCommande></div>
			<div  class="m-3" >	<ButtonGestionReservation></ButtonGestionReservation></div>
			<div class="m-3">	<ButtonArchive></ButtonArchive></div>

		
		

		
		</JumbotronWrapper>
		<Footer></Footer>

		</div>
		);
	}
}





export default AccuilResponsable;
