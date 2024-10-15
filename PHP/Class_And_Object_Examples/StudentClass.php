<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Student Class Example</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
</head>
<body>
    <div class="container-fluid">
        <h2>
            <u>Students Details</u> :-
        </h2>
        <br>
        <div class="table-responsive">
        <?php
            class Student
            {
                private $name;
                private $rollNumber;
                private $email;
                private $mobile;

                public function __construct($name, $rollNumber, $email, $mobile) {

                    $this -> name = $name;
                    $this -> rollNumber = $rollNumber;
                    $this -> email = $email;
                    $this -> mobile = $mobile;
                }

                public function getRollNumber() {

                    return $this -> rollNumber;
                }

                public function getMobile() {

                    return $this -> mobile;
                }

                public function getEmail() {

                    return $this -> email;
                }

                public function getName() {

                    return $this -> name;
                }
            }

            function printAllStudentDetails(...$students) {

                $recordTable = 
                            "<table class='table table-striped table-bordered'>"
                                ."<tr>"
                                    ."<th>Name</th>"
                                    ."<th>Roll Number</th>"
                                    ."<th>Email</th>"
                                    ."<th>Mobile</th>"
                                ."</tr>";

                foreach($students as $student) {

                    $record = 
                            "<tr>"
                                ."<td>".$student -> getName()."</td>"
                                ."<td>".$student -> getRollNumber()."</td>"
                                ."<td>".$student -> getEmail()."</td>"
                                ."<td>".$student -> getMobile()."</td>"
                            ."</tr>";

                    $recordTable .= $record;
                }

                $recordTable .= "</table>";

                echo $recordTable;
            }

            $student1 = new Student("Shubham Paliwal", "21ECTCS037", "shubhampaliwal.dev@gmail.com", 7728073435);
            $student2 = new Student("Ranu Soni", "21ECTCS027", "ranusoni.535@gmail.com", 8974586157);
            $student3 = new Student("Mohit Bishnoi", "21ECTCS019", "mohitbushnoi@gmail.com", 6878435451);
            $student4 = new Student("Narendra Sharma", "21ECTCS021", "narendrasharmakv@gmail.com", 6975331796);

            printAllStudentDetails($student1, $student2, $student3, $student4);
        ?>
        </div>
    </div>
</body>
</html>