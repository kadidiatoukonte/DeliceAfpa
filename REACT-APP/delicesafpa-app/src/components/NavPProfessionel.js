import React ,{ Fragment }from 'react';
import { Navbar,Nav } from 'react-bootstrap'
import { Switch } from 'react-router-dom';
import { isAdmin,isLivreur,isResponsable } from '../util';

import ButtonLogOut from '../components/ButtonLogOut';


const NavPProfessionel = () => (



<Fragment><div>


    <Navbar bg="success" variant="dark" expand="lg" fixed="top">    <Navbar.Brand href="#home">{JSON.stringify(localStorage.getItem('role'))}</Navbar.Brand>
                            <Navbar.Toggle aria-controls="basic-navbar-nav" />
                            <Navbar.Collapse id="basic-navbar-nav">
                                <Nav className="mr-auto">
                                { isAdmin()? <Nav.Link href="/accuiladmin"> acc admin </Nav.Link>:<div></div>}
                                {  isResponsable()?    <Nav.Link href="/accuilresponsable">acc resp</Nav.Link>:<div></div>}
                                { isLivreur()?   <Nav.Link href="/accuillivreur">acc livreur</Nav.Link>:<div></div>}


                             { isAdmin()? <Nav.Link href="/gestioncommande">gestioncommandeadmin</Nav.Link>:<div></div>}
                             { isAdmin()? <Nav.Link href="/gestionreservation">gestionreservationadmin</Nav.Link>:<div></div>}
                             { isResponsable()? <Nav.Link href="/gestioncommanderesponsable">gestioncommanderesponsable</Nav.Link>:<div></div>}
                             { isResponsable()? <Nav.Link href="/gestionreservationresponsable">gestionreservationresponsable</Nav.Link>:<div></div>}
                             { isLivreur()?   <Nav.Link href="/gestioncommandelivreur">gestioncommandelivreur</Nav.Link>:<div></div>}

                             
                             { isAdmin()?   <Nav.Link href="/gestionemploye">gestion employes</Nav.Link>:<div></div>}
                             { isAdmin()?   <Nav.Link href="/gestionmenu">gestion menu</Nav.Link>:<div></div>}

                             { isAdmin()? <Nav.Link href="/archiveadmin"> archive admin </Nav.Link>:<div></div>}
                                {  isResponsable()?    <Nav.Link href="/archiveresponsable">archive resp</Nav.Link>:<div></div>}
                                { isLivreur()?   <Nav.Link href="/archivelivreur">archive livreur</Nav.Link>:<div></div>}
                               
                               </Nav>
                                <Nav.Link>  <ButtonLogOut></ButtonLogOut>     </Nav.Link> 
                            </Navbar.Collapse></Navbar>
                            
                           
    <Switch>

    
    </Switch>
</div>
</Fragment>
);

export default NavPProfessionel;
