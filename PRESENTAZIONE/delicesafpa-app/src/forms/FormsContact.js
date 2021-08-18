import React,{Component} from 'react';
import {Form,Button} from 'react-bootstrap';
 
class FormsContact extends Component {
 
    constructor() {
      super();
     
   this.state = { 
   nom: '',
   email: '',
   objet: '' ,
   message:''};
    }
    render() {
      return (
 
        <div class="text-center p-5 ">
        <Form>
           <Form.Group className="mb-3" controlId="formBasicName">
    <Form.Label>Name</Form.Label>
    <Form.Control type="text" placeholder="Name" />
  </Form.Group>
  <Form.Group className="mb-3" controlId="formBasicEmail">
    <Form.Label>Email address</Form.Label>
    <Form.Control type="email" placeholder="Enter email" />
    <Form.Text className="text-muted">
      We'll never share your email with anyone else.
    </Form.Text>
  </Form.Group>
 
 
  <Form.Group className="mb-3" controlId="formBasicObject">
  <Form.Label>Objet</Form.Label>
  <Form.Control type="text" placeholder="Objet" />
  </Form.Group>
 
  <Form.Group className="mb-3" controlId="formBasicObject">
  <Form.Label>Objet</Form.Label>
  <Form.Control type="text" placeholder="Objet" />
  </Form.Group>
 
  <Form.Group className="mb-3" controlId="formBasicMessage">
  <Form.Label>Message</Form.Label>
    <Form.Control as="textarea"  placeholder="Leave a comment here"  style={{ height: '100px' }}  />
    </Form.Group>
        
 
  <Button variant="primary" type="submit">
    Submit
  </Button>
</Form>
</div>



 
        );} } 
 export default FormsContact;