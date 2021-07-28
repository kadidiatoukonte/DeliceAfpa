import React from "react"
import ButtonLogInProf from '../components/ButtonLogInProf';


const Footer = () => 

<footer className=" bg-warning font-small text-danger pt-4 "  > 
    <div className="container-fluid text-center text-md-left">
        <div className="row">
            <div className="col-md-4 mt-md-0 mt-3 ">
                
            </div>

            <hr className="clearfix w-100 d-md-none pb-0"/>

            <div className="col-md-4 mb-md-0 mb-3">
                <h5 className="text-uppercase">Links</h5>
                <ul className="list-unstyled">
                    <li><a href="#!">Link 1</a></li>
                    <li><a href="#!">Link 2</a></li>
                   
                </ul>
            </div>

            <div className="col-md-4 mb-md-0 mb-3">
                <ul className="list-unstyled">
                    <li><ButtonLogInProf></ButtonLogInProf></li>
                </ul>
            </div>
        </div>
    </div>

    <div className="footer-copyright text-center py-3">© 2020 Copyright:
        <a href="https://mdbootstrap.com/"> cda.com</a>
    </div>

</footer>

export default Footer;