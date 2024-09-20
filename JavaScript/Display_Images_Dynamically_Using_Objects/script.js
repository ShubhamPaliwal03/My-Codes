const image1 = {

    height: '100px',
    width: '100px',
    url: 'https://i.imgur.com/yXOvdOSs.jpg',
    altText:'Hedy Lamarr'
};

const image2 = {

    height: '50px',
    width: '50px',
    url: 'https://i.imgur.com/7vQD0fPs.jpg',
    altText:'Gregorio Y. Zara'
};

const image3 = {

    height: '150px',
    width: '150px',
    url: 'https://i.imgur.com/1bX5QH6s.jpg',
    altText:'Lin Lanying'
};

const imageArr = [image1, image2, image3];

for(const image of imageArr) {

    document.write(`<img src=${image.url} alt=${image.altText} height=${image.height} width=${image.width}><br>`);
}