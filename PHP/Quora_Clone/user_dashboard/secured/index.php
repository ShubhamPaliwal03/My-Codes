<?php
    if(isset($_COOKIE['username']))
    {
        include('../connect.php');

        if(isset($_POST['create_post']))
        {

            $post_content = $_POST['post_content'];
            $username = $_COOKIE['username'];
            $uid = $_COOKIE['uid'];

            if(isset($_POST['post_image']))
            {
                $post_image = $_POST['post_image'];
            }
            else
            {
                $post_image = "none";
            }

            $sql = "insert into `posts` (uid, post_content, date_and_time, post_image) values ('$uid', '$post_content', NOW(), '$post_image')";

            mysqli_query($conn, $sql);

            // header('index.php');
        }
         
        $sql = "select username, user_image";

        ?>
            <!DOCTYPE html>
            <html lang="en">
            <head>
                <meta charset="UTF-8">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <link rel="stylesheet" href="style.css">
                <link rel="icon" type="image/x-icon" href="./images/quora_favicon.png">
                <title>Quora</title>
            </head>
            <body>
                <div id="post-pop-up-outer-container">
                    <div id="post-pop-up-inner-container">
                        <form action="index.php" method="post">
                            <div id="cancel-btn">
                                <i class="fa-solid fa-xmark" id="cancel-icon"></i>
                            </div>
                            <div class="inner-flex-container">
                                <div>Create Post</div>
                            </div>
                            <hr>
                            <div class="inner-flex-container">
                                <textarea name="post_content" id="post-content-textarea" placeholder="Say something..."></textarea>
                            </div>
                            <hr>
                            <div class="inner-flex-container">
                                <input type="submit" value="Post" id="post-pop-up-create-post-btn" name="create_post" disabled>
                            </div>
                        </form>
                    </div>
                </div>
                <div id="app-container">
                    <div class="flex-navbar">
                        <div id="quora_logo_text">Quora</div>
                        <div id="btn_flex_container">
                            <div>
                                <a href="#" title="Home">
                                    <button id="home_btn" class="nav_btns" onclick="changeFontColor(this.id)">
                                        <i class="fa-solid fa-house"></i>
                                    </button>
                                </a>
                            </div>
                            <div>
                                <a href="#" title="Following">
                                    <button id="list_btn" class="nav_btns" onclick="changeFontColor(this.id)">
                                        <i class="fa-solid fa-list"></i>
                                    </button>
                                </a>
                            </div>
                            <div>
                                <a href="#" title="Answer">
                                    <button id="write_btn" class="nav_btns" onclick="changeFontColor(this.id)">
                                        <i class="fa-solid fa-pen-to-square"></i>
                                    </button>
                                </a>
                            </div>
                            <div>
                                <a href="#" title="Spaces">
                                    <button id="people_btn" class="nav_btns" onclick="changeFontColor(this.id)">
                                        <i class="fa-solid fa-user-group"></i>
                                    </button>
                                </a>
                            </div>
                            <div>
                                <a href="#" title="Notifications">
                                    <button id="notifications_btn" class="nav_btns" onclick="changeFontColor(this.id)">
                                        <i class="fa-solid fa-bell"></i>
                                    </button>
                                </a>
                            </div>
                            <div>
                                <a href="#" title="Menu">
                                    <button id="menu_btn" class="nav_btns" onclick="changeFontColor(this.id)">
                                        <i class="fa-solid fa-bars"></i>
                                    </button>
                                </a>
                            </div>
                            <div>
                                <a href="#" title="Languages">
                                    <button id="net_btn" class="nav_btns" onclick="changeFontColor(this.id)">
                                        <i class="fa-solid fa-globe"></i>
                                    </button>
                                </a>
                            </div>
                        </div>
                        <div><input id="search_box" type="search" placeholder="Search Quora"></div>
                        <div><button id="try_quora_btn">Try Quora+</button></div>
                        <div>
                            <a href="./dashboard.php" title="User">
                                <img id="user-profile-photo" src="images/unlogged_profile_image.webp" alt="user_profile_photo">
                            </a>
                        </div>
                        <div class="flex-add_ques">
                            <div><button id="add_ques_btn">Add Question</button></div>
                            <div><button id="dropdown">^</button></div>
                        </div>
                    </div>
                    <div class="flex-container">
                        <div id="intrests_section">
                            <div class="intrests">
                                <div><button>+ Create Space</button></div>
                                <div><button>Physics</button></div>
                                <div><button>Scientific Research</button></div>
                                <div><button>Innovation</button></div>
                                <div><button>Business</button></div>
                                <div><button>Visiting and Travel</button></div>
                                <div><button>Books</button></div>
                                <div><button>Science</button></div>
                                <div><button>Technology</button></div>
                                <div><button>Education</button></div>
                                <div><button>Environmental Science</button></div>
                                <div><button>Computer Science</button></div>
                                <div><button>Engineering</button></div>
                                <div><button>Coding</button></div>
                                <div><button>Software Development</button></div>
                                <div><button>UI/UX</button></div>
                                <div><button>Management</button></div>
                                <div><button>Consulting</button></div>
                                <div><button>English</button></div>
                                <div><button>Politics</button></div>
                                <div><button>Inventions</button></div>
                            </div>
                        </div>
                        <div id="posts">
                            <div id="post-box">
                                <div id="post-profile-pic-container">
                                    <img src="./images/unlogged_profile_image.webp" alt="blank_profile_picture">
                                </div>
                                <div id="outer">
                                    <div>
                                        <input type="search" placeholder="What do you want to ask or share?">
                                    </div>
                                    <div id="options">
                                        <div id="ask-btn">
                                            <a href="">Ask</a>
                                        </div>
                                        |
                                        <div id="answer-btn">
                                            <a href="">Answer</a>
                                        </div>
                                        |
                                        <div id="create-post-btn">
                                            Post
                                        </div>
                                    </div>
                                </div>
                            </div>

                            <div class="post">
                                <div id="profile_outermost">
                                    <img class="user_image" src="./images/unlogged_profile_image.webp" alt="blank_profile_picture">
                                    <div id="profile_outer">
                                        <div id="profile_inner">
                                            <div id="profile_innermost">
                                                <div><p><a id="user_id_link" href="#">A. Soper</a></p></div>
                                                <div>.</div>
                                                <div><a class="follow-link" href="#">Follow</a></div>
                                            </div>
                                        </div>
                                        <div class="user_title">Former Member of Technical Staff at AT&T Bell Labs (1985–1993) . Updated 3y</div>
                                    </div>
                                </div>
                                <h3><a class="post_link" href="#">Do you think Bjarne Stroustrup knows the entire C++ language or does he have to refer back to his own book?</a></h3>
                                <div class="post_content">
                                        I feel I am uniquely qualified to answer this question!
                                        It was 1986, and I was working at AT&T Bell Labs. Our department was only the second in the entire company that was using this compiler called cfront for a new language called C++. I knew the C language, and was in the process of learning C++ along with others in my group. One day, I was puzzled by a certain construct in the C++ language.
                                        Now, Stroustrup was also an employee at AT&T Bell Labs. His name and number was listed in the company directory. (Because he was in a different location, I had to dial him using the “8” prefix, if I recall correctly, followed by the location code.)
                                        I called him, and he picked up. I posed my question to him and told him that I had already consulted his C++ book. Without any delay whatsoever, and I mean instantly, he told me to “turn to page X” (I honestly don’t remember the page # after so many years, but it was a very specific topic deep in the book, say on page 197). And I remember that I did not hear any sound of him picking up his book, going through the pages; really, no time elapsed for any of that. It was more akin to a Jennings-level Jeopardy! contestant already providing an answer while the question is still in the process of being asked.
                                        Sure enough, my question had a clear answer on that very page! I was just amazed how he knew the page # by heart! I thanked him and hung up. I thought to myself, no wonder he came up with the language, and wrote the cfront preprocessor all by himself!
                                        I am mad at myself for not getting the book autographed during those days.
                                    <div>
                                        <img class="post_img" src="https://qph.cf2.quoracdn.net/main-qimg-da113c805f07a570d532b9772f8c629a-lq" alt="bjarne_stroustrup_sitting_at_work">
                                    </div>    
                                </div>
                            </div>


                            <div class="post" id="post1">
                                <div id="profile_outermost">
                                    <img id="user_image" src="./images/blank_profile_picture.jpg" alt="blank_profile_picture">
                                    <div id="profile_outer">
                                        <div id="profile_inner">
                                            <div id="profile_innermost">
                                                <div><p><a id="user_id_link" href="#">A. Soper</a></p></div>
                                                <div>.</div>
                                                <div><a class="follow-link" href="#">Follow</a></div>
                                            </div>
                                        </div>    
                                        <div id="user_title">Former Member of Technical Staff at AT&T Bell Labs (1985–1993) . Updated 3y</div>
                                    </div>
                                </div>
                                <p><a id="post_link" href="#">Do you think Bjarne Stroustrup knows the entire C++ language or does he have to refer back to his own book?</a></p>
                                <div id="post_content">
                                    <p>
                                        I feel I am uniquely qualified to answer this question!
                                        It was 1986, and I was working at AT&T Bell Labs. Our department was only the second in the entire company that was using this compiler called cfront for a new language called C++. I knew the C language, and was in the process of learning C++ along with others in my group. One day, I was puzzled by a certain construct in the C++ language.
                                        Now, Stroustrup was also an employee at AT&T Bell Labs. His name and number was listed in the company directory. (Because he was in a different location, I had to dial him using the “8” prefix, if I recall correctly, followed by the location code.)
                                        I called him, and he picked up. I posed my question to him and told him that I had already consulted his C++ book. Without any delay whatsoever, and I mean instantly, he told me to “turn to page X” (I honestly don’t remember the page # after so many years, but it was a very specific topic deep in the book, say on page 197). And I remember that I did not hear any sound of him picking up his book, going through the pages; really, no time elapsed for any of that. It was more akin to a Jennings-level Jeopardy! contestant already providing an answer while the question is still in the process of being asked.
                                        Sure enough, my question had a clear answer on that very page! I was just amazed how he knew the page # by heart! I thanked him and hung up. I thought to myself, no wonder he came up with the language, and wrote the cfront preprocessor all by himself!
                                        I am mad at myself for not getting the book autographed during those days.
                                    </p>
                                    <div>
                                        <img class="post_img" src="https://qph.cf2.quoracdn.net/main-qimg-da113c805f07a570d532b9772f8c629a-lq" alt="bjarne_stroustrup_sitting_at_work">
                                    </div>    
                                </div>
                                <div class="post" id="post1">
                                    <div id="profile_outermost">
                                        <img id="user_image" src="./images/blank_profile_picture.jpg" alt="blank_profile_picture">
                                        <div id="profile_outer">
                                            <div id="profile_inner">
                                                <div id="profile_innermost">
                                                    <div><p><a id="user_id_link" href="#">A. Soper</a></p></div>
                                                    <div>.</div>
                                                    <div><a class="follow-link" href="#">Follow</a></div>
                                                </div>
                                            </div>    
                                            <div id="user_title">Former Member of Technical Staff at AT&T Bell Labs (1985–1993) . Updated 3y</div>
                                        </div>
                                    </div>
                                    <p><a id="post_link" href="#">Do you think Bjarne Stroustrup knows the entire C++ language or does he have to refer back to his own book?</a></p>
                                    <div id="post_content">
                                        <p>
                                            I feel I am uniquely qualified to answer this question!
                                            It was 1986, and I was working at AT&T Bell Labs. Our department was only the second in the entire company that was using this compiler called cfront for a new language called C++. I knew the C language, and was in the process of learning C++ along with others in my group. One day, I was puzzled by a certain construct in the C++ language.
                                            Now, Stroustrup was also an employee at AT&T Bell Labs. His name and number was listed in the company directory. (Because he was in a different location, I had to dial him using the “8” prefix, if I recall correctly, followed by the location code.)
                                            I called him, and he picked up. I posed my question to him and told him that I had already consulted his C++ book. Without any delay whatsoever, and I mean instantly, he told me to “turn to page X” (I honestly don’t remember the page # after so many years, but it was a very specific topic deep in the book, say on page 197). And I remember that I did not hear any sound of him picking up his book, going through the pages; really, no time elapsed for any of that. It was more akin to a Jennings-level Jeopardy! contestant already providing an answer while the question is still in the process of being asked.
                                            Sure enough, my question had a clear answer on that very page! I was just amazed how he knew the page # by heart! I thanked him and hung up. I thought to myself, no wonder he came up with the language, and wrote the cfront preprocessor all by himself!
                                            I am mad at myself for not getting the book autographed during those days.
                                        </p>
                                        <div>
                                            <img class="post_img" src="https://qph.cf2.quoracdn.net/main-qimg-da113c805f07a570d532b9772f8c629a-lq" alt="bjarne_stroustrup_sitting_at_work">
                                        </div>    
                                    </div>
                                </div>
                            </div>
                        </div>    
                        <div class="ads">
                            <div class="ad">
                                <img class="ad_images" src="./images/apple_advertisement.jpg" alt="ad">
                            </div>
                            <div class="ad">
                                <img class="ad_images" src="./images/samsung_advertisement2.jpg" alt="advertisment">
                            </div>
                            <div class="ad">
                                <img class="ad_images" src="./images/vw_advertisment.png" alt="advertisment">
                            </div>
                            <div class="ad">
                                <img class="ad_images" src="./images/bose_advertisment.png" alt="advertisment">
                            </div>
                            <div class="ad">
                                <img class="ad_images" src="./images/dell_advertisement.jpg" alt="advertisment">
                            </div>
                            <div class="ad">
                                <img class="ad_images" src="./images/google_advertisement.jpg" alt="advertisment">
                            </div>
                            <div class="ad">
                                <img class="ad_images" src="./images/apple_advertisement2.jpg" alt="advertisment">
                            </div>
                            <div class="ad">
                                <img class="ad_images" src="./images/samsung_advertisement.jpg" alt="advertisment">
                            </div>
                        </div>
                    </div>
                    
                </div>
            </body>
            <script src="script.js"></script>
            <script src="https://kit.fontawesome.com/4ca0345904.js" crossorigin="anonymous"></script>
            </html>
        <?php
    }
    else
    {
        header('location:../login.php');
    }
?>