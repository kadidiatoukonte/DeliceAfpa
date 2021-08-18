import React from "react";
import FormsLogin from '../forms/FormsLogin';
import {getTimeOut,Clear } from '../util';
import {Spinner} from 'react-bootstrap'
import {Alert,Button,Table,Tab,Tabs,Field} from 'react-bootstrap';
import {Card,Col,Row,CardColumns,Form} from 'react-bootstrap'
import JumbotronWrapper from '../JumbotronWrapper';
import Footer from '../components/Footer';
import NavPublic from "../components/NavPublic";
import NavPrivate from "../components/NavPrivate";
import {isClient} from "../util";
import axios from "axios";
import TimePicker from 'react-bootstrap-time-picker';
import {  withRouter } from "react-router-dom";
import { FormControl } from "react-bootstrap";

class FormsReservationClient extends React.Component {

  constructor(props) {
    super(props);


   
    this.state = {
      
      client:{},
      idclient:0,
      nomclient:"",
      mailclient:"",
      date:"",    
      time: 0 ,
      place:0
    };
    this.handleTimeChange = this.handleTimeChange.bind(this);


    this.goBack = this.goBack.bind(this); 
  }
	upSession(){
		if (localStorage.getItem('timeout') ) {     // if no value exists associated with the key, return null
			getTimeOut('timeout')
		}
		 
	  }
	 

  handleTimeChange(time) {
    console.log(time);     // <- prints "3600" if "01:00" is picked
    this.setState({ time });
  }
  handleDateChange() {
  alert(""+new Date().toLocaleString())
  }

  componentWillMount() {
    this.upSession()
}


	  
	 

  goBack(e){
    e.preventDefault();
    this.upSession()

    this.props.history.goBack();
  }



  addReservation = (e) =>{ 
    e.preventDefault();
    if(!isClient()){ 
      
      alert("effettua loggin!")
      this.props.history.push("/loginclient");
    
    }else{
/*	private String datereservation;
	private int horaire;
	private int nbreplacereservation;
	private String idclient;*/ 
/*
const item = JSON.parse(localStorage.getItem('timeout') );
  var m =item.value.mail;
  this.setState({ mailclient: m });
axios.post("/delicesafpa/addreservation",
{ "datereservation":this.state.date,
"horaire": this.state.time ,
"nbreplacereservation":this.state.place,
"idclient" :this.state.idclient

}

).then((result) => {

/*
axios.post("/delicesafpa/addADDtraiterreservation",
{ "idreservation":result.data.idreservation,
"idemploye": 1,
"idstatus" :1,
}



)




alert("comanda riservata")
this.props.history.push("/accuilclient");	

}



)}

*/}
}




  render() {
    return (
      <div class="text-center ">
						   { !isClient()?<NavPublic></NavPublic>:
							<NavPrivate></NavPrivate>}
			<JumbotronWrapper title="Reservation" description="">


 


      <div class="text-center ">

    
    






  

  <Form  onSubmit={this.addReservation} >
  


  <Col className="mb-5 ">


  <Form.Group as={Col} controlId="formGridZip">
      <Form.Label>Place</Form.Label>

     <div> <input  type="number" id="tentacles" name="tentacles"
       min="1" max="10"></input></div>
    </Form.Group>

    <Form.Group as={Col} controlId="formGridZip">
      <Form.Label>Date</Form.Label>
      <div>   
      <input type="date"  onChange={this.handleDateChange} >
</input>
       </div>
    </Form.Group>

    <Form.Group as={Col} controlId="formGridH">
      <Form.Label>Heure</Form.Label>
      <TimePicker onChange={this.handleTimeChange} value={this.state.time} start="19:00" end="23:00" step={30} />

    </Form.Group>
  </Col>
  
  
  

  <Button variant="primary" type="submit">
    Submit
  </Button>
 
</Form>






</div>







      </JumbotronWrapper>
      <div className="d-grid gap-2 m-3"> 
<Button size="lg" variant="outline-danger"  onClick={(e) => {
                this.goBack(e);
              }}>Go Back</Button></div>
      <br></br>
      <br></br>

      <br></br>

      <br></br>

      <br></br>

      <br></br>

      <br></br>

      <br></br>


      <Footer></Footer>

</div>
    );
  }
}
export default withRouter(FormsReservationClient);
