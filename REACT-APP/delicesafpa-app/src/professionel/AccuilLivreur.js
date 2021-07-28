import React , { Component } from "react";
import JumbotronWrapper from '../JumbotronWrapper';
import NavPProfessionel from '../components/NavPProfessionel';
import { Clear,getTimeOut } from '../util';
import Footer from '../components/Footer';
import ButtonArchive from "./ButtonArchive";
import ButtonGestionCommande from "./ButtonGestionCommande";
class AccuilLivreur extends Component {
	
	

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
	    Clear();
		this.props.history.push("/");	
		window.location.reload();
	}
	

	render() {
		return (<div>
			<NavPProfessionel></NavPProfessionel>

			<JumbotronWrapper title="AccuilLivreur" description="">
				
			<button  onClick={(e) => {
                this.alertciao(e);
              }}>alerttimeout </button>
				

				<div  class="m-3"><ButtonGestionCommande></ButtonGestionCommande></div>
			<div class="m-3">	<ButtonArchive></ButtonArchive></div>

		</JumbotronWrapper>
		<Footer></Footer>

		</div>
		);
	}
}





export default AccuilLivreur;
