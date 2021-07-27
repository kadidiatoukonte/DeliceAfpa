import React , { Component } from "react";

import {Button } from 'react-bootstrap'
import { isClient } from '../util';
import {  withRouter } from "react-router-dom";

class ButtonLogInProf extends Component {
	constructor(props) {
        super(props);
	
		this.state = {
		isLoginClient: isClient()
	}
	}
	componentDidMount(){
		var room1= localStorage.getItem('client');	
		if(room1=='client'){return true}else{return false;}  
	}

	pushLoginProf = (e) => {
		e.preventDefault();
        this.props.history.push("/loginprof");	}
	
		

	render() {
		return (
			
			
			<div>
			    {!this.componentDidMount() ? 	
				 <Button  variant="outline-success" onClick={(e) => {
                this.pushLoginProf(e);
              }}>Espace Prof </Button >:null

			}
		</div>
		);
	}
}



ButtonLogInProf.propTypes = {
	
};



export default withRouter(ButtonLogInProf);
