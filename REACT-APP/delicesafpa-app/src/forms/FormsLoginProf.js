// Render Prop
 import React,{Component} from 'react';
 import { Formik, Form, Field, ErrorMessage } from 'formik';
 import axios from "axios";
 import { withRouter } from "react-router-dom";
 import sha256 from "sha256";
 import { setTimeOut,Clear, isAdmin,isResponsable,isLivreur,isSospendu} from '../util';
 
 
 class FormsLoginProf extends Component {

  constructor() {
    super();
   
 this.state = { id:'',
 nom: '',
 email: '',
 password: '' ,
 role:''};
  }


  getLogiIn = (e) => {
   
    axios.post("/delicesafpa/findemployeMailemploye", {
      mailclient:this.state.email ,
      passwordclient:this.state.password,
    
    }).then((result) => {
      if(result.data===true){ 
     
      
      axios.post("/delicesafpa/getemployeMailemploye", {
        mailclient:this.state.email ,
        passwordclient:this.state.password,
      
      }).then((result) => {      
        
        localStorage.setItem('id', JSON.stringify(result.data.idemploye));
        localStorage.setItem('nom', result.data.nomemploye);
        localStorage.setItem('email',result.data.mailemploye);
       

   


    
      var a =localStorage.getItem('id');
      axios.get("/delicesafpa/findRoleActuel/"+a).then((result) => {
     
     localStorage.setItem('role',JSON.stringify(result.data.description))
     setTimeOut(
      'timeout',                                    // keyName
      { mail: this.state.email, pass: 'pass' },    // keyValue
     200                                     // ttl in seconds
    );
  //////////////////////////
  if (isAdmin()) {
    this.props.history.push("/accuiladmin");
   }else if(isResponsable()) {
     this.props.history.push("/accuilresponsable");
    
   }else if(isLivreur()) {
     this.props.history.push("/accuillivreur");
    
   }else  {
     this.props.history.push("/");
    
   }

  }) })}
      
    });
    
 
  };

  render() {
    return (

      <div class="text-center ">

     <h1>Login Prof!</h1>
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
     
         return errors;
       }}
       
       onSubmit={this.getLogiIn}
     >
       {({ isSubmitting }) => (
         <Form>
         <div>   <Field type="email" name="email" ref={this.textEmail} />
           <ErrorMessage name="email" component="div" /></div>
         <div> <Field type="password" name="password" ref={this.textPassword}/>
           <ErrorMessage name="password" component="div" /></div>
           <button type="submit" >
             Submit
           </button>
         </Form>
       )}
     </Formik>
   </div>
 );}}
 
 export default withRouter(FormsLoginProf);