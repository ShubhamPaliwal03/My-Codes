<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="admin_style.css">
    <title>Quizzes - Admin Panel</title>
</head>
<body>
    <?php
        include('connect.php');

        if(isset($_POST['add_subject_btn']))
        {
            $sql = "insert into subjects(subject) values('$_POST[subject_name]')";

            if(mysqli_query($conn, $sql))
            {
                ?> <script>alert('Subject Added Successfully...')</script> <?php
            }
        }
        else if(isset($_POST['add_topic_btn']))
        {
            // get the foreign key s_id from the subject table

            $sql = "select s_id from subjects where subject = '$_POST[subject_selected]'";

            $records = mysqli_query($conn, $sql);

            $data = mysqli_fetch_assoc($records);

            $s_id = $data['s_id'];

            $sql = "insert into topics(s_id, topic) values('$s_id', '$_POST[topic_name]')";

            if(mysqli_query($conn, $sql))
            {
                ?> <script>alert('Topic Added Successfully...')</script> <?php
            }
        }
    ?>
    <div id="heading">Admin Panel</div>
    <div id="outer-container">
        <div id="nav">
            <div id="subject" onclick="return openSection('manage_subject_menu')">Manage Subjects<button name="subject_btn" hidden></button></div>
            <div id="topic" onclick="return openSection('manage_topic_menu')">Manage Topics<button name="topic_btn" hidden></button></div>
            <div id="question" onclick="return openSection('manage_question_menu')">Manage Questions<button name="question_btn" hidden></button></div>
        </div>
        <form action="admin.php" method="post">
            <div class="options" id="manage_subject_menu">
                    <div>
                        <label for="subject_field">Subject Name&nbsp;:&nbsp;</label><input type="text" class="input_field" id="subject_field" name="subject_name" placeholder="Enter Subject Name" autofocus>
                    </div>
                    <div>
                        <button id="add_subject_btn" name="add_subject_btn" class="buttons">Add</button>
                    </div>
            </div>
        </form>
        <form action="admin.php" method="post">
            <div class="options" id="manage_topic_menu">
                <div>
                    <label for="subjects-dropbox">Select Subject</label>&nbsp;:&nbsp;
                    <select name="subject_selected" id="subjects-dropbox" class="dropbox">
                        <?php 

                            $sql = "select subject from subjects";

                            $records = mysqli_query($conn, $sql);

                            // load the dropdown options with subject names from the database

                            while($subject = mysqli_fetch_assoc($records))
                            {
                                echo "<option>".$subject['subject']."</option>";
                            }

                        ?>
                    </select>
                </div>
                    <div>
                        <label>Topic&nbsp;:&nbsp;<input type="text" name="topic_name" class="input_field" id="topic_field" placeholder="Enter Topic Name" autofocus></label>
                        &nbsp;
                    </div>
                    <div>
                        <button id="add_topic_btn" class="buttons" name="add_topic_btn">Add</button>
                    </div>
            </form>
        </div>
        <div class="options" id="manage_question_menu">
            <div id="inner-container1-manage_question_menu" class="inner-containers-manage_question_menu">
                <div>
                    <label for="subjects-dropbox">Select Subject</label>&nbsp;:&nbsp;
                    <select name="" id="subjects-dropbox" class="dropbox">
                        <option value="">C</option>
                        <option value="">C++</option>
                    </select>
                </div>
                <div>
                    <label for="topics-dropbox">Select Topic</label>&nbsp;:&nbsp;
                    <select name="" id="topics-dropbox" class="dropbox">
                        <option value="">Arrays</option>
                        <option value="">Strings</option>
                    </select>
                </div>
            </div>
            <div id="inner-container2-manage_question_menu" class="inner-containers-manage_question_menu">
                <div>
                    <label for="question_field">Question&nbsp;:&nbsp;</label><input type="text" name="" class="input_field" id="question_field"  placeholder="Enter Question" autofocus>
                </div>
                <div>
                    <label for="option_a">Option A&nbsp;:&nbsp;</label><input type="text" name="" class="input_field" id="option_a" placeholder="Enter Option A">
                </div>
                <div>
                    <label for="option_b">Option B&nbsp;:&nbsp;</label><input type="text" name="" class="input_field" id="option_b" placeholder="Enter Option B">
                </div>
                <div>
                    <label for="option_c">Option C&nbsp;:&nbsp;</label><input type="text" name="" class="input_field" id="option_c" placeholder="Enter Option C">
                </div>
                <div>
                    <label for="option_d">Option D&nbsp;:&nbsp;</label><input type="text" name="" class="input_field" id="option_d" placeholder="Enter Option D">
                </div>
            </div>
            <div id="inner-container3-manage_question_menu" class="inner-containers-manage_question_menu">
                <div>
                    <label for="correct_option-dropbox">Select Correct Option</label>&nbsp;:&nbsp;
                    <select name="" id="correct_option-dropbox" class="dropbox">
                        <option value="">A</option>
                        <option value="">B</option>
                        <option value="">C</option>
                        <option value="">D</option>
                    </select>
                </div>
                <div>
                    <label for="explanation">Explanation&nbsp;:&nbsp;</label><input type="text" name="" class="input_field" id="explanation" placeholder="Enter Explanation">
                </div>
                <div>
                    <button id="add_question_btn" name="add_question" class="buttons">Add</button>
                </div>
            </div>
        </div>
    </div>
    <script type="text/javascript">
        
        prev_section_id = "manage_subject_menu"

        function openSection(current_section_id)
        {   
            // hide the previous section

            const prev_section = document.getElementById(prev_section_id)

            prev_section.style.display = "none"

            // show the current (clicked) section

            const current_section = document.getElementById(current_section_id)

            current_section.style.display = "flex"

            prev_section_id = current_section_id
        }

    </script>
</body>
</html>