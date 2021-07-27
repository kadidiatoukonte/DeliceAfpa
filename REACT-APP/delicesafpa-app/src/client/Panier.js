import React , { Component } from "react";
import { Link } from 'react-router-dom';
import JumbotronWrapper from '../JumbotronWrapper';

class Panier extends Component {


	render() {
		return (
			<JumbotronWrapper title="Panier" description="">
				<Link className="nav-link" to="/">

                


			Back to login
		</Link>

   
		</JumbotronWrapper>
		);
	}
}



Panier.propTypes = {
	
};

Panier.defaultProps = { children: (<Link className="nav-link" to="/">
é cambiatp</Link>)};

export default Panier;
