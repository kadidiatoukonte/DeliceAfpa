import React , { Component } from "react";
import { Link } from 'react-router-dom';
import JumbotronWrapper from '../JumbotronWrapper';
import NavPrivate from '../components/NavPrivate';
import { Clear,  logout,getTimeOut } from '../util';
import Footer from '../components/Footer';

class AccuilClient extends Component {

	
	

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
		logout();
	    Clear();
		localStorage.clear();
		this.props.history.push("/");	
		window.location.reload();
	}
	

	render() {
		return (<div>
			<NavPrivate></NavPrivate>

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
		<Footer></Footer>
		</div>
		);
	}
}





export default AccuilClient;
