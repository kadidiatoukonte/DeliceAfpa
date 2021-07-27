import React,{Redirect} from "react";
import FormsLoginProf from '../forms/FormsLoginProf';
import { isClient } from '../util';

import { withRouter } from "react-router-dom";


class LogInProf extends React.Component {
  constructor(props) {
    super(props);

    this.goBack = this.goBack.bind(this); // i think you are missing this
 
  
  
  this.state = {
		isLoginClient: isClient()
	}
}
goBack(e){
  e.preventDefault();
  alert(JSON.stringify('ciao'));
  this.props.history.goBack();
}

componentDidMount(){
  if (isClient())    {     this.props.history.goBack();	}
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
