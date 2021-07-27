import React , { Component } from "react";
import { Link } from 'react-router-dom';
import JumbotronWrapper from '../JumbotronWrapper';
import NavPProfessionel from '../components/NavPProfessionel';
import { Clear } from '../util';

class AccuilAdmin extends Component {

	alertciao(e){
		e.preventDefault();

		alert(JSON.stringify(localStorage.getItem('role')));
	  }

	handleLogout = (e) => {
		e.preventDefault();
		Clear();
		
	}
	

	render() {
		return (<div>
			<NavPProfessionel></NavPProfessionel>

			<JumbotronWrapper title="AccuilAdmin" description="">
				<Link className="nav-link" to="/">

                <button  onClick={(e) => {
                this.alertciao(e);
              }}>Click </button>


accuil Admin		</Link>


		</JumbotronWrapper>
		</div>
		);
	}
}






export default AccuilAdmin;
