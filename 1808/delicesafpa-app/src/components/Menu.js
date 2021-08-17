import React , { Component } from "react";
import { Link} from 'react-router-dom';
import JumbotronWrapper from '../JumbotronWrapper';
import ButtonLogOut from "./ButtonLogOut";
import Footer from './Footer';
import NavPublic from "./NavPublic";
import NavPrivate from "./NavPrivate";
import {isClient,getTimeOut,createPanier} from "../util";
import {Tab,Tabs,Card,Col,Row,} from 'react-bootstrap'
import axios from "axios";
import ButtonAddtoCard from '../components/ButtonAddtoCard';
import ButtonDeleteFromCart from '../components/ButtonDeleteFromCart';
import ButtonMinusFromCart from '../components/ButtonMinusFromCart';
class Menu extends Component {
	constructor() {
		super();
	
		this.state = {
			categories:[],
		  articles: [],
		  articles1: [],
		  articles2: [],
		  articles3: [],
		  articlesSpecial: [],

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

	
	 
	  
	  componentDidMount(){
		this.upSession()
		createPanier()
const entree =  {
	"idcategorie": "1"

  };
  const plats =  {
	"idcategorie": "2"

  };
  const desserts =  {
	"idcategorie": "3"

  };
		axios.post("/delicesafpa/findbycategorie",entree).then((result) => {
  
		this.setState({ articles1: result.data });} 	);
		
		
		axios.post("/delicesafpa/findbycategorie",plats).then((result) => {
  
			this.setState({ articles2: result.data });} 	);
			
			
			axios.post("/delicesafpa/findbycategorie",desserts).then((result) => {
  
				this.setState({ articles3: result.data });} 	);
  
		







		axios.get("/delicesafpa/findOffrespeciale").then((result) => {
			this.setState({ articlesSpecial: result.data });
		  });
		
		  axios.get("/delicesafpa/allArticle").then((result) => {
			this.setState({ articles: result.data });
		  });

		 
		 
	
  

	}

  addToPanier = (id) => {

    axios.post("/delicesafpa/findConcernerAddOne", {
      
          "idpanier": JSON.stringify(localStorage.getItem('panier'))
     ,
 
          "idarticle": JSON.stringify(id)
    
  }).then((result) => {


  id.preventDefault();}    
   
  )

      
}


	render() {
		return (<div>
						  { !isClient()?<NavPublic></NavPublic>:
							<NavPrivate></NavPrivate>}
			<JumbotronWrapper title="Menu" description="">
				


			<Tabs defaultActiveKey="all" id="uncontrolled-tab-example" className="mb-3">
  <Tab eventKey="all" title="All">

  <Row md={4}>
   {this.state.articles.map((item) => (
    <Col xs={6}>
      <Card>
        <Card.Img variant="top" src={process.env.PUBLIC_URL + '/png/exampleplat.png'} />
        <Card.Body>
          <Card.Title>{item.nomarticle}</Card.Title>
          <Card.Text>
          {item.idarticle}
          </Card.Text>
        </Card.Body>

        <div class="container">
        <div class="row">
        <div class="col-sm">
        <form   onSubmit={(e) => {this.addToPanier(item.idarticle)}}>
    <ButtonAddtoCard></ButtonAddtoCard>
   
    </form>
    </div>
    <div class="col-sm">



</div>




</div></div>
      </Card>
      
    </Col>
  ))}
</Row>
  

  </Tab>
 
 
  <Tab eventKey="entree" title="Entree">
 
 
  <Row md={4}>
   {this.state.articles1.map((item) => (
    <Col xs={6}>
      <Card>
        <Card.Img variant="top" src={process.env.PUBLIC_URL + '/png/exampleplat.png'} />
        <Card.Body>
          <Card.Title>Titolo</Card.Title>
          <Card.Text>
          {item.idarticle}
          </Card.Text>
        </Card.Body>

        <div class="container">
        <div class="row">
        <div class="col-sm">
        <form   onSubmit={(e) => {this.addToPanier(item.idarticle)}}>
    <ButtonAddtoCard></ButtonAddtoCard>
   
    </form>
    </div>
    <div class="col-sm">



</div>




</div></div>
      </Card>
      
    </Col>
  ))}
</Row>
  
  
  </Tab>


  <Tab eventKey="plat" title="Plats">
 
 
  <Row md={4}>
   {this.state.articles2.map((item) => (
    <Col xs={6}>
      <Card>
        <Card.Img variant="top" src={process.env.PUBLIC_URL + '/png/exampleplat.png'} />
        <Card.Body>
          <Card.Title>Titolo</Card.Title>
          <Card.Text>
          {item.idarticle}
          </Card.Text>
        </Card.Body>

        <div class="container">
        <div class="row">
        <div class="col-sm">
        <form   onSubmit={(e) => {this.addToPanier(item.idarticle)}}>
    <ButtonAddtoCard></ButtonAddtoCard>
   
    </form>
    </div>
    <div class="col-sm">



</div>




</div></div>
      </Card>
      
    </Col>
  ))}
</Row>
  
  
  </Tab>


  <Tab eventKey="dessert" title="Desserts">
 
 
  <Row md={4}>
   {this.state.articles3.map((item) => (
    <Col xs={6}>
      <Card>
        <Card.Img variant="top" src={process.env.PUBLIC_URL + '/png/exampleplat.png'} />
        <Card.Body>
          <Card.Title>Titolo</Card.Title>
          <Card.Text>
          {item.idarticle}
          </Card.Text>
        </Card.Body>

        <div class="container">
        <div class="row">
        <div class="col-sm">
        <form   onSubmit={(e) => {this.addToPanier(item.idarticle)}}>
    <ButtonAddtoCard></ButtonAddtoCard>
   
    </form>
    </div>
    <div class="col-sm">



</div>




</div></div>
      </Card>
      
    </Col>
  ))}
</Row>
  
  
  </Tab>


  <Tab eventKey="OffreSpecial" title="OffreSpecial">
 
 
 <Row md={4}>
  {this.state.articlesSpecial.map((item) => (
   <Col xs={6}>
	 <Card>
	   <Card.Img variant="top" src={process.env.PUBLIC_URL + '/png/exampleplat.png'} />
	   <Card.Body>
		 <Card.Title>qta x{item.quantitearticle}</Card.Title>
		 <Card.Text>
		 {item.idarticle}
		 </Card.Text>
	   </Card.Body>

	   <div class="container">
	   <div class="row">
	   <div class="col-sm">
	   <form   onSubmit={(e) => {this.addToPanier(item.idarticle)}}>
   <ButtonAddtoCard></ButtonAddtoCard>
  
   </form>
   </div>
   <div class="col-sm">



</div>




</div></div>
	 </Card>
	 
   </Col>
 ))}
</Row>
 



 </Tab>


</Tabs>

           



		</JumbotronWrapper>
    <br></br>
    <br></br>

    <br></br>

    <br></br>

    <br></br>

    <br></br>

		<Footer></Footer>

		</div>
		);
	}
}





export default Menu;
