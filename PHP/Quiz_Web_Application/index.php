<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./style.css">
    <title>Quiz</title>
    <!-- <style>
        body
        {
            background-color: #1e2124;
            color: white;
        }
        .questions
        { 
            position: relative;
            top: 110px;
            padding: 50px;
            margin-left: 5px;
            margin-right: 10px;
            width: 600px;
            height: 500px;
            background-color: #282b30;
            float: left;
            box-sizing: border-box;
        }
        .options
        {
            position: relative;
            top: 110px;
            padding: 50px;
            width: 600px;
            margin: 0px;
            height: 500px;
            background-color: #282b30;
            color: white;
            box-sizing: border-box;
            float: left;
        }
        #question_card_2, #question_card_3, #question_card_4, #resultOuter
        {
            display: none;
        }
        img
        {
            width: 50px;
            height: 50px;
        }
        .optionsInner
        {
            margin-top: 80px;
        }
        #submitBtn
        {
            position: relative;
            top: 0.5vh;
            left: 87vw;
            height: 40px;
            width: 80px;
            font-size: 18px;
            color: white;
            background-color: orange;
            border: none;
            border-radius: 5px;
            font-weight: 600;
            transition: scale 0.5s;
        }
        #submitBtn:hover
        {
            scale : 1.1;
        }
        #nextBtn
        {
            position: relative;
            top: 0.5vh;
            left: 158vh;
            height: 40px;
            width: 80px;
            font-size: 18px;
            color : white;
            background-color: orange;
            border: none;
            border-radius: 5px;
            font-weight: 600;
            transition: scale 0.5s;
        }
        #nextBtn:hover
        {
            scale: 1.1;
        }
        #timer
        {
            position: relative;
            left: 0.5vw;
            top: 3vh;
        }
        #resultOuter
        {
            display: flex;
            justify-content: center;
            align-items: center;
        }
        #score
        {
            font-size: 50px;
            font-style: italic;
            color: green;
        }
    </style> -->
</head>
<body>
    <?php
        if(isset($_POST['submit'])) // if the quiz is submitted
        {                
            $answers = Array("None of the Above", "Hello Hi", "cdef", "b"); // answer key for matching the answers

            $unattempted = 0;

            $attempted = 0;

            $score = 0;

            $i = 0;

            foreach($_POST as $k => $v)
            {
                if(!isset($k) && $k !== "submit" && $k != "next")
                {
                    $unattempted++;
                }
                else
                {
                    $attempted++;

                    if($v === $answers[$i])
                    {
                        $score += 10;
                    }
                }

                if($k !== "submit" && $k !== "next")
                {
                    $i++;
                }
            }
            
            ?>

            <div id="resultOuter">
                <div id="result">
                    <p id="score"><?php echo"Your Score :- $score / 40";?></p>
                </div>
            </div>

            <?php
        }
        else // initially, when the quiz is not submitted
        {
            ?>

            <form id="responsesForm" method="post" action="index.php">
        <span id="timer"></span>
        <input type="submit" value="Submit" name="submit" id="submitBtn">
        <input type="button" value="Next" name="next" id="nextBtn" onclick="nextQuestion()">
        <div class="cards" id="question_card_1">
            <div class="questions">
                <div class="title"><h3>Boolean Operators</h3><span>Easy</span></div>
                <b><p class="problem_statement">What will be the output of the following statement?</p></b>
<pre>
<code>
#include<iostream>
using namespace std;

int main() 
{

    bool z = (true && false);
    cout << z;

}
</code>
</pre>
            </div>
            <div class="options">
                <b><p>Options : </b>Pick one correct answer from below</p>
                <div class="optionsInner">
                    <input type="radio" id="_1" name="q1_choice" value="1">
                    <label for="_1">1</label>
                    <br>
                    <br>
                    <input type="radio" id="_2" name="q1_choice" value="0">
                    <label for="_2">0</label>
                    <br>
                    <br>
                    <input type="radio" id="_3" name="q1_choice" value="Both A and B">
                    <label for="_3">Both A and B</label>
                    <br>
                    <br>
                    <input type="radio" id="_4" name="q1_choice" value="None of the Above">
                    <label for="_4">None of the Above</label>
                </div>    
            </div>
        </div>
        <div class="cards" id="question_card_2" class="rest_cards">
            <div class="questions">
                <div class="title"><h3>Boolean Operators</h3><span>Easy</span></div>
                <b><p class="problem_statement">What will be the output of the following statement?</p></b>
<pre>
<code>
#include <iostream>
using namespace std;

int main() 
{
    int x = 5;
    if (x < 6)
        cout << “Hello ”;
    if (x == 5) {
        cout << “Hi”;
    } else {
        cout << “Hey”;
    }
}
</code>
</pre>
            </div>
            <div class="options">
                <b><p>Options : </b>Pick one correct answer from below</p>
                <input type="radio" id="_1" name="q2_choice" value="Hello">
                <label for="_1">Hello</label>
                <br>
                <br>
                <input type="radio" id="_2" name="q2_choice" value="Hi">
                <label for="_2">Hi</label>
                <br>
                <br>
                <input type="radio" id="_3" name="q2_choice" value="Hello Hi">
                <label for="_3">Hello Hi</label>
                <br>
                <br>
                <input type="radio" id="_4" name="q2_choice" value="Hello Hey">
                <label for="_4">Hello Hey</label>
            </div>
        </div>
        <div class="cards" id="question_card_3" class="rest_cards">
            <div class="questions">
                <div class="title"><h3>Boolean Operators</h3><span>Medium</span></div>
                <b><p class="problem_statement">What will be the output of the following statement?</p></b>
<pre>
<code>
s = "abcdef"
print (s[2:])
</code>
</pre>
            </div>
            <div class="options">
                <b><p>Options : </b>Pick one correct answer from below</p>
                <div class="optionsInner">
                    <input type="radio" id="_1" name="q3_choice" value="bcdef">
                    <label for="_1">bcdef</label>
                    <br>
                    <br>
                    <input type="radio" id="_2" name="q3_choice" value="cdef">
                    <label for="_2">cdef</label>
                    <br>
                    <br>
                    <input type="radio" id="_3" name="q3_choice" value="abcdef">
                    <label for="_3">abcdef</label>
                    <br>
                    <br>
                    <input type="radio" id="_4" name="q3_choice" value="None of the Above">
                    <label for="_4">None of the Above</label>
                </div>
            </div>
        </div>
        <div class="cards" id="question_card_4" class="rest_cards">
            <div class="questions">
                <div class="title"><h3>Boolean Operators</h3><span>Medium</span></div>
                <b><p class="problem_statement">What will be the output of the following statement?</p></b>
                <p>
                    The following questions consist of a set of three figures X, Y and Z showing a sequence of folding of a piece of paper. Fig (Z) shows the manner in which the folded paper has been cut. These three figures are followed by four answer figures from which you have to choose a figure which would most closely resemble the unfolded form fig. (Z)
                </p>
                <img id="main_image" src="q4_question_image.png" alt="ques_4_image">
                <span>a <img id="img_a" src="ques_4_option_a.png" alt="ques_4_option_a_image"></span>
                <span>b <img id="img_b" src="ques_4_option_b.png" alt="ques_4_option_b_image"></span>
                <span>c <img id="img_c" src="ques_4_option_c.png" alt="ques_4_option_c_image"></span>
                <span>d <img id="img_d" src="ques_4_option_d.png" alt="ques_4_option_d_image"></span>
            </div>
            <div class="options">
                <b><p>Options : </b>Pick one correct answer from below</p>
                <input type="radio" id="_1" name="q4_choice" value="a">
                <label for="_1">a</label>
                <br>
                <br>
                <input type="radio" id="_2" name="q4_choice" value="b">
                <label for="_2">b</label>
                <br>
                <br>
                <input type="radio" id="_3" name="q4_choice" value="c">
                <label for="_3">c</label>
                <br>
                <br>
                <input type="radio" id="_4" name="q4_choice" value="d">
                <label for="_4">d</label>
            </div>
        </div>
        </form>
        <script>

            const perQuesTime = 30 // 30 secs

            const alertTime = 10 // 10 secs

            let question_number = 1

            let time_left = perQuesTime

            let timer = document.getElementById('timer')

            timer.style.color = "greenyellow"

            function updateTime()
            {
                if(time_left == 0)
                {
                    updateQuestion()

                    time_left = perQuesTime

                    timer.style.color = "greenyellow"
                }

                timer.innerText = time_left+" seconds left"

                time_left--

                if(time_left <= alertTime)
                {
                    timer.style.color = "red"
                }
            }

            updateTime()

            let intervalId = setInterval(updateTime, 1000)

            const resultOuter = document.getElementById('resultOuter') // Returns a reference to the first object with the specified value of the ID attribute.

            const submitBtn = document.getElementById('submitBtn')

            submitBtn.addEventListener("click", showResult)

            function updateQuestion()
            {
                let old_ques_card = document.getElementById('question_card_'+question_number)

                old_ques_card.style.display = "none"

                question_number++

                if(question_number == 5)
                {
                    showResult()

                    return
                }

                let new_ques_card = document.getElementById('question_card_'+question_number)

                new_ques_card.style.display = "block"
            }

            function nextQuestion()
            {
                updateQuestion()

                time_left = perQuesTime

                timer.style.color = "greenyellow"
            }

            function showResult()
            {
                clearInterval(intervalId)
                
                timer.style.display = "none"

                submitBtn.click() // auto submit the form after the test time has completed

                resultOuter.style.display = "block"
            }

        </script>

        <?php

        }

        ?>
</body>
</html>