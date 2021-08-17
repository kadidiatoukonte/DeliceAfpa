import React , { Component } from "react";

import {Button } from 'react-bootstrap'
import { isClient,isAdmin,isLivreur,isResponsable } from '../util';
import {  withRouter } from "react-router-dom";

class ButtonGestionCommande extends Component {
	constructor(props) {
        super(props);
	
		this.state = {
		isLoginClient: isClient()
	
	}
	}
	
	componentDidMount(){
	
	
			var room1= localStorage.getItem('client');	
		if(room1==='client'){return true}else{return false;}  
	}

	pushLoginProf = (e) => {
		e.preventDefault();
		if (localStorage.getItem('timeout') ) {

			if (isAdmin()) {
				this.props.history.push("/gestioncommande");
			   }else if(isResponsable()) {
				 this.props.history.push("/gestioncommanderesponsable");
				
			   }else if(isLivreur()) {
				 this.props.history.push("/gestioncommandelivreur");
				
			   }else  {
				 this.props.history.push("/loginprof");
				
			   }         }
			
			else{        this.props.history.push("/loginprof");     }
			
			
			}
	
		

	render() {
		return (
			
			
			<div>
			    {!this.componentDidMount() ? 	

				<div className="d-grid gap-2"> <Button size="lg"  variant="outline-success" onClick={(e) => {
                this.pushLoginProf(e);
              }}> ButtonGestionCommande</Button ></div>:null

			}
		</div>
		);
	}
}



export default withRouter(ButtonGestionCommande);
