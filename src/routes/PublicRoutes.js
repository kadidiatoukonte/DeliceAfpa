import React, { Fragment } from 'react';
import { Link, Route, Switch } from 'react-router-dom';
import JumbotronWrapper from '../components/JumbotronWrapper';
import Login from '../components/Login';
import Home from '../components/Home';
import NotFound from '../components/NotFound';
import { uniqBy } from 'lodash';
import { rolesConfig } from '../config/roles';
import * as Routes from './index';
import { Navbar,Nav,NavDropdown } from 'react-bootstrap'

const Register = () => (
	<JumbotronWrapper title="Register">
		<Link className="nav-link" to="/login">
			Back to login
		</Link>
	</JumbotronWrapper>
);
const ForgotPassword = () => (
	<JumbotronWrapper title="ForgotPassword">
		<Link className="nav-link" to="/login">
			Back to login
		</Link>
	</JumbotronWrapper>
);

const PublicRoutes = ({ match }) => (
	<Fragment>
		<div>
		<Navbar bg="dark" variant="dark" expand="lg" sticky="top">    <Navbar.Brand href="#home">React Bootstrap Navbar</Navbar.Brand>
                                <Navbar.Toggle aria-controls="basic-navbar-nav" />
                                <Navbar.Collapse id="basic-navbar-nav">
                                    <Nav className="mr-auto">
                                    <Nav.Link href="/">Home</Nav.Link>
                                    <Nav.Link href="/forgot-password">forgot-password</Nav.Link>
                                    <Nav.Link href="/register">register</Nav.Link>
                                    <Nav.Link href="/login">login</Nav.Link>
                                    </Nav>
                                    
                                </Navbar.Collapse></Navbar></div>
		<Switch>
			<Route path="/forgot-password" component={ForgotPassword} />
			<Route path="/register" component={Register} />
			<Route exact path="/" component={Home} />
			<Route exact path="/login" component={Login} />
			<Route component={NotFound} />
		</Switch>
	</Fragment>
);

export default PublicRoutes;
