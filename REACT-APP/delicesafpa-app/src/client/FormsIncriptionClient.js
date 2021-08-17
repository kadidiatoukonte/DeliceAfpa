import React,{useState} from 'react';
import axios from "axios";
import sha256 from "sha256";
import { Link } from 'react-router-dom';
import { Route, Redirect,withRouter,History } from 'react-router-dom';

import { loginClient,setTimeOut } from '../util';
import { useHistory } from 'react-router-dom';

 

 const FormsInscriptionClient = (props) => {
  

    const data = {
        nomclient:'',
        prenomclient:'',
        datebirclient:'',
        paysclient:'',
        adresseclient:'',
        complementadrclient:'',
        cpclient:'',
        villeclient:'',
        telclient:'',
        mailclient:'',
        confirmmailclient:'',
        passwordclient:'',
        confirmpasswordclient:''
    }
    const client = {
        nomclient:'',
        prenomclient:'',
        datebirclient:'',
        paysclient:'',
        adresseclient:'',
        complementadrclient:'',
        cpclient:'',
        villeclient:'',
        telclient:'',
        mailclient:'',
        passwordclient:'',
    }
    
    const [loginData,setLoginData]= useState(data);
    const [loginClient,setLoginClient]= useState(client);



    const handleChange = e=> {
         setLoginData({ ...loginData, [e.target.id]: e.target.value });
         setLoginClient({...loginClient,[e.target.id]: e.target.value})
     }


    const {nomclient,prenomclient,datebirclient,paysclient,
    adresseclient,complementadrclient,cpclient,villeclient,
    telclient,mailclient,confirmmailclient,passwordclient,
    confirmpasswordclient} = loginData;

    
    const btn = nomclient === '' || prenomclient ===''|| datebirclient ===''|| 
                paysclient===''|| adresseclient===''|| cpclient===''|| villeclient===''|| 
                telclient===''|| mailclient===''|| passwordclient===''|| passwordclient!==confirmpasswordclient || 
                mailclient!==confirmmailclient  || passwordclient.length < 8 || telclient.length!==10 
                ? <div className="d-grid gap-2 col-6 mx-auto"><button disabled id="colorb" className="" >S'INSCRIRE</button></div> : <div className="d-grid gap-2 col-6 mx-auto"><button id="colorb" className="btn btn-success" type="submit"  to="/" renderAs={Link}>S'INSCRIRE</button></div> 

    const msgmail = mailclient!==confirmmailclient ? <span id="passwordHelpInline" class="text-danger">
    la confirmation n'est pas identique 
    </span> : <span id="passwordHelpInline" class="form-text"/>

    const msgmdp= passwordclient!==confirmpasswordclient ? <span id="passwordHelpInline" class="text-danger">
    la confirmation n'est pas identique 
    </span> : <span id="passwordHelpInline" class="text-danger"/>

    const nbcar= passwordclient.length < 8 ? <span id="passwordHelpInline" className="text-danger">
    8 caractères minimum.
    </span> : <span id="passwordHelpInline" class="text-danger"/>
    
    const tel = telclient.length ===10 || telclient ==='' ?  <span id="passwordHelpInline" class="text-danger"/>:  <span id="passwordHelpInline" className="text-danger">
    Format incorrect.
    </span> 

const setTimeOut = (keyName, keyValue, ttl) => {
    const data = {
        value: keyValue,                  // store the value within this object
        ttl: Date.now() + (ttl * 100000),   // store the TTL (time to live)
    }
    // store data in LocalStorage 
    localStorage.setItem(keyName, JSON.stringify(data));
};



const addClient = (e) => { 
    e.preventDefault();
    axios.post("/delicesafpa/addClient", {
    nomclient: loginData.nomclient,
    prenomclient: loginData.prenomclient,
    datebirclient: loginData.datebirclient,
    paysclient: loginData.paysclient,
    adresseclient: loginData.adresseclient,
    complementadrclient: loginData.complementadrclient,
    cpclient: loginData.cpclient,
    villeclient: loginData.villeclient,
    telclient: loginData.telclient,
    mailclient: loginData.mailclient,
    passwordclient: sha256(loginData.passwordclient),
    }).then((result) => {
       if( result.data === ""){alert("email gia presente")
    
    
       window.location.reload();
    
    }
       else{alert("utente inscritto, effettua il loggin!")
    
       props.history.goBack()  
    
    }

             
                })
                
                
                
          }
        







  
    
    return(
        <div>
            <div className="text-center" id="test">
                <br></br>
                <h2 className="text-danger"> INSCRIPTION </h2>
                <br></br>
                <br></br>
                <form className="align-items-center" onSubmit={addClient} id="FormsInscriptionClient">
                <div>
                <br></br>
                    <h4 className="text-danger">Information personnel</h4>
                    <div className="">
                        <div className="">
                        <label htmlFor="nomclient" className="col-form-label">Nom*</label>
                        </div>
                        <div className="">
                        <input className="" onChange={handleChange} value={nomclient} type="text" id="nomclient" autoComplete="off" required/>
                        </div>
                    </div>

                    <div className="">
                        <div className="">
                        <label className="" htmlFor="prenomclient">Prenom*</label>
                        </div>
                        <div className="">
                        <input className="" onChange={handleChange} value={prenomclient} type="text" id="prenomclient" autoComplete="off" required/>
                        </div>
                    </div>

                    <div className="">
                        <div className="" >
                        <label className="" htmlFor="datebirclient">Date de naissance*</label>
                        </div>
                       <div className="">
                       <input className="" onChange={handleChange} value={datebirclient} type="date" id="datebirclient" autoComplete="off" required/>
                       </div>
                    </div>

                    <div className="">
                        <div className="">
                        <label className="" htmlFor="paysclient">Pays*</label>
                        </div>
                        <div className="">
                        <input className="" onChange={handleChange} value={paysclient} type="text" id="paysclient" autoComplete="off" required/>
                        </div>
                    </div>


                    <div className=" ">
                        <div className="">
                        <label className="" htmlFor="adresseclient">Adresse*</label>
                        </div>
                         <div className="">
                        <input className="" onChange={handleChange} value={adresseclient} type="text" id="adresseclient" autoComplete="off" required/>
                        </div>    
                    </div>

                    <div className="">
                        <div className="">
                        <label className="" htmlFor="complementadrclient">Complement d'adresse</label>
                        </div>
                        <div className="">
                        <input className="" onChange={handleChange} value={complementadrclient} type="text" id="complementadrclient" autoComplete="off" />
                        </div>
                    </div>

                    <div className="">
                        <div className="">
                        <label className="" htmlFor="cpclient">Code Postale*</label>
                        </div>
                        <div className="">
                        <input className="" onChange={handleChange} value={cpclient} type="text" id="cpclient" autoComplete="off" required/>
                        </div>
                    </div>

                    <div className="r">
                        <div className="">
                        <label className="" htmlFor="villeclient">Ville*</label>
                        </div>
                        <div className="">
                        <input className="" onChange={handleChange} value={villeclient} type="text" id="villeclient" autoComplete="off" required/>
                        </div>
                        
                    </div>

                    <div className="">
                        <div className="">
                        <label className="" htmlFor="telclient">Telephone*</label>
                        </div>
                        <div className="">
                        <input className="" onChange={handleChange} value={telclient} type="text" id="telclient" autoComplete="off" required/>
                        </div>
                        <div className="">
                        {tel}   
                        </div> 
                    </div>
                </div>
            
                <div>
                    <h4 className="text-danger">Information de connexion</h4>

                    <div className="">
                        <div className="">
                            <label className="" htmlFor="mailclient">Email*</label>
                        </div>
                        <div className="">
                        <input className="" onChange={handleChange} value={mailclient} type="email" id="mailclient" autoComplete="off" required/>
                        </div> 
                    </div>

                    <div className="">
                        <div className=""> 
                        <label htmlFor="confirmmailclient" className="">Confirmez l'Email*</label>
                        </div>
                        <div className="">
                        <input  className="" onChange={handleChange} value={confirmmailclient} type="email" id="confirmmailclient" autoComplete="off" required/>
                        </div>
                        <div className="">
                        {msgmail}
                        </div>
                    </div>

                    <div className="">
                        <div className="">
                        <label htmlFor="passwordclient" className="">Mot de passe*</label>
                        </div>
                        <div className="">
                        <input className="" onChange={handleChange} value={passwordclient} type="password" id="passwordclient" autoComplete="off" required/>
                        </div>
                        <div className="">
                        {nbcar}
                        </div>
                    </div>

                    <div className="">
                        <div className="">
                        <label htmlFor="confirmpasswordclient" className="">Confirmez mot de passe*</label>
                        </div>
                        <div className="">
                        <input className="" onChange={handleChange} value={confirmpasswordclient} type="password" id="confirmpasswordclient" autoComplete="off" required/>
                        </div>
                        <div className="">
                        {msgmdp}
                        </div>
                    </div>
      
                 </div>  
                 <div>
                     <span className="form-text">
                        * champs obligatoire
                     </span>
                </div>

                

  {btn}
                        <br></br>
                        <br></br>
                </form>``
                <br></br>
                <br></br>
            </div>
        </div>

    )







 }
 export default withRouter(FormsInscriptionClient);