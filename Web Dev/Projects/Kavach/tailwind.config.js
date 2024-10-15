/** @type {import('tailwindcss').Config} */
export default {
  content: [
    "./index.html",
    "./src/**/*.{js,ts,jsx,tsx}",
    "!./src/components/Login.jsx", 
    "!./src/components/Register.jsx",
  ],
  theme: {
    extend: {},
  },
  plugins: [],
}