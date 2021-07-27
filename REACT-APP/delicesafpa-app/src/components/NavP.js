import React ,{ Fragment }from 'react';
import { Navbar,Nav } from 'react-bootstrap'
import { Switch } from 'react-router-dom';

import ButtonLogOut from '../components/ButtonLogOut';


const NavP = () => (



<Fragment><div>


    <Navbar bg="dark" variant="dark" expand="lg" sticky="top">    <Navbar.Brand href="#home">private</Navbar.Brand>
                            <Navbar.Toggle aria-controls="basic-navbar-nav" />
                            <Navbar.Collapse id="basic-navbar-nav">
                                <Nav className="mr-auto">
                                <Nav.Link href="/accuiladmin">admin</Nav.Link>

                                <Nav.Link href="/accuilclient">espaceclient</Nav.Link>
                               </Nav>
                                <Nav.Link>  <ButtonLogOut></ButtonLogOut>     </Nav.Link> 
                            </Navbar.Collapse></Navbar>
                            
                           
    <Switch>

    
    </Switch>
</div>
</Fragment>
);

export default NavP;
