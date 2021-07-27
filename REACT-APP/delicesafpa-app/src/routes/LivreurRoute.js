import React from 'react';
import { Route, Redirect } from 'react-router-dom';
import { isLivreur } from '../util';

const LivreurRoute = ({component: Component, ...rest}) => {

    return (

        // Show the component only when the user is logged in
        // Otherwise, redirect the user to / page
        <Route {...rest} render={props => (
            isLivreur() ?
                <Component {...props} />
            : <Redirect to="/" />
        )} />
    );
};

export default LivreurRoute;