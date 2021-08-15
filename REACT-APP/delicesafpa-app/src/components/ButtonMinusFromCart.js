import React , { Component }from 'react';
import { Button,OverlayTrigger,Tooltip } from 'react-bootstrap'


class ButtonMinusFromCart extends Component {
  constructor() {
    super();
  }












	render() {
		return (

<OverlayTrigger
   
      
      overlay={
        <Tooltip id='delete'>
       <strong> Delete One From Cart!</strong>
        </Tooltip>
      }
    >
     
     <Button  type="submit" variant="trasparent"   className="rounded-circle ">
<img  
              src={process.env.PUBLIC_URL + '/icons/minusshoppingcart.png'} 
              height={50} width={50}
            
              className="d-inline-block align-top"
              
            />
      
         
         
      </Button>
    </OverlayTrigger>



  );
}
}





export default ButtonMinusFromCart;