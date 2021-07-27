import React , { Component } from "react";

import {Button } from 'react-bootstrap'
import { isClient,isAdmin} from '../util';
import {  withRouter } from "react-router-dom";

class ButtonGestionMenu extends Component {
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
				this.props.history.push("/gestionmenu");
			  
			   }else  {
				 this.props.history.push("/");
				
			   }         }
			
			else{        this.props.history.push("/loginprof");     }
			
			
			}
	
		

	render() {
		return (
			
			
			<div>
			    {!this.componentDidMount() ? 	
				 <Button  variant="outline-success" onClick={(e) => {
                this.pushLoginProf(e);
              }}>ButtonGestionMenu </Button >:null

			}
		</div>
		);
	}
}






export default withRouter(ButtonGestionMenu);
