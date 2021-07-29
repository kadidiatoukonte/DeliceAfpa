import React , { Component } from "react";
import { Link } from 'react-router-dom';
import JumbotronWrapper from '../JumbotronWrapper';
import ButtonLogOut from "./ButtonLogOut";
import Footer from './Footer';
import NavPublic from "./NavPublic";
import NavPrivate from "./NavPrivate";
import {isClient,getTimeOut} from "../util";
import { Table } from "react-bootstrap";
import axios from "axios";
import ButtonAddtoCard from '../components/ButtonAddtoCard';
import {Card,Button,Col,Row,CardColumns} from 'react-bootstrap'



class Panier extends Component {
  constructor() {
    super();

    this.state = {
      articles: [],
      article: {},
    idarticle:"",
      nomarticle: "",
      descriptionarticle: "",
      descriptionoffresp: "",
	  prixarticle: "",
    
    };
  }
  
  
  
  
  
  
  upSession(){
		if (localStorage.getItem('timeout') ) {     // if no value exists associated with the key, return null
			getTimeOut('timeout')
		}
		
	  }



 
  componentDidMount() {
    this.upSession()


    if(!localStorage.getItem('panier')){ alert("panier  vuoto")}else{
 const p =   localStorage.getItem('panier')
const a = { idpanier : p};
axios.post("/delicesafpa/findConcernerPanArtPanier",a).then((result) => {
  this.setState({ articles: result.data });
    });
  }}

 





	render() {
		return (
			
			<div>
			{ !isClient()?<NavPublic></NavPublic>:
			<NavPrivate></NavPrivate>}
			<JumbotronWrapper title="Panier" description="">
		  <Row md={4}>
   {this.state.articles.map((item) => (
    <Col xs={6}>
      <Card>
        <Card.Img variant="top" src={process.env.PUBLIC_URL + '/png/exampleplat.png'} />
        <Card.Body>
          <Card.Title>{item.nomarticle}</Card.Title>
          <Card.Text>
		  {item.descriptionarticle}
          </Card.Text>
        </Card.Body>
    
        <form   onSubmit={(e) => {this.addToPanier(item.idarticle)}}>
    <ButtonAddtoCard></ButtonAddtoCard>
    </form>
      </Card>
      
    </Col>
  ))}
</Row>


		</JumbotronWrapper>
		<Footer></Footer>

		</div>
		);
	}
}





export default Panier;
