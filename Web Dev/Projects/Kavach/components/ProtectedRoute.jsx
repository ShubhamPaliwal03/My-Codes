import React from 'react'
import { Navigate } from 'react-router-dom'

function ProtectedRoute({isLoggedIn, children}) {

    if (isLoggedIn) {

        return children
    }
    else {

        return <Navigate to='/login'></Navigate>
    }
}

export default ProtectedRoute