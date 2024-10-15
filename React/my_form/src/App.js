import logo from './c_institute_logo.webp';
import './App.css';

function App() {
  return (
    <div>
      <header>
        <div id="navbar">
          <ul class="breadcrumb">
            <li class="breadcum-item"><a href="#">Home</a></li>&nbsp;:&nbsp;
            <li class="breadcrum-item"><a href="#">Login</a></li>
          </ul>
          <ul class="navbar-nav">
            <li>
              <a class="nav-item" href="#">Home</a>
            </li>
            <li>
              <a class="nav-item" href="#">Tutorials</a>
            </li>
            <li>
              <a class="nav-item" href="#">Quizzes</a>
            </li>
            <li>
              <a class="nav-item" href="#">Links</a>
            </li>
          </ul>
        </div>
        <div id="login_box">
          <p id="login_heading">Login</p>
          <img id="logo" src={logo} alt="logo" />
          <form>
              <input type="email" placeholder="Enter Your Email"></input>
              <br/>
              <input type="email" placeholder="Enter Your Email"></input>
          </form><br/>
          <a id="forgot_password" href="#">Forgot Password</a><br/>
          <button id="login_btn">LOG IN</button><br/>
          <a id="create_account" href="#">Create Account</a>
        </div>
      </header>
    </div>
  );
}

export default App;