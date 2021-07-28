import React ,{ Fragment }from 'react';
import { Navbar,Nav } from 'react-bootstrap'
import { Switch } from 'react-router-dom';



const NavP = () => (
    



<Fragment><div>


    <Navbar bg="warning" variant="light" expand="lg" fixed="top">    <Navbar.Brand href=""> 
    <img
              src={require("./Slow_food.png").default}
              height={100} width={90}
              alt=""
              className="d-inline-block align-top"
              roundedCircle
            />
  
      
      </Navbar.Brand>
                            <Navbar.Toggle aria-controls="basic-navbar-nav" />
                            <Navbar.Collapse id="basic-navbar-nav">
                                <Nav className="mr-auto">
                                <Nav.Link href="/aboutus">A propos</Nav.Link>
                                <Nav.Link href="/menu">Menu</Nav.Link>
                                <Nav.Link href="/offrespecial">OffreSpecial</Nav.Link>
                                <Nav.Link href="/contact">Contact</Nav.Link>
                                <Nav.Link href="/contactus">Messagge</Nav.Link>
                                <Nav.Link href="/panier">Panier</Nav.Link>
                                <Nav.Link href="/loginclient">loginclient</Nav.Link>
                               </Nav>
                            </Navbar.Collapse></Navbar>
                            
                           
    <Switch>

    
    </Switch>
</div>
</Fragment>
);

export default NavP;




