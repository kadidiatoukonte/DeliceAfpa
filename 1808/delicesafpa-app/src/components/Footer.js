import React from "react"
import ButtonLogInProf from '../components/ButtonLogInProf';


const Footer = () => 

<footer className=" bg-warning font-small text-danger  fixed-bottom "  > 
    <div className="container-fluid text-center text-md-left">
        <div className="row">
            <div className="col-md-4 mt-md-0 mb-3 ">
                
            </div>

            <div className="col-md-4 mb-md-0 mt-3 mb-3">
                <ul className="list-unstyled">
                    <li><ButtonLogInProf></ButtonLogInProf></li>
                </ul>
            </div>
        </div>
    </div>

</footer>

export default Footer;