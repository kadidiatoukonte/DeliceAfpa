import React from "react";
import FormsLoginProf from '../forms/FormsLoginProf';
import { isClient, getTimeOut} from '../util';

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
  this.upSession()

}


  render() {


    return (

      <div className="LogInProf" >


ciao prof
<button onClick={(e) => {
                this.goBack(e);
              }}>Go Back</button>

<FormsLoginProf></FormsLoginProf>         
                    
</div>
    );
  }
}
export default withRouter(LogInProf);
