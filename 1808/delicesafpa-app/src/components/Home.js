import React , { Component } from "react";
import JumbotronWrapper from '../JumbotronWrapper';
import Footer from './Footer';
import NavPublic from "./NavPublic";
import NavPrivate from "./NavPrivate";
import {isClient,getTimeOut} from "../util";


class Home extends Component {

	upSession(){
		if (localStorage.getItem('timeout') ) {     // if no value exists associated with the key, return null
			getTimeOut('timeout')
		}
		
	  }
	 
	  componentDidMount(){
		this.upSession()

	}




	render() {
		return ( <div class="text-center ">
						  { !isClient()?<NavPublic></NavPublic>:
							<NavPrivate></NavPrivate>}
			<JumbotronWrapper title="Home" description="">
				
		</JumbotronWrapper>
		<Footer></Footer>

		</div>
		);
	}
}





export default Home;
