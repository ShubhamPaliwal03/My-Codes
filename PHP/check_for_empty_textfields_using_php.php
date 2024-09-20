<!DOCTYPE html>
<html>
<head>  
  <title>Form</title>
  <style type="text/css">
    table,td
    { 
      border: solid 1px black;
      border-collapse: collapse;
    }
    td
    {
      padding: 5px;
    }
  </style>
</head>
<body>
  <?php 
      if(isset($_POST['submit'])) // if submit button is clicked
      {
        // check for fields which are not filled

        $areEmpty = false;

        // create an array to keep the messages to be placed in the divs

        $emptyFields = Array();

        foreach($_POST as $key => $value)
        {
          if(empty($value) || $value=="" || $value==null)
          {
            array_push($emptyFields, " * This is a required field ");

            $areEmpty = true;
          }
          else
          {
            array_push($emptyFields, "");
          }
        }

        if($areEmpty === false) // if no fields are empty (all fields are filled)
        {
          echo "<table>";

          foreach($_POST as $key => $value)
          {
            if($key === "submit")

              break;

            echo "<tr><td>$key</td><td>$value</td></tr>";
          }

          echo "</table>";
        }
        else
        {
          ?>
          <form method="post" action="check_for_empty_textfields_using_php.php">
            <label for="firstname">First Name : </label>
            <input id="firstname" type="text" name="First Name" value="<?php echo"$_POST[First_Name]";?>"><span><?php echo"$emptyFields[0]";?></span><br>
            <label for="last_name">Last Name : </label>
            <input id="last_name" type="text" name="Last Name" value=<?php echo"$_POST[Last_Name]";?>><span><?php echo"$emptyFields[1]";?></span><br>
            Gender : <label> Male <input type="radio" value="Male" name="Gender"<?php if(isset($_POST['Gender'])) if($_POST['Gender'] === "Male") echo" checked";?>></label>
            <label> Female <input type="radio" value="Female" name="Gender"<?php if(isset($_POST['Gender'])) if($_POST['Gender'] === "Female") echo" checked";?>></label>
            <span><?php echo"$emptyFields[2]";?></span><br>

            <label for="email">Email : </label>
            <input id="email" type="email" name="Email" value=<?php echo"$_POST[Email]";?>><span><?php echo"$emptyFields[3]";?></span><br>

            <label for="mobile">Mobile : </label>
            <input id="mobile" type="number" name="Mobile" value=<?php echo"$_POST[Mobile]";?>><span><?php echo"$emptyFields[4]";?></span><br>

            <label for="DOB">DOB : </label>
            <input id="DOB" type="date" name="DOB" value=<?php echo" $_POST[DOB]";?>><span><?php echo"$emptyFields[5]";?></span><br>

            <input type="submit" name="submit" value="Process">
            <input type="reset" name="reset" value="Clear">
          </form>
          <?php
        }
      }
      else // if the page is loaded initially
      {
          echo '<form method="post" action="check_for_empty_textfields_using_php.php">'
          .'<label for="firstname">First Name : </label> '
          .'<input id="firstname" type="text" name="First Name"><br>'
          .'<label for="last_name">Last Name : </label> '
          .'<input id="last_name" type="text" name="Last Name"><br>'
          .'Gender : <label> Male <input type="radio" value="Male" name="Gender"></label>'
          .'<label> Female <input type="radio" value="Female" name="Gender"></label>'
          .'<br>'

          .'<label for="email">Email : </label> '
          .'<input id="email" type="email" name="Email"><br>'

          .'<label for="mobile">Mobile : </label> '
          .'<input id="mobile" type="number" name="Mobile"><br>'

          .'<label for="DOB">DOB : </label> '
          .'<input id="DOB" type="date" name="DOB"><br>'

          .'<input type="submit" name="submit" value="Process">'
          .'<input type="reset" name="reset" value="Clear">'
        .'</form>';
      }
   ?>
</body>
</html>