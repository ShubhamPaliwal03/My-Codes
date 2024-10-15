const search_btn = document.querySelector(".search-btn");
const searchbar = document.querySelector(".searchbar");
const weather_condition_icon = document.querySelector(".weather-condition-icon");
const locate_btn = document.querySelector('.locate-btn');

searchbar.addEventListener('focus', () => {

    const curr_width = searchbar.clientWidth / 16;

    searchbar.style.width = (curr_width + 3).toString()+"rem";
})

searchbar.addEventListener('blur', () => {

    const curr_width = searchbar.clientWidth / 16;

    searchbar.style.width = (curr_width - 3).toString()+"rem";
})

const getJSONData = async (response) => {

    const JSONData = await response.json();

    return JSONData;
};

const getWeatherData = async (search_location) => {
    
    const api_request = `https://api.weatherapi.com/v1/current.json?key=6af41b5946e14ac6a3a174318241407&q=${search_location}&aqi=yes`;
    
    const response = await fetch(api_request);

    // if response code is 200 (Status OK)

    if (response.status === 200) {

        const weatherJSONData = await getJSONData(response);

        console.log(weatherJSONData);

        return weatherJSONData;
    } 

    // if response code is 400 (Bad Request)

    else if (response.status === 400) {

        alert("Location not found! Please enter a valid location!");

    } else {

        console.log(response);
    }

    return null;
};

const getWeatherIconPath = (weatherCondition) => {

    weather_condition_icon.classList.remove("sunny", "clear"); // remove the sunny and clear class (if exists any)

    weatherCondition = weatherCondition.toLowerCase();

    let folder_path = "./images/weather-icons/";
    let icon_name;

    switch (true) {

        case weatherCondition === "sunny":

            icon_name = "clear_day.svg";
            weather_condition_icon.classList.add("sunny");

            break;

        case weatherCondition === "clear":

            icon_name = "clear_night.svg";
            weather_condition_icon.classList.add("clear");

            break;
    
        case weatherCondition === "partly cloudy":

            icon_name = "partly_cloudy_day.svg";

            break;

        // cloudy night

        case weatherCondition === "cloudy":

            icon_name = "cloudy.svg";

            break;

        case weatherCondition === "overcast":

            icon_name = "mostly_cloudy_day.svg";
            
            break;

        // overcast night
    
        case weatherCondition === "mist":
        case weatherCondition === "fog":

            icon_name = "haze_fog_dust_smoke.svg";

            break;

        case weatherCondition === "freezing fog":

            icon_name = "sleet_hail.svg";

            break;

        case weatherCondition === "patchy rain possible":
        case weatherCondition === "patchy light rain":
        case weatherCondition === "light rain":
        case weatherCondition.includes("patchy rain"):

            icon_name = "cloudy_with_rain.svg";

            break;

        case weatherCondition === "light drizzle":
        case weatherCondition === "patchy light drizzle":

            icon_name = "drizzle.svg";

            break;

        case weatherCondition === "light rain shower":

            icon_name = "scattered_showers_day.svg";

            break;
    
        case weatherCondition === "freezing drizzle":
        case weatherCondition === "heavy freezing drizzle":
        case weatherCondition === "light freezing rain":
        case weatherCondition === "light sleet":
        case weatherCondition === "light sleet showers":
        case weatherCondition === "patchy sleet possible":

            icon_name = "mixed_rain_hail_sleet.svg";

            break;
    
        case weatherCondition === "moderate rain at times":
        case weatherCondition === "moderate rain":
        case weatherCondition === "heavy rain at times":
        case weatherCondition === "heavy rain":

            icon_name = "heavy_rain.svg";
            
            break;

        case weatherCondition === "torrential rain shower":
        case weatherCondition === "moderate or heavy rain shower":

            icon_name = "showers_rain.svg";

            break;

        case weatherCondition === "patchy light rain with thunder":

            icon_name = "isolated_scattered_thunderstorms_day.svg";

            break;

        case weatherCondition === "moderate or heavy rain with thunder":

            icon_name = "isolated_thunderstorms.svg";

            break;
    
        case weatherCondition === "patchy snow possible":
        case weatherCondition === "blowing snow":

            icon_name = "blowing_snow.svg";

            break;

        case weatherCondition === "blizzard":

            icon_name = "blizzard.svg";

            break;        

        case weatherCondition === "patchy light snow":
        case weatherCondition === "light snow":
            
            icon_name = "flurries.svg";

            break;
                 
        case weatherCondition === "patchy moderate snow":
        case weatherCondition === "moderate snow":

            icon_name = "cloudy_with_snow.svg";

            break;

        case weatherCondition === "patchy heavy snow":
        case weatherCondition === "heavy snow":

            icon_name = "heavy_snow.svg";
            
            break;

        case weatherCondition === "light snow showers":
            
            icon_name = "scattered_snow_showers_day.svg";

            break;
      
        case weatherCondition === "moderate or heavy snow showers":

            icon_name = "showers_snow.svg";

            break;

        case weatherCondition === "patchy light snow with thunder":
        case weatherCondition === "moderate or heavy snow with thunder":

            icon_name = "mixed_rain_snow.svg";
            
            break;
    
        case weatherCondition === "ice pellets":
        case weatherCondition === "light showers of ice pellets":
        case weatherCondition === "moderate or heavy showers of ice pellets":

            icon_name = "icy.svg";

            break;
    
        case weatherCondition === "thundery outbreaks possible":

            icon_name = "strong_thunderstorms.svg";

            break;
    
        case weatherCondition === "wind":

            icon_name = "windy_breezy.svg";

            break;
    
        default:
            
            icon_name = "unknown";
            
            break;

        // Directly unsupported conditions (conditional evaluation required through logic) :-

        /*
            cloudy with sunny
            cloudy_with_snow 
            sunny with snow
            sunny and cloudy
            sunny with cloudy
            sunny with rain
            mostly clear day / night
            mostly cloudy day / night
            tropical storm hurricane
            tornado
            very hot
            very cold
        */
    }    
            
    return folder_path + icon_name;
};

const updateWeatherData = async (search_location) => {

    const weatherDataObject = await getWeatherData(search_location);

    if (weatherDataObject !== null) {

        // get all the elements to be updated

        const weather_condition_icon = document.querySelector('.weather-condition-icon');
        const temperature_value = document.querySelector('.temperature-value');
        const feels_like_temperature_value = document.querySelector('.feels-like-temperature-value');
        const weather_description = document.querySelector('.weather-description');
        const location = document.querySelector('.location');
        const last_updated_info = document.querySelector('.last-updated-info');
        const humidity_value = document.querySelector('.humidity-value');
        const wind_dir_compass_arrow = document.querySelector('#wind-dir-compass-arrow');
        const wind_speed_value = document.querySelector('.wind-speed-value');

        // update the elements with the fetched data

        const weatherConditon = weatherDataObject.current.condition.text;
        weather_description.innerText = weatherConditon;
        
        const weatherIconPath = getWeatherIconPath(weatherConditon);

        weather_condition_icon.src = weatherIconPath !== "./images/weather-icons/unknown" ? weatherIconPath : weatherDataObject.current.condition.icon;

        temperature_value.innerText = weatherDataObject.current.temp_c;

        feels_like_temperature_value.innerText = weatherDataObject.current.feelslike_c;

        const locationObject = weatherDataObject.location;
        location.innerText = `${locationObject.name}, ${locationObject.country}`;

        last_updated_info.innerText = weatherDataObject.current.last_updated;

        humidity_value.innerText = weatherDataObject.current.humidity;

        wind_speed_value.innerText = weatherDataObject.current.wind_kph;

        wind_dir_compass_arrow.style.transform = `rotate(${weatherDataObject.current.wind_degree}deg)`;
    }
};

const processInput = async () => {

    const search_location = searchbar.value;

    console.log(search_location);

    if (search_location !== "") {

        await updateWeatherData(search_location);

        searchbar.value = "";
    }    
}

search_btn.addEventListener('click', processInput);

document.addEventListener("keyup", (event) => {

    if (event.key === "Enter") {

        processInput();
    }
});

// @param {void}
// @return {object} : returns the current location coordinates of the user (if supported by the device)

const fetchCurrentLocationCoords = () => {

    return new Promise((resolve, reject) => {
        
        if (navigator.geolocation) {
    
            navigator.geolocation.getCurrentPosition((position) => {
            
                resolve(position.coords);
            
            }, (error) => {
            
                console.log(error);
            
                reject(null);
            });

        } else {

            reject(null);
        }
    });
};

const updateWeatherDataUsingCurrentLocation = async () => {

    locate_btn.removeEventListener('click', updateWeatherDataUsingCurrentLocation);
    locate_btn.classList.add('disabled');
    console.log("locate button is disabled");

    const coords = await fetchCurrentLocationCoords();

    console.log(coords);

    if(coords !== null) {

        const latitude = coords.latitude;
        const longitude = coords.longitude;

        await updateWeatherData(`${latitude}, ${longitude}`);

    } else {

        alert("Geolocation is not supported by your device :(\nNo worries! You can still search manually :)");
    }

    locate_btn.addEventListener('click', updateWeatherDataUsingCurrentLocation);
    locate_btn.classList.remove('disabled');
    console.log("locate button is enabled back again");
}

locate_btn.addEventListener('click', updateWeatherDataUsingCurrentLocation);

// const api_request = "http://api.weatherapi.com/v1/current.json?key=6af41b5946e14ac6a3a174318241407&q=Bikaner&aqi=yes";

// fetch(api_request)
//     .then((response) => {
//         response.json()
//             .then((jsonData) => {
//                 console.log(jsonData);
//             });
//     });
// });