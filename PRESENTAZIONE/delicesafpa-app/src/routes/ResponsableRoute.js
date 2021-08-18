import React,  { useEffect } from 'react';
import { Route, Redirect } from 'react-router-dom';
import { Clear, isResponsable } from '../util';

const ResponsableRoute = ({component: Component, ...rest}) => {



 //   useEffect Hook as componentDidMount, componentDidUpdate, and componentWillUnmount combined
// panier


    useEffect(() => { if( !isResponsable()){      Clear()}
      }, []);

    return (

// rest parameter syntax allows a function to accept an indefinite number of arguments as an array
        // Show the component only when the user is logged in
        // Otherwise, redirect the user to /? page
        <Route {...rest} render={props => (
            isResponsable() ?
                <Component {...props} />
            : <Redirect to="/loginprof" /> 
           
        )} />
        );


};

export default ResponsableRoute;