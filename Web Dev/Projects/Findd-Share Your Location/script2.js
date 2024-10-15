const APIKey = "1bf073fcefef4ffa8bb1a69b4bab9865"

const map = new maplibregl.Map({
    container: 'map',
    style: `https://maps.geoapify.com/v1/styles/klokantech-basic/style.json?apiKey=${APIKey}`,
});

fetch(`https://api.geoapify.com/v1/ipinfo?apiKey=${APIKey}`)
    .then(response => response.json())
    .then(positionData => {
        console.log(`lat: ${positionData.location.latitude}, lon: ${positionData.location.longitude}`);

        // locate the map to the city level

        map.flyTo({center: [positionData.location.longitude, positionData.location.latitude], zoom: 10});
    });

// create the geolocate control.

const geolocate = new maplibregl.GeolocateControl({
    positionOptions: { enableHighAccuracy: true },
    trackUserLocation: false
});

const location_disp = document.getElementById('location_disp')

// add the control to the map

map.addControl(geolocate, 'bottom-right')

// listen for the geolocate event

geolocate.on('geolocate', function(positionData){

    // get the address by coordinates with Geoapify Reverse Geocoding API

    console.log(`lat: ${positionData.coords.latitude}, lon: ${positionData.coords.longitude}`);

    getAddress(positionData.coords.latitude, positionData.coords.longitude).then(address => {
        console.log(address);
        location_disp.innerText = `Your Current Location is : ${address}`
        location_disp.style.color = "green"
    });
});

function getAddress(lat, lon)
{
    return fetch(`https://api.geoapify.com/v1/geocode/reverse?lat=${lat}&lon=${lon}&format=json&apiKey=${APIKey}`).then(result => result.json()).then(result => {
        if(result && result.results.length)
        {
            return result.results[0].formatted;
        }

        return null;
    });
}