import React ,{ Fragment }from 'react';
import { Route} from 'react-router-dom';
import { Switch } from 'react-router-dom';

import Menu from'../components/Menu';

import AboutUs from'../components/AboutUs';
import Contact from'../components/Contact';
import ContactUs from'../components/ContactUs';
import Panier from'../components/Panier';
import Home from'../components/Home';
import OffreSpecial from'../components/OffreSpecial';
import ConfirmModification from'../components/ConfirmModification';

import Inscription from'../client/Inscription';

import LogInClient from'../client/LogInClient';
import LogInProf from'../professionel/LogInProf';
import Reservation from '../client/Reservation';



const PublicRoutes = () => (
<Fragment><div>
                           
    <Switch>
    <Route exact path="/registrationclient" component={Inscription} />
    <Route exact path="/" component={Home} />
    <Route exact path="/loginclient" component={LogInClient} />
    <Route exact path="/loginprof" component={LogInProf} />	
    <Route exact path="/aboutus" component={AboutUs} />	
    <Route exact path="/contact" component={Contact} />	
    <Route exact path="/contactus" component={ContactUs} />	
    <Route exact path="/panier" component={Panier} />	
    <Route exact path="/menu" component={Menu} />	
    <Route exact path="/offrespecial" component={OffreSpecial} />	
    <Route path="/reserver" exact component={Reservation}/>

    <Route exact path="/modifiepanier" component={ConfirmModification} />	
    </Switch>
</div>


</Fragment>
);

export default PublicRoutes;
