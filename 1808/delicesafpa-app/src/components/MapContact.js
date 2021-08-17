import React, { Component } from 'react';
import { Map, GoogleApiWrapper } from 'google-maps-react';

const mapStyles = {
  width: '70%',
  height: '60%'
};

export class MapContainer extends Component {
  render() {
    return (
      
      <Map
        google={this.props.google}
        zoom={14}
        style={mapStyles}
        initialCenter={
          {
            lat: 50.69325981481827,
            lng: 3.1586737055165304
          }
        }
      />
    );
  }
}

export default GoogleApiWrapper({
  apiKey: ''

})(MapContainer);