import React , { Component } from "react";

import {Button } from 'react-bootstrap'
import { isClient,isAdmin,isLivreur,isResponsable } from '../util';
import {  withRouter } from "react-router-dom";

class ButtonGestionReservation extends Component {
	constructor(props) {
        super(props);
	
		this.state = {
		isLoginClient: isClient()
	
	}
	}
	
	componentDidMount(){
	
	
			var room1= localStorage.getItem('client');	
		if(room1==='client'||isLivreur()){return false}else{return true;}  
	}

	pushLoginProf = (e) => {
		e.preventDefault();
		if (localStorage.getItem('timeout') ) {

			if (isAdmin()) {
				this.props.history.push("/gestionreservation");
			   }else if(isResponsable()) {
				 this.props.history.push("/accuilresponsable");
				
			   }else if(isLivreur()) {
				 this.props.history.push("/");
				
			   }else  {
				 this.props.history.push("/");
				
			   }         }
			
			else{        this.props.history.push("/loginprof");     }
			
			
			}
	
		

	render() {
		return (
			
			
			<div>
			    {this.componentDidMount() ? 	
				 <Button  variant="outline-success" onClick={(e) => {
                this.pushLoginProf(e);
              }}>ButtonGestionReservation</Button >:null

			}
		</div>
		);
	}
}




export default withRouter(ButtonGestionReservation);
