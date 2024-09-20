import Profile from './Profile';
import './App.css';

function App() {
  return (
    <>
      <Profile
        person={{name: 'Lin Lanying', imageId: '1bX5QH6'}}
        size={100}
        isSepia={true}
        thickBorder={true}
      />
      <Profile
        person={{name: 'Katsuko Saruhashi', imageId: 'YfeOqp2'}}
        size={100}
        isSepia={false}
        thickBorder={false}
      />
      <Profile
        size={100}
        person={{name: 'Aklilu Lemma', imageId: 'OKS67lh'}}
        isSepia={true}
        thickBorder={false}
      />
      <Profile
        person={{name: 'Lin Lanying', imageId: '1bX5QH6'}}
        size={100}
        isSepia={false}
        thickBorder={true}
      />
    </>
  );
}

export default App;