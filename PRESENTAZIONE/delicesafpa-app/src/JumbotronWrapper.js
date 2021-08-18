import React from 'react';
import { Container, Jumbotron } from 'react-bootstrap';
import PropTypes from 'prop-types';
const JumbotronWrapper = (props) => {
	return (
		<Container>
			<br></br>			<br></br>
			<br></br>
			<br></br>
			<br></br>
			<br></br>
			<br></br>
			<Jumbotron style={{ marginTop: '50%'} , {marginBottom: '100%'} ,{ paddingTop: '50%' },{}}>
				<h1>{props.title}</h1>
				<div>{props.children}</div>
				<p>{props.description}</p>
		
	

			</Jumbotron>
			<br></br>			<br></br>
			<br></br>
			<br></br>
			<br></br>
			<br></br>
			<br></br>

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
