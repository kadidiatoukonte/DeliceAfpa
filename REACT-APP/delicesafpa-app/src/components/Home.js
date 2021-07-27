import React , { Component } from "react";
import { Link } from 'react-router-dom';
import JumbotronWrapper from '../JumbotronWrapper';
import ButtonLogOut from "../components/ButtonLogOut";


class Home extends Component {






	render() {
		return (
			<JumbotronWrapper title="Home" description="">
				<Link className="nav-link" to="/">

                <ButtonLogOut></ButtonLogOut>


			Back to login
		</Link>

   
		</JumbotronWrapper>
		);
	}
}



Home.propTypes = {
	
};

Home.defaultProps = { children: (<Link className="nav-link" to="/">
é cambiatp</Link>)};

export default Home;
