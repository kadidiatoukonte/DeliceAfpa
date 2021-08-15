import React , { Component } from "react";
import { Link } from 'react-router-dom';
import JumbotronWrapper from '../JumbotronWrapper';
import ButtonLogOut from "./ButtonLogOut";
import Footer from './Footer';
import NavPublic from "./NavPublic";
import NavPrivate from "./NavPrivate";
import {isClient,getTimeOut} from "../util";
import ButtonDeleteFromCart from "./ButtonDeleteFromCart";
import axios from "axios";


class ContactUs extends Component {


	deleteFromPanier = (id) => {
		axios.post("/delicesafpa/findConcernerDelete",{
			
		  "idpanier": "21"
	 ,
	
		  "idarticle": "67"
	 
	})
	
	  id.preventDefault();        
	
	
	}

	upSession(){
		if (localStorage.getItem('timeout') ) {     // if no value exists associated with the key, return null
			getTimeOut('timeout')
		}
		
	  }
	 
	  componentDidMount(){
		this.upSession()

	}




	render() {
		return (<div>
						  { !isClient()?<NavPublic></NavPublic>:
							<NavPrivate></NavPrivate>}
			<JumbotronWrapper title="ContactUs" description="ContactUs">
				<Link className="nav-link" to="/">

                <ButtonLogOut></ButtonLogOut>
				

			Back to login
		</Link>
		</JumbotronWrapper>
		<form   onSubmit={(e) => {this.deleteFromPanier("31")}}>

<ButtonDeleteFromCart></ButtonDeleteFromCart>

</form>
		<Footer></Footer>

		</div>
		);
	}
}





export default ContactUs;
