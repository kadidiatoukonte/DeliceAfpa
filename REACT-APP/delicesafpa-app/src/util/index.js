const admin = 'admin';
const responsable = 'responsable';
const livreur = 'livreur';
const client = 'client';

//TIME-OUT////TIME-OUT////TIME-OUT////TIME-OUT////TIME-OUT//

export const setTimeOut = (keyName, keyValue, ttl) => {
    const data = {
        value: keyValue,                  // store the value within this object
        ttl: Date.now() + (ttl * 1000),   // store the TTL (time to live)
    }
    // store data in LocalStorage 
    localStorage.setItem(keyName, JSON.stringify(data));
};

//TIME-OUT////TIME-OUT////TIME-OUT////TIME-OUT////TIME-OUT//

export const getTimeOut = (keyName) => {
    if (!localStorage.getItem(keyName) ) {     // if no value exists associated with the key, return null
        window.location.reload();
        return null;
    }
 else{
        const item = JSON.parse(localStorage.getItem(keyName) );
 var date =new Date(item.ttl);
    var dateNow =new Date(Date.now());
    // If TTL has expired, remove the item from localStorage and return null
    if (dateNow > date) {
        Clear()
        return null;
    }else{      
    const item = JSON.parse(localStorage.getItem('timeout') );
 
    setTimeOut('timeout',  // keyName
     item.value,    // keyValue
    15   // ttl in seconds
   );
    // return data if not expired
    return item.value;
}}};

//TIME-OUT////TIME-OUT////TIME-OUT////TIME-OUT////TIME-OUT////TIME-OUT//




//ROLE-AUTH////ROLE-AUTH////ROLE-AUTH////ROLE-AUTH////ROLE-AUTH////ROLE-AUTH//
//CLIENT?
export const isClient = () => {
    if (JSON.stringify(localStorage.getItem('role')).includes('client') ) {
        return true;
    }
    return false;
}
//ADMIN?
export const isAdmin = () => {
    if (JSON.stringify(localStorage.getItem('role')).includes('admin') ) {
        return true;
    }
    return false;
}
//COMMON-EMP-responsable?
export const isResponsable = () => {
    if (JSON.stringify(localStorage.getItem('role')).includes('responsable') ) {
        return true;
    }
    return false;
}
//livreur?
export const isLivreur = () => {
    if (JSON.stringify(localStorage.getItem('role')).includes('livreur') ) {
        return true;
    }
    return false;
}

//sospendu?
export const isSospendu = () => {
    if (JSON.stringify(localStorage.getItem('role')).includes('sospendu') ) {
        return true;
    }
    return false;
}

//ROLE-AUTH////ROLE-AUTH////ROLE-AUTH////ROLE-AUTH////ROLE-AUTH////ROLE-AUTH//

//login//logout//login//logout//login//logout//login//logout//login//logout

//login//logout//client

export const loginClient = () => {
    localStorage.setItem(client, 'client');
}
export const logout = () => {
    Clear()
}
//login//logout//admin
export const loginAdmin = () => {
    localStorage.setItem(admin, 'admin');
}

//login//logout//responsable
export const loginResponsable = () => {
    localStorage.setItem(responsable, 'responsable');
}


//login//logout//livreur


export const loginLivreur = () => {
    localStorage.setItem(livreur, 'livreur');
}

//login//logout//sospendu


export const sospendu = () => {
    Clear()
}

/////////////////////

export const Clear = () => {
    localStorage.clear();
    window.location.reload();

}

