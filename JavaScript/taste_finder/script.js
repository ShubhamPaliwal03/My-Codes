let chilli = 40
let salt = 30
let tamarind = 20
let sugar = 30

if(chilli>=50 && salt<=20 && tamarind<=20 && sugar<=20)
{
    document.write("<p id=bt class=badtaste>Bohot Teekha Hai</p>"
    +"<img class=angry src=angry_emoji.jpg alt=angry_emoji>")
}
else if(salt>=50 && chilli<=20 && tamarind<=20 && sugar<=20)
{
    document.write("<p id=jn class=badtaste>Jyada Namak Hai</p>"+"<img class=angry src=angry_emoji.jpg alt=angry_emoji>")
}
else if(tamarind>=50 && salt<=20 && chilli<=20 && sugar<=20)
{
    document.write("<p id=kh class=badtaste>Khatta Hai</p>"+"<img class=angry src=angry_emoji.jpg alt=angry_emoji>")
}
else if(sugar>=50 && salt>=20 && chilli>=20 && tamarind>=20)
{
    document.write("<p id=mt class=badtaste>Meetha Hai</p>"
    +"<img class=angry src=angry_emoji.jpg alt=angry_emoji>")
}
else if(salt>=50 && sugar>=50 && chilli>=50 && tamarind>=50)
{
    document.write("<p id=b class=badtaste>Taste Bekar Hai</p>"
    +"<img class=angry src=angry_emoji.jpg alt=angry_emoji>")
}
else if(salt>=20 && sugar>=20 && chilli>=20 && tamarind>=20 && salt<=50 && chilli<=50 && tamarind<=50 && sugar<=50)
{
    document.write("<p id=t>Mast Taste Hai</p>"
    +"<img id=yummy src=yummy_face_emoji.jpg alt=yummy_face_emoji>")
}
else
{
    document.write("<p id=tl>Tasteless</p>"
    +"<img id=neutral src=neutral_face_emoji.jpg alt=neutral_face_emoji>")
}