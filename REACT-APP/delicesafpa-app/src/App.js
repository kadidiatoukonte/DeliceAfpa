import './App.css';
import{BrowserRouter, Switch} from "react-router-dom";
import Home from'./components/Home';
import Footer from'./components/Footer';

import Panier from'./client/Panier';
import AccuilClient from'./client/AccuilClient';

import AdminRoute from './routes/AdminRoute';
import PublicRoute from './routes/PublicRoute';
import PrivateRoute from './routes/PrivateRoute';
import ResponsableRoute from './routes/ResponsableRoute';
import LivreurRoute from './routes/LivreurRoute';

import LogInClient from './client/LogInClient';
import LogInProf from './professionel/LogInProf';

import AccuilAdmin from './professionel/AccuilAdmin';
import AccuilLivreur from './professionel/AccuilLivreur';
import AccuilResponsable from './professionel/AccuilResponsable';


function App() {
  return (
    <div class='center'>
    <BrowserRouter>
    <Switch>
    
    <PublicRoute path="/" exact component={Home}/>
    <PublicRoute path="/loginclient" exact component={LogInClient}/>
    <PublicRoute path="/loginprof" exact component={LogInProf}/>
 
 
 
    <PrivateRoute path="/panier" exact component={Panier}/>
    <PrivateRoute path="/accuilclient" exact component={AccuilClient}/>
    
    
    <AdminRoute path="/accuiladmin" exact component={AccuilAdmin}/>
    <ResponsableRoute path="/accuilresponsable" exact component={AccuilResponsable}/>
    <LivreurRoute path="/accuillivreur" exact component={AccuilLivreur}/>


    </Switch>
  
    <Footer></Footer>

    </BrowserRouter></div>
  );
}

export default App;
