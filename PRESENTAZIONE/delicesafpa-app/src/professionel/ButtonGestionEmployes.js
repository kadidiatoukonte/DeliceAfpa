import React , { Component } from "react";

import {Button } from 'react-bootstrap'
import { isClient,isAdmin } from '../util';
import {  withRouter } from "react-router-dom";

class ButtonGestionEmployes extends Component {
	constructor(props) {
        super(props);
	
		this.state = {
		isLoginClient: isClient()
	
	}
	}
		////////////////////////////WARNING WARNING DA CAMBIARE

	componentDidMount(){
	
	////////////////////////////WARNING WARNING DA CAMBIARE
			var room1= localStorage.getItem('client');	
		if(room1==='client'){return true}else{return false;}  
	}

	pushLoginProf = (e) => {
		e.preventDefault();
		if (localStorage.getItem('timeout') ) {

			if (isAdmin()) {
				this.props.history.push("/gestionemploye");
			  
			   }else  {
				 this.props.history.push("/loginprof");
				
			   }         }
			
			else{        this.props.history.push("/loginprof");     }
			
			
			}
	
		

	render() {
		return (
			
			
			<div>
			    {!this.componentDidMount() ? 	
			<div className="d-grid gap-2"> 	 <Button size="lg" variant="outline-success" onClick={(e) => {
                this.pushLoginProf(e);
              }}>ButtonGestionEmployes</Button ></div>:null

			}
		</div>
		);
	}
}


	////////////////////////////WARNING WARNING DA CAMBIARE



export default withRouter(ButtonGestionEmployes);
	////////////////////////////WARNING WARNING DA CAMBIARE
