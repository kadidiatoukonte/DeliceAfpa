import React , { Component } from "react";

import {Carousel} from 'react-bootstrap'


class CarouselAboutus extends Component {
	


	render() {
		return (
			
			
<div class="text-center ">
			  
  <Carousel>
  <Carousel.Item>
    <img
      className="d-block align-center w-30 mt-5"
	  src={require("./caraboutus1.png").default}
      alt="First slide"
    />
    <Carousel.Caption>
      <h3>First slide label</h3>
      <p>Nulla vitae elit libero, a pharetra augue mollis interdum.</p>
    </Carousel.Caption>
  </Carousel.Item>
  <Carousel.Item>
    <img
         className="d-block align-center w-30 mt-5"

      src={require("./caraboutus2.png").default}
      alt="Second slide"
    />

    <Carousel.Caption>
      <h3>Second slide label</h3>
      <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
    </Carousel.Caption>
  </Carousel.Item>
  <Carousel.Item>
    <img  
         className="d-block align-center w-30 mt-5"
         src={require("./caraboutus3.png").default}
      alt="Third slide"
    />

    <Carousel.Caption>
      <h3>Third slide label</h3>
      <p>Praesent commodo cursus magna, vel scelerisque nisl consectetur.</p>
    </Carousel.Caption>
  </Carousel.Item>
</Carousel>

		</div>
		);
	}
}





export default CarouselAboutus;
