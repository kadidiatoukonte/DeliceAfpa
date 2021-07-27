import React , { Component } from "react";
import { Link } from 'react-router-dom';
import JumbotronWrapper from '../JumbotronWrapper';
import NavPProfessionel from '../components/NavPProfessionel';
import Footer from '../components/Footer';
import { Clear,getTimeOut } from '../util';
import ButtonArchive from "./ButtonArchive";
import ButtonGestionCommande from "./ButtonGestionCommande";
import ButtonGestionEmployes from "./ButtonGestionEmployes";
import ButtonGestionMenu from "./ButtonGestionMenu";
import ButtonGestionReservation from "./ButtonGestionReservation";



class AccuilAdmin extends Component {


	upSession(){

		getTimeOut('timeout')
	  }
	 
	  componentDidMount(){
		this.upSession()

	}
	

	alertciao(e){
		e.preventDefault();
		this.upSession()
		alert(JSON.stringify(localStorage.getItem('role')));
	  }

	handleLogout = (e) => {
		e.preventDefault();
		Clear();
		
	}
	

	render() {
		return (<div>
			<NavPProfessionel></NavPProfessionel>
			<div class="text-center ">

			<JumbotronWrapper title="AccuilAdmin" description="">
			
			<div  class="m-3"><ButtonGestionCommande></ButtonGestionCommande></div>
			<div  class="m-3" >	<ButtonGestionReservation></ButtonGestionReservation></div>
			<div class="m-3">	<ButtonGestionMenu></ButtonGestionMenu></div>
			<div class="m-3">	<ButtonGestionEmployes></ButtonGestionEmployes></div>
			<div class="m-3">	<ButtonArchive></ButtonArchive></div>


			
			
			
			
			
			
			
			
			
			
			
			
			
			
				<Link className="nav-link" to="/">

                <button  onClick={(e) => {
                this.alertciao(e);
              }}>events </button>


accuil Admin		</Link>
<Footer></Footer>


		</JumbotronWrapper>
		</div></div>

		
		);
	}
}






export default AccuilAdmin;
