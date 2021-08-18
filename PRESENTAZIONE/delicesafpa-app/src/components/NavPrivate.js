import React ,{ Fragment }from 'react';
import { Navbar,Nav } from 'react-bootstrap'
import { Switch } from 'react-router-dom';

import ButtonLogOut from './ButtonLogOut';


const NavPublic = () => (



<Fragment><div>


    <Navbar bg="warning" variant="light" expand="lg" fixed="top">    <Navbar.Brand href="/accuilClient"> 
    <img
              src={require("./logoDelicesAfpa.png").default}
              height={100} width={90}
              alt=""
              className="d-inline-block align-top"
              
            /></Navbar.Brand>
                            <Navbar.Toggle aria-controls="basic-navbar-nav" />
                            <Navbar.Collapse id="basic-navbar-nav">
                                <Nav className="mr-auto">
                                <Nav.Link href="/aboutus">A propos</Nav.Link>
                                <Nav.Link href="/menu">Menu</Nav.Link>
                                <Nav.Link href="/offrespecial">OffreSpecial</Nav.Link>
                                <Nav.Link href="/contact">Contact</Nav.Link>
                                <Nav.Link href="/contactus">Messagge</Nav.Link>
                                <Nav.Link href="/panier">Panier</Nav.Link>
                                <Nav.Link href="/reserver">reservation</Nav.Link>

                               </Nav>
                                <Nav.Link >  <ButtonLogOut></ButtonLogOut>     </Nav.Link> 
                            </Navbar.Collapse></Navbar>
                            
                           
    <Switch>

    
    </Switch>
</div>
</Fragment>
);

export default NavPublic;
