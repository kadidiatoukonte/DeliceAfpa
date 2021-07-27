import React from "react";
import FormsLogin from '../forms/FormsLogin';
import {getTimeOut } from '../util';



class LogInClient extends React.Component {

  constructor(props) {
    super(props);
    this.goBack = this.goBack.bind(this); 
  }


	upSession(){
		if (localStorage.getItem('timeout') ) {     // if no value exists associated with the key, return null
			getTimeOut('timeout')
		}
		
	  }
	 
	  componentDidMount(){
		this.upSession()

	}

  goBack(e){
    e.preventDefault();
    this.upSession()

    alert(JSON.stringify('ciao'));
    this.props.history.goBack();
  }

  render() {
    return (
      <div className="LogInClient" >

 <FormsLogin></FormsLogin>
 <button onClick={(e) => {
                this.goBack(e);
              }}>Go Back</button>     
                    
</div>
    );
  }
}
export default LogInClient;
