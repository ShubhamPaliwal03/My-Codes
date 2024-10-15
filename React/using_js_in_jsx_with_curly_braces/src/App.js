import './App.css';

// 1. passing strings with quotes

// export default function Avatar() {
//   return (
//       <img
//           className="avatar"
//           src="https://i.imgur.com/7vQD0fPs.jpg"
//           alt="Gregorio Y. Zara"
//       />
//   );
// }

// 2. passing values from JS using {}

// export default function Avatar() {

//   const avatar = 'https://imgur.com/7vQD0fPs.jpg';
//   const description = 'Gregorio Y. Zara';
//   return (
//     <img
//       className="avatar"
//       src={avatar}
//       alt={description}
//     />
//   );
// }

// export default function TodoList() {

//   const name = 'Hedy Lamarr';
//   return (
//     <h1>{name}'s To Do List</h1>
//   );
// }

// 3. including function calls using {}

// const today = new Date();

// function formatDate(date) {

//   return new Intl.DateTimeFormat(
//     'en-US',
//     {weekday: 'long'} // also supports short
//   )
//   .format(date);
// }

// export default function TodoList() {
//   return (
//     <h1>To Do List for {formatDate(today)}</h1>
//   );
// }

// 4. using double curlies "" : CSS and other objects in JSX

// export default function TodoList() {
//   return (
//     <ul style={{
//       backgroundColor: 'black',
//       color:'pink',
//       margin:0
//     }}>
//       <li>Improve the videophone</li>
//       <li>Prepare aeronautics lectures</li>
//       <li>Work on the alcohol-fueled engine</li>
//     </ul>
//   );
// }

// 5. using several expressions into one object
//    and referencing them in JSX inside curly braces

const person = {

  name: 'Greogio Y. Zara',
  imageURL: 'https://i.imgur.com/7vQD0fPs.jpg',
  theme: {
    backgroundColor: 'black',
    color: 'pink',
    display: 'flex',
    flexDirection: 'column',
    justifyContent: 'center',
    alignItems: 'center',
    padding: '3em',
    height: '100vh'
  }
};

export default function TodoList() {
  return (
    <div style={person.theme}>
      <h1 style={{textAlign: 'center'}}>{person.name}'s Todo List</h1>
      <img style={{margin: '2em 0em'}}
        className="avatar"
        src={person.imageURL}
        alt="Gregorio Y. Zara"
        height="150em"
        width="150em"
      />
      <ul>
        <li>Improve the videophone</li>
        <li>Prepare aeronautics lectures</li>
        <li>Work on the alcohol-fuelled engine</li>
      </ul>
    </div>
  );
}

// 6. Challenge 3

// const baseUrl = 'https://i.imgur.com/';
// const person = {
//   name: 'Gregorio Y. Zara',
//   imageId: '7vQD0fP',
//   imageSize: 's',
//   theme: {
//     backgroundColor: 'black',
//     color: 'pink'
//   }
// };

// export default function TodoList() {
//   return (
//     <div style={person.theme}>
//       <h1>{person.name}'s Todos</h1>
//       <img
//         className="avatar"
//         src={baseUrl + person.imageId + person.imageSize + ".jpg"}
//         alt={person.name}
//       />
//       <ul>
//         <li>Improve the videophone</li>
//         <li>Prepare aeronautics lectures</li>
//         <li>Work on the alcohol-fuelled engine</li>
//       </ul>
//     </div>
//   );
// }