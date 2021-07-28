import React from "react";
import FormsLogin from '../forms/FormsLogin';
import {getTimeOut,Clear } from '../util';
import {Spinner} from 'react-bootstrap'
import {Alert,Button} from 'react-bootstrap';



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
<Alert  variant={'danger'}>
<Alert.Heading className ="text-center">Hey, nice to see you</Alert.Heading>
 <FormsLogin></FormsLogin>
 <div className="d-grid gap-2 m-3"> 
<Button size="lg" variant="outline-danger"  onClick={(e) => {
                this.goBack(e);
              }}>Go Back</Button></div>
 <Spinner animation="border" variant="danger" />   
     </Alert>               
</div>
    );
  }
}
export default LogInClient;
