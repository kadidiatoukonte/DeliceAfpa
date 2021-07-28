import React , { Component } from "react";
import { Link } from 'react-router-dom';
import JumbotronWrapper from '../JumbotronWrapper';
import NavPProfessionel from '../components/NavPProfessionel';
import { Clear,getTimeOut } from '../util';
import Footer from '../components/Footer';

class GestionReservation extends Component {
	
		
	

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

			<JumbotronWrapper title="GestionReservation" description="GestionReservation">
				
			<button  onClick={(e) => {
                this.alertciao(e);
              }}>alerttimeout </button>
				<Link className="nav-link" to="/">

                


accuil GestionReservation		</Link>

<button  onClick={(e) => {
                this.handleLogout(e);
              }}>Click </button>



		</JumbotronWrapper>
		<Footer></Footer>

		</div>
		);
	}
}





export default GestionReservation;
