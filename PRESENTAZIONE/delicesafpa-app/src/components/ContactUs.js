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
import FormsContact from "../forms/FormsContact";
import {Alert,Button} from 'react-bootstrap';
 
class ContactUs extends Component {
    constructor(props) {
        super(props);
    
        this.goBack = this.goBack.bind(this); 
    }
 
    goBack(e){
        e.preventDefault();
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



 
    render() {
        return (<div>
                          { !isClient()?<NavPublic></NavPublic>:
                            <NavPrivate></NavPrivate>}
            <JumbotronWrapper title="ContactUs" description="ContactUs">
                    </JumbotronWrapper>
 
        <FormsContact></FormsContact>
 
        <div className="d-grid gap-2 m-3"> 
<Button size="lg" variant="outline-success"  onClick={(e) => {
                this.goBack(e);
              }}>Go Back</Button></div>
 
              <br></br>
              <br></br>
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




 
export default ContactUs;