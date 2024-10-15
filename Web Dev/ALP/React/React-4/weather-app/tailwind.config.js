/** @type {import('tailwindcss').Config} */
export default {
  content: [
    "./index.html",
    "./src/**/*.{js,ts,jsx,tsx}",
  ],
  theme: {
    extend: {
      backgroundImage: {
        'custom-gradient': 'linear-gradient(180deg, rgb(82, 229, 231) -20%, rgb(19, 12, 183) 100%)',
      }
    },
  },
  plugins: [],
}