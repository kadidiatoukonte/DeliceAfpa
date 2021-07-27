import React , { Component } from "react";

import { Button } from 'react-bootstrap'
import {logout} from '../util';
import {  withRouter } from "react-router-dom";

class ButtonLogOut extends Component {


	handleLogout = (e) => {
		e.preventDefault();
		logout()
	   	
        this.props.history.push("/");	
		window.location.reload();
	}



	render() {
		return (
			<div>
				 <Button  variant="outline-info" onClick={(e) => {
                this.handleLogout(e);
              }}>Log Out </Button >

   
		</div>
		);
	}
}



ButtonLogOut.propTypes = {
	
};



export default withRouter(ButtonLogOut);
