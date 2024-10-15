import React from 'react'
import { useParams } from 'react-router-dom'

function Chat() {

    const params = useParams()

  return (
    <>
        <h2>Chat</h2>
        <h4>Chat ID : {params.uniqueID}</h4>
    </>
  )
}

export default Chat