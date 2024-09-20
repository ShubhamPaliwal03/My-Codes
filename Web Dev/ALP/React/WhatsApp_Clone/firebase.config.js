// Import the functions you need from the SDKs you need
import { initializeApp } from "firebase/app";
import { getAnalytics } from "firebase/analytics";
// TODO: Add SDKs for Firebase products that you want to use
// https://firebase.google.com/docs/web/setup#available-libraries

// Your web app's Firebase configuration
// For Firebase JS SDK v7.20.0 and later, measurementId is optional
const firebaseConfig = {
  apiKey: "AIzaSyAZ8a9nhPkOIJguCbUA7vbKHTGii1URtrA",
  authDomain: "whatsapp-clone-ad534.firebaseapp.com",
  projectId: "whatsapp-clone-ad534",
  storageBucket: "whatsapp-clone-ad534.appspot.com",
  messagingSenderId: "215577100434",
  appId: "1:215577100434:web:fcf4ae15f9f6e27caf264b",
  measurementId: "G-DN4SC9LLHR"
};

// Initialize Firebase
const app = initializeApp(firebaseConfig);
const analytics = getAnalytics(app);