import React , { Component } from "react";
import JumbotronWrapper from '../JumbotronWrapper';
import Footer from './Footer';
import NavPublic from "./NavPublic";
import NavPrivate from "./NavPrivate";
import {isClient,getTimeOut} from "../util";


class Contact extends Component {


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
		  <div class="text-center p-5 ">

			<JumbotronWrapper title="Contact" description="Contact">
			
		</JumbotronWrapper>
		</div>
		<Footer></Footer>

		</div>
		);
	}
}





export default Contact;
