import React from 'react'
import { useNavigate } from "react-router-dom"
import { auth } from '../firebase.config'
import { signOut } from 'firebase/auth'
import User from './useEffect/User'

function Home({setIsLoggedIn}) {

  const navigate = useNavigate()

  const handleLogout = async () => {

    // logic to logout

    await signOut(auth)

    setIsLoggedIn(false)

    navigate('/login')
  };

  return (
    <div>
      <h2>Home</h2>
      <User></User>
      <button onClick={handleLogout}>Logout</button>
    </div>
  )
}

export default Home