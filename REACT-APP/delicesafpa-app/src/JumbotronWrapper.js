import React from 'react';
import { Container, Jumbotron } from 'react-bootstrap';
import PropTypes from 'prop-types';
const JumbotronWrapper = (props) => {
	return (
		<Container>
			<Jumbotron style={{ marginTop: '30%'} , {marginBottom: '80%'} ,{ paddingTop: '30%' }}>
				<h1>{props.title}</h1>
				<div>{props.children}</div>
				<p>{props.description}</p>
				

			</Jumbotron>
		</Container>
	);
};
JumbotronWrapper.propTypes = {
	title: PropTypes.string.isRequired,
	description: PropTypes.string
};

JumbotronWrapper.defaultProps = {
	description: ``
};

export default JumbotronWrapper;
