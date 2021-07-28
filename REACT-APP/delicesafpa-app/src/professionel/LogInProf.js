import React from "react";
import FormsLoginProf from '../forms/FormsLoginProf';
import { isClient, getTimeOut, Clear} from '../util';
import {Alert,Button} from 'react-bootstrap';
import { withRouter } from "react-router-dom";


class LogInProf extends React.Component {
  constructor(props) {
    super(props);

    this.goBack = this.goBack.bind(this); 
 
  
  
  this.state = {
		isLoginClient: isClient()
	}
}



goBack(e){
  e.preventDefault();
  alert(JSON.stringify('ciao'));
  this.props.history.goBack();
}

upSession(){
  if (localStorage.getItem('timeout') ) { 
    
    // if no value exists associated with the key, return null
    if (isClient())    {   
      this.props.history.goBack();	}
    
    
    else{
    
    getTimeOut('timeout')
  }
}
  }
 
  componentDidMount(){
    if (localStorage.getItem('timeout') ) { localStorage.clear()}

}


  render() {


    return (

      <div className="LogInProf" >


<Alert  variant={'success'}>
<Alert.Heading className ="text-center">Hey, nice to see you</Alert.Heading>

<FormsLoginProf></FormsLoginProf> 
<div className="d-grid gap-2 m-3"> 
<Button size="lg" variant="outline-success"  onClick={(e) => {
                this.goBack(e);
              }}>Go Back</Button></div>
</Alert>              
</div>
    );
  }
}
export default withRouter(LogInProf);
