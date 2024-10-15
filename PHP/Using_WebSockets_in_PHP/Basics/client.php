<?php
    if(isset($_POST['submit']) and $_POST['submit'] != '')
    {
        // 1. creating a socket
    
        // socket_create() takes three arguments :-
    
        // domain   : IPV4 / IPV6, AF_INET means IPV4 (default)
        // type     : Half Duplex / Full Duplex, SOCK_STREAM means Full Duplex
        // protocol : 0, according to IPV4 protocol
    
        // return type : resource
    
        $socket = socket_create(AF_INET, SOCK_STREAM, 0) or die('Not Able To Create Socket'); // creates a socket (endpoint for communication)
    
        // 2. connect the socket
    
        // socket_connect() takes three arguments :-
    
        // socket  : the socket that has to be connected (type : resource)
        // address : the address of the host to which the socket has to be binded
        // port    : the port that will be used
    
        // return type : bool 
    
        $host = "127.0.0.1";
        $port = 8085;
    
        socket_connect($socket, $host, $port) or die('Not Able To Connect'); // Initiates a connection on a socket
    
        // 3. write the message to the socket created above
    
        // socket_write() takes three arguments :-
    
        // socket : the socket to which the message has to be written
        // buffer : the message to be written to the socket
        // length : the length of the message that has to be written to the socket
    
        $message = $_POST['message'];
    
        socket_write($socket, $message, strlen($message)); // write to a socket

        $reply = socket_read($socket, 1024);

        $reply = trim($reply);

        echo $reply;

        socket_close($socket);
    }
?>
<form action="client.php" method="post">
    <label for="message">Enter Message : </label><input id="message" type="text" name="message">
    <input type="submit" name="submit" value="Send">
</form>