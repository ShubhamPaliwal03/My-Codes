import { useState } from 'react'
import {Route, Routes} from 'react-router-dom';
import Login from '../Components/Login';
import Home from '../Components/Home';
import PageNotFound from '../Components/PageNotFound';
import Chat from '../Components/Chat';

function App() {

  return (
    
    <>
      {/* <h1>WhatsApp Clone</h1> */}
      <Routes>
        <Route path='/' element={<Home></Home>}></Route>
        <Route path='/login' element={<Login></Login>}></Route>
        <Route path='/chat/:uniqueID' element={<Chat></Chat>}></Route>
        <Route path='*' element={<PageNotFound></PageNotFound>}></Route>
      </Routes>
    </>
  )
}

export default App