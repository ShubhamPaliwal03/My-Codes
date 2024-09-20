import React from 'react'

function Login() {
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
        <button>
          Sign In with Google
          <img src="./resources/sign_in_icon.svg" alt="" />
        </button>
      </div>
    </>
  )
}

export default Login