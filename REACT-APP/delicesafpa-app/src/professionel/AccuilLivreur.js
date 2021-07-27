import React , { Component } from "react";
import { Link } from 'react-router-dom';
import JumbotronWrapper from '../JumbotronWrapper';
import NavPProfessionel from '../components/NavPProfessionel';
import { Clear,  logoutCLient ,getTimeOut } from '../util';

class AccuilLivreur extends Component {
	constructor() {
		super();
	   
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
	

	render() {
		return (<div>
			<NavPProfessionel></NavPProfessionel>

			<JumbotronWrapper title="AccuilLivreur" description="">
				
			<button  onClick={(e) => {
                this.alertciao(e);
              }}>alerttimeout </button>
				<Link className="nav-link" to="/">

                


accuil livreur		</Link>

<button  onClick={(e) => {
                this.handleLogout(e);
              }}>Click </button>
		</JumbotronWrapper>
		</div>
		);
	}
}





export default AccuilLivreur;
