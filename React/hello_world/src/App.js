import logo from './logo.svg';
// import logo from './google_logo.png';
import './App.css';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          {/* Edit <code>src/App.js</code> and save to reload. */}
          This is my First React App.
        </p>
        <p>
          I am a Pre-Final Year B.Tech CSE Student at BTU
        </p>
        <a
          className="App-link"
          href="https://www.linkedin.com/in/shubhammpaliwal/"
          target="_blank"
          rel="noopener noreferrer"
        >
          Here's the link to my LinkedIn Profile
        </a>
      </header>
    </div>
  );
}

export default App;
