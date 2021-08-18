import React , { Component } from "react";
import JumbotronWrapper from '../JumbotronWrapper';
import Footer from './Footer';
import NavPublic from "./NavPublic";
import NavPrivate from "./NavPrivate";
import {isClient,getTimeOut} from "../util";
import '../Css.css'
import {Link} from 'react-router-dom'
import {Button } from 'react-bootstrap'


class Home extends Component {
	constructor(props) {
		super(props);
		this.goBack = this.goBack.bind(this); 
	}
	goBack(e){
		e.preventDefault();
		this.upSession()
	
		this.props.history.goBack();
	  }
	upSession(){
		if (localStorage.getItem('timeout') ) {     // if no value exists associated with the key, return null
			getTimeOut('timeout')
		}
		
	  }
	 
	  componentDidMount(){
		this.upSession()

	}


	panier = (e) => {
		e.preventDefault();
		
				this.props.history.push("/panier");
	}

	menu = (e) => {
		e.preventDefault();
		
				this.props.history.push("/menu");
	}


	offre = (e) => {
		e.preventDefault();
		
				this.props.history.push("/offrespecial");
	}

	reservation = (e) => {
		e.preventDefault();
		
				this.props.history.push("/reserver");
	}


	render() {
		return ( <div class="text-center ">
		
						  { !isClient()?<NavPublic></NavPublic>:
							<NavPrivate></NavPrivate>}
			<JumbotronWrapper title="Home" description="">
			<JumbotronWrapper title="" description="">
	
<div className="d-grid gap-2 m-5"> <Button size="lg"  variant="warning" onClick={(e) => {
                this.menu(e);
              }}> MENU</Button ></div>


<div className="d-grid gap-2 m-5"> <Button size="lg"  variant="warning" onClick={(e) => {
                this.panier(e);
              }}> PANIER</Button ></div>




<div className="d-grid gap-2 m-5"> <Button size="lg"  variant="warning" onClick={(e) => {
                this.reservation(e);
              }}> RESERVATION</Button ></div>



<div className="d-grid gap-2 m-5"> <Button onClick={(e) => {
                this.offre(e);
              }}  size="lg"  variant="warning" > OFFRE SPECIAL</Button ></div>




		</JumbotronWrapper></JumbotronWrapper>




<br></br><br></br><br></br><br></br><br></br>
		<Footer></Footer>

		</div>
		);
	}
}





export default Home;
