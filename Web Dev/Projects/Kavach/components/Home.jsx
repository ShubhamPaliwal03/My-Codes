import React from 'react'
import { auth } from '../firebase.config'
import { signOut } from 'firebase/auth'
import { useNavigate } from 'react-router-dom'
import { useParams } from 'react-router-dom'

function Home({setIsLoggedIn}) {

    const params = useParams();

    const navigate = useNavigate()

    const handleLogout = async () => {

        // logic for logout

        await signOut(auth)

        setIsLoggedIn(false)

        navigate('/login')
    }

    return (
        <>
            <div>Welcome! {params.username}</div>
            <button onClick={handleLogout}>Logout</button>
        </>
    )
}

export default Home