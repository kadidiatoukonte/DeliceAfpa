import React , { Component } from "react";
import JumbotronWrapper from '../JumbotronWrapper';
import Footer from './Footer';
import NavPublic from "./NavPublic";
import NavPrivate from "./NavPrivate";
import {isClient,getTimeOut} from "../util";
import MapContact from "./MapContact";
import {Row,Col,Container,Image} from 'react-bootstrap'
 
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
 
            <JumbotronWrapper title="Contact" >
            <div class=" p-5 ">
            <MapContact></MapContact> </div>
    
    <br></br><br></br><br></br><br></br><br></br> <br></br> <br></br> <br></br><br></br> <br></br> <br></br> <br></br> <br></br>
    <br></br> <br></br> <br></br><br></br> 
    
         
        
        </JumbotronWrapper>
        </div >
        <div class=" p-5 " align="center">
        <div  >
  <table>
      <tr>
           <td><img class="img-fluid "  src=      {process.env.PUBLIC_URL + '/icons/logoLocation.png'}   height={100} width={90} alt="" />

           </td>            
           <td>  
            <p>   Location: 20 Rue du Luxembourg, 59100 Roubaix </p>
            
               </td>  
            
            </tr>  
            <tr>
             <td>	   
                          <img class="img-fluid "  src= {process.env.PUBLIC_URL + '/icons/logoTel.png'}  height={100} width={90} alt="" /> </td>
                          <td>   Call:09/72/72/39/36 
           </td>
           </tr> 
           <tr>  
           <td>  
          
		    <img class="img-fluid " src= {process.env.PUBLIC_URL + '/icons/logoEmail.png'}  height={100} width={90} alt="" />
         </td>  
           <td>
               
         <a href="contactus">Email: delicesafpamail@gmail.com </a>
            </td>
           </tr>
           <tr>   
		    <td><img class="img-fluid " src={process.env.PUBLIC_URL + '/icons/logoOpenHours.png'} height={100} width={90} alt="" /></td><td>Open Hours:Lundi-Samedi 11:00 AM -23:00 </td>
           </tr>
 </table> 

 <table>
		 <tr>  
             <td>
               <a href="./contactus"> <img class="img-fluid " src={process.env.PUBLIC_URL + '/icons/logoFacebook.png'}  height={100} width={90} alt="" /></a> 
               </td>
               <td>

		    <a href="./contactus"> <img class="img-fluid " src={process.env.PUBLIC_URL + '/icons/logoTwitter.png'}  height={100} width={90} alt="" /></a> 
            </td>
		    <td>
            <a href="./contactus"> <img class="img-fluid " src=         {process.env.PUBLIC_URL + '/icons/logoInstagram.png'} height={100} width={90} alt="" /> </a>
            </td>
            
            </tr>       
  </table>       
		    </div>
            </div>
        <Footer></Footer>
 
        
        </div>
        );
    }
}




 
export default Contact;