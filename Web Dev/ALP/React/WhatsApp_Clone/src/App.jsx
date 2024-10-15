import { useState } from 'react'
import { Route, Routes } from 'react-router-dom';
import Login from '../Components/Login';
import Home from '../Components/Home';
import PageNotFound from '../Components/PageNotFound';
import Chat from '../Components/Chat';
import ProtectedRoute from '../Components/ProtectedRoute';

function App() {

  const [isLoggedIn, setIsLoggedIn] = useState(false);

  return (
    
    <>
      <h1>WhatsApp Clone</h1>
      <Routes>
        <Route path='/' element=
          {<ProtectedRoute isLoggedIn={isLoggedIn}>
            <Home setIsLoggedIn={setIsLoggedIn}></Home>
          </ProtectedRoute>}
        >
        </Route>
        <Route path='/login' element={<Login setIsLoggedIn={setIsLoggedIn}></Login>}>
        </Route>
        <Route path='/chat/:uniqueID' element=
          {<ProtectedRoute isLoggedIn={isLoggedIn}>
            <Chat></Chat>
          </ProtectedRoute>}
        >
        </Route>
        <Route path='*' element={<PageNotFound></PageNotFound>}>
        </Route>
      </Routes>
    </>
  )
}

export default App