import React , { Component }from 'react';
import { Button,OverlayTrigger,Tooltip } from 'react-bootstrap'
import { getPanier} from '../util'
import axios from 'axios'

class ShoppingCardIcone extends Component {
	
  constructor() {
    super();
   
 this.state = { 
  getPanier: getPanier(),
  sizePanier: "0"
 };
 
}




componentDidMount(){
  const p = 35;//JSON.stringify(localStorage.getItem('panier'));
	axios.get("/delicesafpa/findConcernerPanArtPanier",p)
		
		if(this.state.getPanier){
 
 
    
   //.
      
    //then((result) => {if(result.length>0){  
      
      //this.setState({sizePanier:result.length})
      
      
      return true; }   
    else{
   
      
      return false;}

      		}/*)  }*/


  
  
 
  
  
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
     
     <Button  type="submit"  variant="trasparent"   className="rounded-circle ">
     { this.componentDidMount()?  

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
    </OverlayTrigger>



    </div>
  );
}
}





export default ShoppingCardIcone;