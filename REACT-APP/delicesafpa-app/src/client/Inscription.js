import React from "react";
import FormsInscriptionClient from './FormsIncriptionClient';
import { Link,withRouter } from 'react-router-dom';

class Inscription extends React.Component{

  componentDidMount()
  
  {
    if (localStorage.getItem('client') ) {  this.props.history.push("/");
  }

}


    render() {
        return (
          <div>
    
     <FormsInscriptionClient/>
    
                        
    </div>
        );
      }
    }
    export default withRouter(Inscription);
