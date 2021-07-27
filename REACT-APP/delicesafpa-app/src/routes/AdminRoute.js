import React from 'react';
import { Route, Redirect } from 'react-router-dom';
import { isAdmin } from '../util';

const AdminRoute = ({component: Component, ...rest}) => {

    return (

        // Show the component only when the user is logged in
        // Otherwise, redirect the user to / page
        <Route {...rest} render={props => (
            isAdmin() ?
                <Component {...props} />
            : <Redirect to="/" />
        )} />
    );
};

export default AdminRoute;