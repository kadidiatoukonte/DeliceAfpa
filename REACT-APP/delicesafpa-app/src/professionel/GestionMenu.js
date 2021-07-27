import React , { Component } from "react";
import { Link } from 'react-router-dom';
import JumbotronWrapper from '../JumbotronWrapper';
import NavPProfessionel from '../components/NavPProfessionel';
import { Clear,getTimeOut } from '../util';
import Footer from '../components/Footer';

class GestionMenu extends Component {
	
		


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

			<JumbotronWrapper title="GestionMenu" description="GestionMenu">
				
			<button  onClick={(e) => {
                this.alertciao(e);
              }}>alerttimeout </button>
				<Link className="nav-link" to="/">

                


accuil GestionMenu		</Link>

<button  onClick={(e) => {
                this.handleLogout(e);
              }}>Click </button>

<Footer></Footer>


		</JumbotronWrapper>
		</div>
		);
	}
}





export default GestionMenu;
