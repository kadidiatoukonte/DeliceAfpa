import React from "react";
import FormsLogin from '../forms/FormsLogin';
import {getTimeOut,Clear } from '../util';
import {Spinner} from 'react-bootstrap'
import {Alert,Button} from 'react-bootstrap';
import { Link } from 'react-router-dom';



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
      if (localStorage.getItem('timeout') ) { localStorage.clear()}

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
      <br></br>  
      <br></br>
      <br></br>  
      <br></br>  
      <br></br>  
      <br></br>  
      <br></br>  
      <br></br>  
      <br></br>  
      <br></br>  

<Alert  variant={'light'}>
<Alert.Heading className ="text-center">Hey, nice to see you</Alert.Heading>
 <FormsLogin></FormsLogin>
 <div className="d-grid gap-2 m-3"> 
<Button size="lg" variant="warning"  onClick={(e) => {
                this.goBack(e);
              }}>Go Back</Button></div>
   
     </Alert>               
</div>
    );
  }
}
export default LogInClient;
