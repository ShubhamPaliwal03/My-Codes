const home_btn = document.getElementById('home-btn');

home_btn.addEventListener('click', () => {

    window.scrollTo(0, 0);
});

const copyMailId = () => {

    navigator.clipboard.writeText("shubhampaliwal.dev@gmail.com");
};

document.querySelectorAll('a[href^="#"]').forEach(anchor => {
    anchor.addEventListener('click', function (e) {
        e.preventDefault();

        const targetId = this.getAttribute('href');
        const targetElement = document.querySelector(targetId);
        const offset = 50; // Adjust this value as needed

        const elementPosition = targetElement.getBoundingClientRect().top;
        const offsetPosition = elementPosition - offset;

        window.scrollBy({
            top: offsetPosition,
            behavior: 'smooth'
        });
    });
});