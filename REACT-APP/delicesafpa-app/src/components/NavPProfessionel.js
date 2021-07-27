import React ,{ Fragment }from 'react';
import { Navbar,Nav } from 'react-bootstrap'
import { Switch } from 'react-router-dom';

import ButtonLogOut from '../components/ButtonLogOut';


const NavPProfessionel = () => (



<Fragment><div>


    <Navbar bg="success" variant="dark" expand="lg" fixed="top">    <Navbar.Brand href="#home">{JSON.stringify(localStorage.getItem('role'))}</Navbar.Brand>
                            <Navbar.Toggle aria-controls="basic-navbar-nav" />
                            <Navbar.Collapse id="basic-navbar-nav">
                                <Nav className="mr-auto">
                                <Nav.Link href="/accuiladmin">admin</Nav.Link>
                                <Nav.Link href="">reservation</Nav.Link>
                                <Nav.Link href="">commande</Nav.Link>
                                <Nav.Link href="">carte</Nav.Link>

                                <Nav.Link href="">gestion employes</Nav.Link>
                                <Nav.Link href="">archive</Nav.Link>

                               
                               </Nav>
                                <Nav.Link>  <ButtonLogOut></ButtonLogOut>     </Nav.Link> 
                            </Navbar.Collapse></Navbar>
                            
                           
    <Switch>

    
    </Switch>
</div>
</Fragment>
);

export default NavPProfessionel;
