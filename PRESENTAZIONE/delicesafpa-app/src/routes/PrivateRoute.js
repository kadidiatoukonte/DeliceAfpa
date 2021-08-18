import React from 'react';
import { Route, Redirect } from 'react-router-dom';
import { isClient } from '../util';

const PrivateRoute = ({component: Component, ...rest}) => {

    return (

        // Show the component only when the user is logged in
        // Otherwise, redirect the user to /signin page
        <Route {...rest} render={props => (
            isClient() ?
                <Component {...props} />
            : <Redirect to="/loginclient" />
        )} />
    );
};

export default PrivateRoute;