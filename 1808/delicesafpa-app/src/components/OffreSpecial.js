import React from "react";
import axios from "axios";
import {Card,Button,Col,Row,CardColumns} from 'react-bootstrap'
import NavPublic from "./NavPublic";
import NavPrivate from "./NavPrivate";
import {isClient,createPanier} from "../util";
import ButtonAddtoCard from '../components/ButtonAddtoCard';
import Footer from './Footer';


class OffreSpecial extends React.Component {
  constructor() {
    super();

    this.state = {
      articles: [],
      article: {},
      idarticle:"",
      nomarticle: "",
      descriptionarticle: "",
      descriptionoffresp: "",
	  prixarticle: "",
    };
  }




  addToPanier = (id) => {

    axios.post("/delicesafpa/findConcernerAddOne", {
      
          "idpanier": JSON.stringify(localStorage.getItem('panier'))
     ,
 
          "idarticle": JSON.stringify(id)
    
  }).then((result) => {


  id.preventDefault();}    
   
  )

      
}
  


 
  componentWillMount() {
    createPanier()
    axios.get("/delicesafpa/findOffrespeciale").then((result) => {
      this.setState({ articles: result.data });
    });
  }

 

  render() {
    return (
      <div className="OffreSpecial" align="center">

       	  { !isClient()?<NavPublic></NavPublic>:
							<NavPrivate></NavPrivate>}
<br></br><br></br>

 
    
	  <div class="m-5 p-5 ">    <ul>

    
          <table className="table">

            {this.state.articles.map((item) => (
              <tbody>
                <tr>
			
                  <th>
			
		<Card
>
    <Card.Img     
              src = {require("./Slow_food.png").default}//{process.env.PUBLIC_URL + '/exampleplat.png'}
              alt=""
              className=" align-top"
              
             />
  </Card>
  <Card className="text-center">
    <blockquote className="blockquote mb-0 card-body">
      <p>
	  {item.nomarticle}   	  
      </p>
	  <div class="m-3">
	  <small className="text-muted">
      {item.descriptionarticle}
        </small>
		</div>
      <div >
        <small className="text-muted">
		{item.descriptionoffresp}
        </small>


      </div>
	  <small className="text-muted">
	  <cite title="Source Title">{item.prixarticle} €</cite></small>
  <div  className="text-center">
   
  <form   onSubmit={(e) => {this.addToPanier(item.idarticle)}}>
    <ButtonAddtoCard></ButtonAddtoCard>
    </form>
    
    </div>  
    </blockquote>
  </Card>
				  
				  </th>
                  
                </tr>
              </tbody>
            ))}
          </table>
          
         
        </ul>

		</div>	
  

<div classs="mb-5">
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
<br></br>
<br></br>
<br></br>
<br></br>
<br></br>
<br></br>
</div>

		<Footer></Footer>

      </div>
    );
  }
}

  
export default OffreSpecial;
