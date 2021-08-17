import React from "react";
import FormsLogin from '../forms/FormsLogin';
import {getTimeOut,Clear } from '../util';
import {Spinner} from 'react-bootstrap'
import {Alert,Button,Table} from 'react-bootstrap';
import {Card,Col,Row,CardColumns} from 'react-bootstrap'
import JumbotronWrapper from '../JumbotronWrapper';
import Footer from './Footer';
import NavPublic from "./NavPublic";
import NavPrivate from "./NavPrivate";
import {isClient} from "../util";
import axios from "axios";

class ConfirmModification extends React.Component {

  constructor(props) {
    super(props);


   
    this.state = {
      articles: [],
      article: {},
    idarticle:"",
      nomarticle: "",
      descriptionarticle: "",
      descriptionoffresp: "",
	  prixarticle: "",
    quantitearticle:"",
    totpanier:0,
    totqtapanier:0
    };
  
  

    this.goBack = this.goBack.bind(this); 
  }


	upSession(){
		if (localStorage.getItem('timeout') ) {     // if no value exists associated with the key, return null
			getTimeOut('timeout')
		}
		
	  }
	 

  goBack(e){
    e.preventDefault();
    this.upSession()

    alert(JSON.stringify('ciao'));
    this.props.history.goBack();
  }

  render() {
    return (
      <div class="text-center ">
						   { !isClient()?<NavPublic></NavPublic>:
							<NavPrivate></NavPrivate>}
			<JumbotronWrapper title="" description="">


 


      <div class="text-center ">
<Card >
  <Card.Body>
  <div class="text-center ">
  <Alert  variant={'warning'}>
<Alert.Heading className ="text-center">Panier Modifie</Alert.Heading>

 <div className="d-grid gap-2 m-3"> 
<Button size="lg" variant="outline-danger"  onClick={(e) => {
                this.goBack(e);
              }}>Go Back</Button></div>
     </Alert>   
     </div>
  </Card.Body>
</Card>
</div>
      
      </JumbotronWrapper>
      <Footer></Footer>
      
</div>
    );
  }
}
export default ConfirmModification;
