import React , { Component } from "react";
import JumbotronWrapper from '../JumbotronWrapper';
import Footer from './Footer';
import NavPublic from "./NavPublic";
import NavPrivate from "./NavPrivate";
import {isClient,getTimeOut} from "../util";
import CarouselAboutus from "./CarouselAboutus";
import {Row,Col,Container,Image} from 'react-bootstrap'

class AboutUs extends Component {
	constructor(props) {
        super(props);
	this.state={
		aboutText : `Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum`,
		aboutDesc : `Lore publishing software like Aldus PageMaker publishing software like Aldus PageMaker including versionsg sg softwaincluding versionsg sg software like Aldus PageMaker including vg software like Aldus PageMaker including voftware like Aldus PageMaker including vof Lorem Ipsum`

	}

	}
	upSession(){
		if (localStorage.getItem('timeout') ) {     // if no value exists associated with the key, return null
			getTimeOut('timeout')
		}
		
	  }
	 
	  componentDidMount(){
		this.upSession()

	}




	render() {                
		return (      <div class="text-center ">

						  { !isClient()?<NavPublic></NavPublic>:
							<NavPrivate></NavPrivate>}



  



			<JumbotronWrapper title="AboutUs" description= {this.state.aboutText}>

<div class="mb-5 ">
			<Container >
  <Row>
    <Col><div className="col-md-12 mb-md-0 mb-3 ">
<CarouselAboutus></CarouselAboutus>
</div>  </Col>
    <Col><div className="col-md-12 mb-md-0 mb-3 mt-5">
<div class="mb-5">
 {this.state.aboutDesc}    
 </div>
 <div>
 {this.state.aboutDesc}    
 </div>
 
  </div>  </Col>
 
 <Col><div className="col-md-12 mb-md-0 mb-3 ">
<CarouselAboutus></CarouselAboutus>
</div>  </Col>
 </Row>
  
</Container>

</div>


		</JumbotronWrapper>
	
		<Footer></Footer>

		</div>
		);
	}
}



export default AboutUs;
