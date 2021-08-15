// Render Prop
 import React,{Component} from 'react';
 import { Formik, Form, Field, ErrorMessage } from 'formik';
 import axios from "axios";
 import { withRouter } from "react-router-dom";
 import sha256 from "sha256";
 import { loginClient,setTimeOut } from '../util';
 import {Spinner,Button} from 'react-bootstrap'


 
 class FormsLogin extends Component {

  constructor() {
    super();
   
 this.state = { 
 nom: '',
 email: '',
 password: '' ,
 role:''};
  }


  



   handleLogin = () => {
		
    loginClient();
   
}
  getLogiIn = () => {
   
    axios.post("/delicesafpa/findclientMailclient", {
      mailclient:this.state.email ,
      passwordclient:this.state.password,
    
    }).then((result) => {
      
      if(result.data===true){ 
        
        this.handleLogin();
       
        setTimeOut(
          'timeout',                                    // keyName
          { mail: this.state.email, pass: 'pass' },    // keyValue
         200                                     // ttl in seconds
        );
        localStorage.setItem('role', 'client');


        









        this.props.history.goBack();

        
        }
      
    });
    
 
  };

  render() {
    return (

      <div class="text-center ">

     <h1>Login Client!</h1>
     <Formik
       initialValues={{ email: '', password: '' }}
       validate={values => {
         const errors = {};
         if (!values.email) {
           errors.email = 'Inserisci una email valida';
         } else if (
           !/^[A-Z0-9._%+-]+@[A-Z0-9.-]+\.[A-Z]{2,}$/i.test(values.email)
         ) {
           errors.email = 'Invalid email address';
           
         }
        
    
       
        this.setState({ password:   sha256(values.password)})
         this.setState({ email: values.email })
         this.setState({ role: 'client' })
         return errors;
       }}
       onSubmit={this.getLogiIn}
     >
       {({ isSubmitting }) => (
         <Form>
           <Field type="email" name="email" ref={this.textEmail} />
           <ErrorMessage name="email" component="div" />
           <div>
           <Field type="password" name="password" ref={this.textPassword}/>
           <ErrorMessage name="password" component="div" />
           </div>
           <div className="d-grid gap-5 m-3  p-5"> 
<Button type='submit' size="lg" variant="danger" >LOG IN</Button></div>
         </Form>
       )}
     </Formik>
   </div>
 );}}

 export default withRouter(FormsLogin);