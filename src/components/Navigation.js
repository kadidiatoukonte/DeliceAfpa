import React, { Component } from 'react';
import { Navbar, Nav, Button } from 'react-bootstrap';
import { Link } from 'react-router-dom';
import PropTypes from 'prop-types';
import history from '../util/history';

class Navigation extends Component {
	handleLogout = () => {
		localStorage.removeItem('roles');
		history.push('/');
	};

	render() {
		return (
			<div>
			<Navbar bg="dark" variant="dark" expand="lg" sticky="top">    <Navbar.Brand href="#home">React Bootstrap Navbar</Navbar.Brand>
									<Navbar.Toggle aria-controls="basic-navbar-nav" />
									<Navbar.Collapse id="basic-navbar-nav">
									<Nav className="mr-auto">
					{this.props.routes.map((route) => (
						<Link
							key={route.url}
							className="nav-link"
							to={`${this.props.path}${route.url}`}
						>
							{route.title}
						</Link>
					))}
				</Nav>
				<Button onClick={this.handleLogout}>Logout</Button>
										
									</Navbar.Collapse></Navbar>
		
			</div>
		);
	}
}

Navigation.propTypes = {
	routes: PropTypes.arrayOf(
		PropTypes.shape({
			url: PropTypes.string.isRequired,
			title: PropTypes.string.isRequired
		})
	).isRequired,
	path: PropTypes.string.isRequired
};

export default Navigation;
