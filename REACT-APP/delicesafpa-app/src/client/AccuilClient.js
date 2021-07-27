import React , { Component } from "react";
import { Link } from 'react-router-dom';
import JumbotronWrapper from '../JumbotronWrapper';
import NavP from '../components/NavP';
import { Clear,  logout,getTimeOut } from '../util';

class AccuilClient extends Component {
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
		logout();
	    Clear();
		localStorage.clear();
		this.props.history.push("/");	
		window.location.reload();
	}
	

	render() {
		return (<div>
			<NavP></NavP>

			<JumbotronWrapper title="AccuilClient" description="">
				
			<button  onClick={(e) => {
                this.alertciao(e);
              }}>alerttimeout </button>
				<Link className="nav-link" to="/">

                


accuil client		</Link>

<button  onClick={(e) => {
                this.handleLogout(e);
              }}>Click </button>
		</JumbotronWrapper>
		</div>
		);
	}
}





export default AccuilClient;
