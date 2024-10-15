<?php

    // 1. creating a socket

    // socket_create() takes three arguments :-

    // domain   : IPV4 / IPV6, AF_INET means IPV4 (default)
    // type     : Half Duplex / Full Duplex, SOCK_STREAM means Full Duplex
    // protocol : 0, according to IPV4 protocol

    // return type : resource

    $socket = socket_create(AF_INET, SOCK_STREAM, 0) or die ('Not Able To Create Socket'); // creates a socket (endpoint for communication)

    // 2. binding the socket with the host and port

    // socket_bind() takes three arguments :-
    
    // socket  : the socket that has to binded with the host (type : resource)
    // address : the address of the host to which the socket has to be binded
    // port    : the port that will be used
        
    // return type : bool (Returns true on success or false on failure).
    
    $host = "127.0.0.1"; // we can also use 'localhost' here
    $port = 8085;

    $result = socket_bind($socket, $host, $port) or die('Not Able To Bind Socket With Host'); // binds a name to a socket

    // 3. create a listening on the port, ie., it will listen to the port if there is a message recieved

    // socket_listen() takes two arguments:-

    // socket   : the socket that will be used (type : resource)
    // backlog  : A maximum of backlog incoming connections will be queued for processing. 
    //            If a connection request arrives with the queue full the client may receive an error with an indication of ECONNREFUSED,
    //            or, if the underlying protocol supports retransmission, the request may be ignored so that retries may succeed.

    //            Note: The maximum number passed to the backlog parameter highly depends on the underlying platform. 
    //            On Linux, it is silently truncated to SOMAXCONN. On win32, if passed SOMAXCONN, the underlying service provider
    //            responsible for the socket will set the backlog to a maximum reasonable value.
    //            There is no standard provision to find out the actual backlog value on this platform.      

    // return type : bool (Returns true on success or false on failure).

    $result = socket_listen($socket, 3) or die('Not Able To Listen For Connection'); // listens for a connection on a socket

    // 4. to accept the data, whenever we receive some data

    // socket_accept() takes one argument :-

    // socket : the socket that will be used (type : resource)

    // return type : bool (Returns true on success or false on failure).

    // 5. we run a loop to make the server listen always

    while(true)
    {
        $accept = socket_accept($socket) or die('Not Able To Accept Connection'); // accepts a connection on a socket
    
        // 6. read the data or message received via connection, from the socket
    
        // socket_read() takes three arguments :-
    
        // socket : the socket that will be used (type : resource)
        // length : the amount of bytes that has to be read from the socket
        // type   : optional
    
        // return type : resource
    
        $message = socket_read($accept, 1024); // reads a maximum of length bytes from a socket
    
        // 7. trim the message, ie., remove any leading (present at beginning) and trailing (present at ending) whitespaces from the message
    
        $message = trim($message); // strip whitespace (or other characters) from the beginning and end of a string
    
        // trim( string $str [, string $character_mask = " " ])
    
        // 8. print the message
    
        // 9. send a message (if needed)

        echo "\n".$message."\n";

        echo "Enter Reply : ";

        $reply = fgets(STDIN); // Gets line from file pointer

        // write the message to the socket

        socket_write($accept, $reply, strlen($reply));
    }

    // 10. close the socket

    // socket_close() takes one argument :-

    // socket : the socket that has to be closed (type : resource)

    // return type : void

    socket_close($socket); // closes a socket resource
    socket_close($accept); // closes a socket resource
?>