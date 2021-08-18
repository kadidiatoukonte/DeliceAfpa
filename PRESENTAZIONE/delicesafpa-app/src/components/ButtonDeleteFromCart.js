import React , { Component }from 'react';
import { Button,OverlayTrigger,Tooltip } from 'react-bootstrap'
import axios from 'axios';
import Panier from './Panier';
import {addToPanier,panierSize} from "../util";

class ButtonDeleteFromCart extends Component {
  constructor() {
    super();
  }












	render() {
		return (

<OverlayTrigger
   
      
      overlay={
        <Tooltip id='delete'>
       <strong> Delete From Cart!</strong>
        </Tooltip>
      }
    >
     
     <Button  type="submit" variant="trasparent"   className="rounded-circle ">
<img  
              src={process.env.PUBLIC_URL + '/icons/cestino.png'} 
              height={50} width={50}
            
              className="d-inline-block align-top"
              
            />
      
         
         
      </Button>
    </OverlayTrigger>



  );
}
}





export default ButtonDeleteFromCart;