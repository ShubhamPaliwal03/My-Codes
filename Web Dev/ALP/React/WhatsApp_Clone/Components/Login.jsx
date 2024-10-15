import React from 'react'
import { useNavigate } from 'react-router-dom'
import { signInWithPopup } from 'firebase/auth'
import { auth } from '../firebase.config'
import { GoogleAuthProvider } from 'firebase/auth'

function Login({setIsLoggedIn}) {

  const navigate = useNavigate()

  const handleLogin = async () => {

    // logic for login

    const result = await signInWithPopup(auth, new GoogleAuthProvider)

    console.log(result)

    setIsLoggedIn(true);

    // navigate to home page

    navigate('/');
  }

  return (
    <>
      <div id="upper-container" className='[#04a784] w-[100%]'>
        <img src='./resources/whatsapp_logo.svg' alt="" />
      </div>
      <div id="lower-container">
      </div>
      <div id='middle-container'>
        <img className='white' src="./resources/fingerprint_icon.svg" alt="" />
        <div>Sign In</div>
        <div>Sign in with your google account to get started</div>
        <button onClick={handleLogin}>
          Sign In with Google
          <img src="./resources/sign_in_icon.svg" alt="sign_in_logo" />
        </button>
      </div>
    </>
  )
}

export default Login