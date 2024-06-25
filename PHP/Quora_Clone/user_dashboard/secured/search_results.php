<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="search_results_style.css">
    <title>Document</title>
</head>
<body>
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
            <div><input id="user-post-search-box" type="search" placeholder="Search Quora" class="searchbar"></div>
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
                    
                </div>
            </div>
            <div class="posts">
                <div>Results for <b>Shubham Paliwal</b></div>
            </div>
            <div class="ads">
                
            </div>
        </div>
    </div>     
    <script src="https://kit.fontawesome.com/4ca0345904.js" crossorigin="anonymous"></script>
</body>
</html>