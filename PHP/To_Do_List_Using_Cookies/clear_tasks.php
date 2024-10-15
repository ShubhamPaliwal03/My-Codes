<?php

    // set a negative (past) expiration time for the cookie, to delete it

    setcookie("tasks", $tasks, time()-1);

    header("location:to_do_list.php");
?>