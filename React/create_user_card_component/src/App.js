import UserCard from './UserCard';
import './App.css';

function App() {
  return (
    <div className="app-container">
      <div className="bg-pattern-top"></div>
      <UserCard
        name={'Shubham Paliwal'}
        age={'21'}
        bio={'Aspiring Software Developer, Passionate Computer Science Student'}
        username={"shubham_paliwal"}
      />
      <UserCard
        name={'Tarun Verma'}
        age={'37'}
        bio={'Full Stack Developer, Programming Instructor, EdTuber'}
        username={"tarun_verma"}
      />
      <div className="bg-pattern-bottom"></div>
    </div>
  );
};

export default App;