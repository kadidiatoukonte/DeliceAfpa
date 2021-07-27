import React from 'react';
import { Route, Redirect } from 'react-router-dom';
import { isResponsable } from '../util';

const ResponsableRoute = ({component: Component, ...rest}) => {

    return (

        // Show the component only when the user is logged in
        // Otherwise, redirect the user to / page
        <Route {...rest} render={props => (
            isResponsable() ?
                <Component {...props} />
            : <Redirect to="/" />
        )} />
    );
};

export default ResponsableRoute;