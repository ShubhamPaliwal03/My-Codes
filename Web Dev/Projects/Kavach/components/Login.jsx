import React, { useState } from 'react'
import {
  MDBBtn,
  MDBContainer,
  MDBRow,
  MDBCol,
  MDBCard,
  MDBCardBody,
  MDBInput,
  MDBIcon,
}
from 'mdb-react-ui-kit'
import './login_register.css'
import { signInWithEmailAndPassword } from 'firebase/auth'
import { GoogleAuthProvider } from 'firebase/auth'
import { signInWithPopup } from 'firebase/auth'
import { auth } from '../firebase.config'
import { useNavigate } from 'react-router-dom'
import logo from '/assets/logo.png?url'
import googleLogo from '/assets/googleLogo.svg?url'

function Login({setIsLoggedIn}) {

  const navigate = useNavigate()

  const [email, setEmail] = useState('')
  const [password, setPassword] = useState('')
  const [error, setError] = useState(null)

  const handleSignIn = async () => {

      try {

        console.log(email, password)

        const result = await signInWithEmailAndPassword(auth, email, password)

        console.log(result)

        const username = result.user.email

        setIsLoggedIn(true)

        navigate(`/${username}`)
      }
      catch (error) {

        setError(error.message)
      }
      finally {

        setEmail('')
        setPassword('')
      }
  }

  const handleLogin = async () => {

    // logic for login

    const result = await signInWithPopup(auth, new GoogleAuthProvider)

    const username = result.user.displayName

    setIsLoggedIn(true)

    navigate(`/${username}`)
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

              <MDBInput wrapperClass='mb-4' label='Email' id='form3' type='email' value={email} onChange={e => setEmail(e.target.value)} />

              <MDBInput wrapperClass='mb-4' label='Password' id='form4' type='password' value={password} onChange={e => setPassword(e.target.value)}/>

              {error && <p>{error}</p>}
              <MDBBtn className='w-100 mb-4' size='md' onClick={handleSignIn}>Existing user (Login)</MDBBtn>
              
              <MDBBtn className='w-100 mb-4' size='md' onClick={() => navigate('/register')} style={{backgroundColor: 'black'}}>Register (Via Email)</MDBBtn>

              <div className="text-center">

                <p style={{marginTop:'0.5rem', marginBottom:'1.5rem'}}>or sign up with:</p>

                {/* <MDBBtn tag='a' color='none' className='mx-3' style={{ color: '#1266f1' }}>
                  <MDBIcon fab icon='facebook-f' size="xl"/>
                </MDBBtn> */}

                {/* <MDBBtn tag='a' color='none' className='mx-3' style={{ color: '#1266f1' }}>
                  <MDBIcon fab icon='apple' size="xl"/>
                </MDBBtn> */}

                <MDBBtn tag='a' color='none' className='mx-3' style={{ color: '#1266f1' }} onClick={handleLogin}>
                  {/* <MDBIcon fab icon='google' size="xl"/> */}
                  <img src={googleLogo} alt="Google" style={{height: '1.5rem'}} />
                </MDBBtn>

                {/* <GoogleSignInButton></GoogleSignInButton> */}

                {/* <MDBBtn tag='a' color='none' className='mx-3' style={{ color: '#1266f1' }}>
                  <MDBIcon fab icon='github' size="xl"/>
                </MDBBtn> */}

              </div>

            </MDBCardBody>

          </MDBCard>

        </MDBCol>

      </MDBRow>

    </MDBContainer>
  )
}

export default Login