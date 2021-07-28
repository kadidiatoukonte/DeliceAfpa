import React , { Component }from 'react';
import { Button } from 'react-bootstrap'


class ButtonAddtoCard extends Component {
	render() {
		return (
    <div className="ButtonAddtoCard">

      <Button  variant="outline-warning" >
<img
              src={require("./addpanier.png").default}
              height={50} width={50}
            
              className="d-inline-block align-top"
              
            />
      
         
         
      </Button>
    </div>
  );
}
}





export default ButtonAddtoCard;