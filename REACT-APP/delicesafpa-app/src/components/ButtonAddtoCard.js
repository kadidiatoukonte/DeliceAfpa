import React , { Component }from 'react';
import { Button,OverlayTrigger,Tooltip } from 'react-bootstrap'


class ButtonAddtoCard extends Component {
	render() {
		return (
    <div className="ButtonAddtoCard">

<OverlayTrigger
   
      
      overlay={
        <Tooltip id='buttonaddchart'>
       <strong> add to panier!</strong>
        </Tooltip>
      }
    >
     
     <Button  type="submit" variant="trasparent"   className="rounded-circle ">
<img  
              src={process.env.PUBLIC_URL + '/icons/shoppingcartadd.png'} 
              height={50} width={50}
            
              className="d-inline-block align-top"
              
            />
      
         
         
      </Button>
    </OverlayTrigger>



    </div>
  );
}
}





export default ButtonAddtoCard;