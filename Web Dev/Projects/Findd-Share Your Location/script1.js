// console.log(navigator)

if("geolocation" in navigator)
{
    const lat_disp = document.getElementById('lat_disp')
    const lon_disp = document.getElementById('lon_disp')
    const accuracy_disp = document.getElementById('accuracy_disp')

    navigator.geolocation.watchPosition(function(position){
        let lat = position.coords.latitude
        let long = position.coords.longitude
        let accuracy = position.coords.accuracy

        lat_disp.innerText = "Your Latitude is : "+lat
        long_disp.innerText = "Your Longitude is : "+long
        accuracy_disp.innerText = "Accuracy : More or less "+accuracy+" meters"
    })
}
else
{
    alert('Please Allow Location Access To Share Your Location :(')
}