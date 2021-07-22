import React, { Component } from 'react';
import PropTypes from 'prop-types';
import { Alert, Form, Button, Row, Col } from 'react-bootstrap';
import JumbotronWrapper from './JumbotronWrapper';
import { Link } from 'react-router-dom';
import history from '../util/history';
import axios from "axios";

class Home extends Component {
	state = { selected: [] };

    all = () => {
    

        axios.get("/delicesafpa//allArticle")
      };



	handleChange = (e) => {
		let selected = [];
		for (let i = 0; i < e.target.options.length; i++) {
			if (e.target.options[i].selected) {
				selected.push(e.target.options[i].value);
			}
		}
		this.setState({ selected });
	};

	handleClick = () => {
		localStorage.setItem('roles', JSON.stringify(this.state.selected));
		history.push('/app');
	};

	render() {
		return (
			<JumbotronWrapper title="Home" description="">
				<Link className="nav-link" to="/login">

                


			Back to login
		</Link>

        <form
            onSubmit={this.all}>



<input type="submit"></input>
            </form>
			</JumbotronWrapper>
		);
	}
}

Home.propTypes = {
	
};

Home.defaultProps = { children: (<Link className="nav-link" to="/login">
Back to login
</Link>)};

export default Home;
