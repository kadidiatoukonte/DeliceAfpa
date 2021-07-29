import React , { Component } from "react";
import { Link } from 'react-router-dom';
import JumbotronWrapper from '../JumbotronWrapper';
import ButtonLogOut from "./ButtonLogOut";
import Footer from './Footer';
import NavPublic from "./NavPublic";
import NavPrivate from "./NavPrivate";
import {isClient,getTimeOut,createPanier} from "../util";

class Menu extends Component {
	constructor(){
super()
	}
upSession(){
		if (localStorage.getItem('timeout') ) {     // if no value exists associated with the key, return null
			getTimeOut('timeout')
		}
		
	  }
	 
	  componentDidMount(){
		this.upSession()
		createPanier()
	}




	render() {
		return (<div>
						  { !isClient()?<NavPublic></NavPublic>:
							<NavPrivate></NavPrivate>}
			<JumbotronWrapper title="Menu" description="">
				




           



		</JumbotronWrapper>
		<Footer></Footer>

		</div>
		);
	}
}





export default Menu;
