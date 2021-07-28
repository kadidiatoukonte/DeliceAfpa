import React from "react";
import axios from "axios";
import {Card,Button,Col,Row,CardColumns} from 'react-bootstrap'
import NavPublic from "./NavPublic";
import NavPrivate from "./NavPrivate";
import {isClient,getTimeOut} from "../util";
import ButtonAddtoCard from '../components/ButtonAddtoCard';
import Footer from './Footer';



class OffreSpecial extends React.Component {
  constructor() {
    super();

    this.state = {
      articles: [],
      article: {},
      nomarticle: "",
      descriptionarticle: "",
      descriptionoffresp: "",
	  prixarticle: "",
    };
  }

 
  componentDidMount() {
    axios.get("/delicesafpa/findOffrespeciale").then((result) => {
      this.setState({ articles: result.data });
    });
  }

 

  render() {
    return (
      <div className="OffreSpecial">

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
              src={process.env.PUBLIC_URL + '/exampleplat.png'}
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
    <ButtonAddtoCard></ButtonAddtoCard>
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

		<Footer></Footer>

      </div>
    );
  }
}

  
export default OffreSpecial;
