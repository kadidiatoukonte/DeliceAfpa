import React , { Component } from "react";
import { Link } from 'react-router-dom';
import JumbotronWrapper from '../JumbotronWrapper';
import NavPrivate from '../components/NavPrivate';
import { Clear,  logout,getTimeOut } from '../util';
import Footer from '../components/Footer';
import axios from "axios";
import {Button ,Table} from 'react-bootstrap'

class AccuilClient extends Component {

	constructor(props) {
		super(props);
	
	
	   
		this.state = {
	
		  client:{},
		  idclient:0,
		  commandes: [],
		  commande: {}
		};
	  
		this.goBack = this.goBack.bind(this); 
	}
	
	  	
	
	
	goBack(e){
		e.preventDefault();
		this.upSession()
	
		this.props.history.goBack();
	  }

	  upSession(){

		getTimeOut('timeout')
	  }
	 


	  panier = (e) => {
		e.preventDefault();
		
				this.props.history.push("/panier");
	}

	menu = (e) => {
		e.preventDefault();
		
				this.props.history.push("/menu");
	}


	offre = (e) => {
		e.preventDefault();
		
				this.props.history.push("/offrespecial");
	}

	reservation = (e) => {
		e.preventDefault();
		
				this.props.history.push("/reserver");
	}





	  componentDidMount(){
		this.upSession()
		const item = JSON.parse(localStorage.getItem('timeout') );
		var m =item.value.mail;
		
		this.setState({ mailclient: m });

		axios.post("/delicesafpa/clientinfo",{ "mailclient":m}).then((result) => {
		  this.setState({ client: result.data });
		  this.setState({ idclient: this.state.client.idclient });

		  axios.get("/delicesafpa/findCommandeOnCourseClient/"+this.state.client.idclient).then((result) => {
			this.setState({ commandes: result.data });
		})

		
		})


	}
	
	



	handleLogout = (e) => {
		e.preventDefault();
		logout();
	    Clear();
		localStorage.clear();
		this.props.history.push("/");	
		window.location.reload();
	}
	

	render() {
		return (<div>
			<NavPrivate></NavPrivate>
			background: url('./backprovvisorio.png') no-repeat center center fixed; 

			<JumbotronWrapper title="AccuilClient" description="">
		
			<div>{this.state.client.idclient}</div>
			<div>{this.state.client.nomclient}</div>
			<div>{this.state.client.prenomclient}</div>
			
	
			<Table striped bordered hover>
  <thead>
    <tr>
      <th>Orario</th>
      <th>Adress</th>
      <th>Status</th>

    </tr>
  </thead>
  {this.state.commandes.map((item) => (
  <tbody>
    <tr>

      <td>{item.horaire} - id: {item.idcommande}</td>
	  <td> {item.adresse}</td>

      <td>			{ item.idstatus===1?<div className="d-grid gap-2">  <Button disabled variant="warning">New! </Button ></div>:null
			}

{ item.idstatus===2?<div className="d-grid gap-2">  <Button disabled variant="success">Accepte! </Button ></div>:null
			}


{ item.idstatus===4?<div className="d-grid gap-2">  <Button disabled variant="primary" >Pris! </Button ></div>:null
			}
			
			</td>
    </tr>
    
  </tbody>
  ))}

  
</Table>

<div className="d-grid gap-2 m-5"> <Button size="lg"  variant="warning" onClick={(e) => {
                this.menu(e);
              }}> MENU</Button ></div>



<div className="d-grid gap-2 m-5"> <Button size="lg"  variant="warning" onClick={(e) => {
                this.panier(e);
              }}> PANIER</Button ></div>




<div className="d-grid gap-2 m-5"> <Button size="lg"  variant="warning" onClick={(e) => {
                this.reservation(e);
              }}> RESERVATION</Button ></div>




<div className="d-grid gap-2 m-5"> <Button onClick={(e) => {
                this.offre(e);
              }}  size="lg"  variant="warning" > OFFRE SPECIAL</Button ></div>
		</JumbotronWrapper>

		<div className="d-grid gap-2 m-3"> 
<Button size="lg" variant="outline-danger"  onClick={(e) => {
                this.goBack(e);
              }}>Go Back</Button></div>
		<Footer></Footer>
		</div>
		);
	}
}





export default AccuilClient;
