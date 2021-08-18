import './App.css';
import{BrowserRouter, Switch} from "react-router-dom";

import Home from'./components/Home';
import Panier from'./components/Panier';
import Contact from'./components/Contact';
import ContactUs from'./components/ContactUs';
import Menu from'./components/Menu';
import AboutUs from'./components/AboutUs';
import OffreSpecial from'./components/OffreSpecial';
import ConfirmModification from'./components/ConfirmModification';





import AdminRoute from './routes/AdminRoute';
import PublicRoute from './routes/PublicRoute';
import PrivateRoute from './routes/PrivateRoute';
import ResponsableRoute from './routes/ResponsableRoute';
import LivreurRoute from './routes/LivreurRoute';

import LogInClient from './client/LogInClient';

import DetailCommandeArticle from './client/DetailCommandeArticle';
import AccuilClient from './client/AccuilClient';
import ConfirmPCommandeClient from './client/ConfirmPCommandeClient';






import LogInProf from './professionel/LogInProf';
import AccuilAdmin from './professionel/AccuilAdmin';
import AccuilLivreur from './professionel/AccuilLivreur';
import AccuilResponsable from './professionel/AccuilResponsable';
import GestionEmploye from './professionel/GestionEmploye';
import GestionMenu from './professionel/GestionMenu';
import Archive from './professionel/Archive';
import GestionCommande from './professionel/GestionCommande';
import GestionReservation from './professionel/GestionReservation';
import DetailCommande from './professionel/DetailCommande';
import FindLivreur from './professionel/FindLivreur';

import GestionCommandeLivreur from './professionel/GestionCommandeLivreur';
import Inscription from './client/Inscription';
import Reservation from './client/Reservation';

function App() {
  return (
    <div class='center'>
    <BrowserRouter>
    <Switch>
    

    <PublicRoute  path="/"exact component={Home} />
    <PublicRoute  path="/loginclient"exact component={LogInClient} />
    <PublicRoute  path="/loginprof"exact component={LogInProf} />	
    <PublicRoute  path="/aboutus"exact component={AboutUs} />	
    <PublicRoute  path="/contact"exact component={Contact} />	
    <PublicRoute  path="/contactus"exact component={ContactUs} />	
    <PublicRoute  path="/panier"exact component={Panier} />	
    <PublicRoute  path="/menu"exact component={Menu} />	
    <PublicRoute  path="/offrespecial"  exact component={OffreSpecial} />
    <PublicRoute exact path="/modifiepanier" component={ConfirmModification} />	
    <PublicRoute exact path="/registrationclient" component={Inscription} />
    <PublicRoute path="/reserver" exact component={Reservation}/>


    
    <PrivateRoute path="/accuilclient" exact component={AccuilClient}/>
    <PrivateRoute path="/detailcommandearticle" exact component={DetailCommandeArticle}/>
    <PrivateRoute path="/confirmcommandeclient" exact component={ConfirmPCommandeClient}/>



    <AdminRoute path="/accuiladmin" exact component={AccuilAdmin}/>
    <AdminRoute path="/gestionemploye" exact component={GestionEmploye}/>
    <AdminRoute path="/gestionmenu" exact component={GestionMenu}/>
    <AdminRoute path="/archiveadmin" exact component={Archive}/>
    <AdminRoute path="/gestioncommande" exact component={GestionCommande}/>
    <AdminRoute path="/gestionreservation" exact component={GestionReservation}/>
    <AdminRoute path="/gestioncommandedetail" exact component={DetailCommande}/>

    <AdminRoute path="/findlivreur" exact component={FindLivreur}/>


    <ResponsableRoute path="/accuilresponsable" exact component={AccuilResponsable}/>
    <ResponsableRoute path="/archiveresponsable" exact component={Archive}/>
    <ResponsableRoute path="/gestioncommanderesponsable" exact component={GestionCommande}/>
    <ResponsableRoute path="/gestionreservationresponsable" exact component={GestionReservation}/>
    <ResponsableRoute path="/gestioncommandedetailresponsable" exact component={DetailCommande}/>
    <ResponsableRoute path="/findlivreurresponsable" exact component={FindLivreur}/>

    
    <LivreurRoute path="/accuillivreur" exact component={AccuilLivreur}/>
    <LivreurRoute path="/archivelivreur" exact component={Archive}/>
    <LivreurRoute path="/gestioncommandelivreur" exact component={GestionCommandeLivreur}/>
    <LivreurRoute path="/gestioncommandedetaillivreur" exact component={DetailCommande}/>


    </Switch>
  

    </BrowserRouter></div>
  );
}

export default App;
