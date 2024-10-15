import React, { useState } from 'react'
import {
  MDBBtn,
  MDBContainer,
  MDBRow,
  MDBCol,
  MDBCard,
  MDBCardBody,
  MDBInput,
}
from 'mdb-react-ui-kit'
import './login_register.css'
import { createUserWithEmailAndPassword } from 'firebase/auth'
import { auth } from '../firebase.config'
import { useNavigate } from 'react-router-dom'
import logo from '/assets/logo.png?url'

function Register() {

  const navigate = useNavigate()

  const [firstname, setFirstname] = useState('')
  const [lastname, setLastname] = useState('')
  const [email, setEmail] = useState('')
  const [password, setPassword] = useState('')
  const [error, setError] = useState(null)

  const handleSignUp = async (e) => {

      e.preventDefault()

      try {

        console.log(email, password)

        await createUserWithEmailAndPassword(auth, email, password)

        navigate('/login')
      }
      catch (error) {

        setError(error.message)
      }
      finally {

        setEmail('')
        setPassword('')
      }
  }

  return (

    <MDBContainer fluid className='p-4 background-radial-gradient overflow-hidden'>

      <MDBRow>

        <MDBCol md='6' className='text-center text-md-start d-flex flex-column justify-content-center'>

          <h1 id='heading-container' className="my-5 display-3 fw-bold ls-tight px-3" style={{color: 'hsl(218, 81%, 95%)'}}>
            <span id='heading-title' className='flex items-center' style={{display: 'flex', alignItems: 'center'}}>
              Kavach
              <img src={logo} alt="kavach-logo"/>
            </span>
            <span style={{color: 'hsl(218, 81%, 75%)'}}>Ultimate Security For Your Loved Ones</span>
          </h1>

        </MDBCol>

        <MDBCol md='6' className='position-relative'>

          <div id="radius-shape-1" className="position-absolute rounded-circle shadow-5-strong"></div>
          <div id="radius-shape-2" className="position-absolute shadow-5-strong"></div>

          <MDBCard className='my-5 bg-glass'>
            
            <MDBCardBody className='p-5'>

                <MDBRow>
                    <MDBCol col='6'>
                        <MDBInput wrapperClass='mb-4' label='First name' id='form1' type='text'value={firstname} onChange={e => setFirstname(e.target.value)} />
                    </MDBCol>

                    <MDBCol col='6'>
                        <MDBInput wrapperClass='mb-4' label='Last name' id='form2' type='text'value={lastname} onChange={e => setLastname(e.target.value)} />
                    </MDBCol>
                </MDBRow>

                <MDBInput wrapperClass='mb-4' label='Email' id='form3' type='email' value={email} onChange={e => setEmail(e.target.value)} />

                <MDBInput wrapperClass='mb-4' label='Password' id='form4' type='password' value={password} onChange={e => setPassword(e.target.value)}/>

                {error && <p>{error}</p>}
                <MDBBtn className='w-100 mb-4' size='md' onClick={handleSignUp} style={{backgroundColor: 'black'}}>Register</MDBBtn>

                <MDBBtn className='w-100 mb-4' size='md' onClick={() => navigate('/login')}>Existing user (Login)</MDBBtn>

            </MDBCardBody>
          </MDBCard>

        </MDBCol>

      </MDBRow>

    </MDBContainer>
  )
}

export default Register