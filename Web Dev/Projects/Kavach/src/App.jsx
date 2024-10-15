import Login from '../components/Login'
import Home from '../components/Home'
import PageNotFound from '../components/PageNotFound'
// import './App.css'
import { useState } from 'react' 
import ProtectedRoute from '../components/ProtectedRoute'
import { Route, Routes } from 'react-router-dom'
import Register from '../components/Register'

function App() {

  const [isLoggedIn, setIsLoggedIn] = useState(false);

  return (
    <Routes>
      <Route path='/login' element={<Login setIsLoggedIn={setIsLoggedIn}></Login>}>
      </Route>
      <Route path='/' element=
        {<ProtectedRoute isLoggedIn={isLoggedIn}>
          <Home setIsLoggedIn={setIsLoggedIn}></Home>
        </ProtectedRoute>}
      >
      </Route>
      <Route path='/:username' element=
        {<ProtectedRoute isLoggedIn={isLoggedIn}>
          <Home setIsLoggedIn={setIsLoggedIn}></Home>
        </ProtectedRoute>}
      >
      </Route>
      {/* <Route path='/login' element={<Login setIsLoggedIn={setIsLoggedIn}></Login>}>
      </Route> */}
      <Route path='/register' element={<Register></Register>}>
      </Route>
      <Route path='*' element={<PageNotFound></PageNotFound>}>
      </Route>
    </Routes>
  )
}

export default App