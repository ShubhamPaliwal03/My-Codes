const splash_images_urls = 
[
    'url("images/splashes/splash1.png")',
    'url("images/splashes/splash2.png")',
    'url("images/splashes/splash3.png")',
    'url("images/splashes/splash4.png")',
    'url("images/splashes/splash5.png")',
    'url("images/splashes/splash6.png")',
    'url("images/splashes/splash7.png")',
    'url("images/splashes/splash8.png")',
    'url("images/splashes/splash9.png")',
    'url("images/splashes/splash10.png")',
    'url("images/splashes/splash11.png")',
    'url("images/splashes/splash12.png")',
    'url("images/splashes/splash13.png")',
    'url("images/splashes/splash14.png")',
    'url("images/splashes/splash15.png")',
    'url("images/splashes/splash16.png")'
];

const body = document.querySelector('body');

body.addEventListener('click', (e) => {

    new Audio('sounds/splash-sound.mp3').play();

    let x = e.pageX - e.target.offsetLeft;
    let y = e.pageY - e.target.offsetTop;

    let splash = document.createElement('span');
    splash.className = "splashes";
    splash.style.left = x + 'px';
    splash.style.top = y + 'px';

    // selects a random image out of images 1 to 16, and sets it as the background of the span

    const max = 16, min = 1

    const maxFloored = Math.floor(max), minCeiled = Math.ceil(min)

    let bcg = splash_images_urls[Math.floor(Math.random() * (maxFloored - minCeiled + 1) + minCeiled)];

    splash.style.backgroundImage = bcg;

    body.appendChild(splash);

    setTimeout(() => {
        splash.remove()
    }, 5000);

});