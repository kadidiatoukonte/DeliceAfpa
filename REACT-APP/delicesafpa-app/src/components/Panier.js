import React , { Component } from "react";
import { Link } from 'react-router-dom';
import JumbotronWrapper from '../JumbotronWrapper';
import ButtonLogOut from "./ButtonLogOut";
import Footer from './Footer';
import NavPublic from "./NavPublic";
import NavPrivate from "./NavPrivate";
import {isClient,getTimeOut} from "../util";

class Panier extends Component {
	upSession(){
		if (localStorage.getItem('timeout') ) {     // if no value exists associated with the key, return null
			getTimeOut('timeout')
		}
		
	  }
	 
	  componentDidMount(){
		this.upSession()

	}






	render() {
		return (
			
			<div>
			{ !isClient()?<NavPublic></NavPublic>:
			<NavPrivate></NavPrivate>}
			<JumbotronWrapper title="Panier" description="">
				<Link className="nav-link" to="/">

                <ButtonLogOut></ButtonLogOut>


			Back to login
		</Link>

		</JumbotronWrapper>
		<Footer></Footer>

		</div>
		);
	}
}





export default Panier;
