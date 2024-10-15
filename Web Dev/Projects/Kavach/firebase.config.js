// Import the functions you need from the SDKs you need
import { initializeApp } from "firebase/app";
import { getAuth } from "firebase/auth";
import { getAnalytics } from "firebase/analytics";
// TODO: Add SDKs for Firebase products that you want to use
// https://firebase.google.com/docs/web/setup#available-libraries

// Your web app's Firebase configuration
// For Firebase JS SDK v7.20.0 and later, measurementId is optional
const firebaseConfig = {
  apiKey: "AIzaSyCyHbcLe-T3jhDwWD8DdlFQM2fLrS4888U",
  authDomain: "kavach-184dc.firebaseapp.com",
  projectId: "kavach-184dc",
  storageBucket: "kavach-184dc.appspot.com",
  messagingSenderId: "10486704393",
  appId: "1:10486704393:web:b2ff764aa7dd9441e94bd8",
  measurementId: "G-G468CJWK4E"
};

// Initialize Firebase
const app = initializeApp(firebaseConfig);
const auth = getAuth(app);

const analytics = getAnalytics(app);

export {auth};