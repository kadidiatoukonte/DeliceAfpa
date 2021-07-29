import React , { Component }from 'react';
import { Button,OverlayTrigger,Tooltip } from 'react-bootstrap'
import { getPanier,addPanier} from '../util'
import axios from 'axios'
import {  withRouter ,Link} from "react-router-dom";

class ShoppingCardIcone extends Component {
	
  constructor(props) {
    super(props);
   
 this.state = { 
  getPanier: getPanier(),
  sizePanier: 0//this.componentDidMount()
 };
 
}
pushToPanier=()=>{


  this.props.history.push("/panier");
   window.location.reload()
}




//componentDidMount(){
//const a = { idpanier : "35"};
//	axios.post("/delicesafpa/findConcernerPanArtPanier",a).then((result)=>{
//alert(this.state.sizePanier)
  //  return true//result.lenght


  
  /*)*/
		
	//	if(this.state.getPanier){ 
 
 
    
   //.
      
    //then((result) => {if(result.length>0){  
      
      //this.setState({sizePanier:result.length})
      

  
 


  
  
 
  
  
  render() {
		return (
    <div className="ButtonAddtoCard">

<OverlayTrigger
   
      
      overlay={
        <Tooltip id='chart'>
       <strong> Ci sono { this.sizePanier} x nprodotti</strong>
        </Tooltip>
      }
    >
     
     <Link to= "/Panier" >   <Button  type="submit"  variant="trasparent"  onClick={(e)=>this.pushToPanier()
} className="rounded-circle ">
     { 1>0?  

<img  
            src=   {process.env.PUBLIC_URL + '/icons/shoppingcart1.png'} 
              height={50} width={50}
            
              className="d-inline-block align-top"
              
            />
      :

<img  
            src=   {process.env.PUBLIC_URL + '/icons/shoppingcart0.png'} 
              height={50} width={50}
            
              className="d-inline-block align-top"
              
            />}


         
         
      </Button>
      </Link>
    </OverlayTrigger>



    </div>
  );
}
}





export default withRouter(ShoppingCardIcone);