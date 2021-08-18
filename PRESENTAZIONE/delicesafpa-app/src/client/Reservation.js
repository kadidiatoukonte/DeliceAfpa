import React from "react";
import FormsReservationClient from './FormsReservationClient';
import NavPublic from "../components/NavPublic";
import NavPrivate from "../components/NavPrivate";
import {isClient,getTimeOut} from "../util";
class Reservation extends React.Component{
    render() {
        return (
          <div>
          {!isClient()?<NavPublic></NavPublic>:
							<NavPrivate></NavPrivate>}

              <br></br>
              <br></br>
              <br></br>
              <br></br>
              <br></br>
    
     <FormsReservationClient/>
             
                        
    </div>
        );
      }
    }
    export default Reservation;