import React ,{ Fragment }from 'react';
import { Route} from 'react-router-dom';
import { Navbar,Nav } from 'react-bootstrap'
import { Switch } from 'react-router-dom';
import Home from'../components/Home';
import LogInClient from'../client/LogInClient';
import LogInProf from'../professionel/LogInProf';



const PublicRoutes = () => (
<Fragment><div>
    
    <Navbar bg="danger" variant="dark" expand="lg" fixed="top" >   
     <Navbar.Brand href="#home">      <img
          alt=""
          src="/logo192.png"
          width="30"
          height="30"
          className="d-inline-block align-top"
        />{' '}
      Le Delices dell' Afpa</Navbar.Brand>
                            <Navbar.Toggle aria-controls="basic-navbar-nav" />
                            <Navbar.Collapse id="basic-navbar-nav">
                                <Nav className="mr-auto">
                                <Nav.Link href="">A propos</Nav.Link>
                                <Nav.Link href="">Menu</Nav.Link>
                                <Nav.Link href="">OffreSpecial</Nav.Link>
                                <Nav.Link href="">Contact</Nav.Link>
                                <Nav.Link href="">Panier</Nav.Link>
                                <Nav.Link href="/loginclient">loginclient</Nav.Link>

                                                               </Nav>
                                
                            </Navbar.Collapse></Navbar>
                            <br></br>
<br></br>

<br></br>

<br></br>      
                           
    <Switch>
    <Route exact path="/" component={Home} />
    <Route exact path="/loginclient" component={LogInClient} />
    <Route exact path="/loginprof" component={LogInProf} />	
    
    </Switch>
</div>


</Fragment>
);

export default PublicRoutes;
