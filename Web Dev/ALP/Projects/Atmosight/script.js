const search_btn = document.querySelector(".search-btn");
const searchbar = document.querySelector(".searchbar");
const weather_condition_icon = document.querySelector(".weather-condition-icon");
const locate_btn = document.querySelector('.locate-btn');

const loadLastAccessedLocationData = async () => {

    let lastAccessedWeatherDataObject = null;

    if(localStorage.getItem("lastAccessedWeatherDataObject") === null) {
    
        lastAccessedWeatherDataObject = await updateWeatherDataUsingCurrentLocation();
    
        if (lastAccessedWeatherDataObject !== null) {
    
            localStorage.setItem("lastAccessedWeatherDataObject", JSON.stringify(lastAccessedWeatherDataObject));
    
        } else {
        
            lastAccessedWeatherDataObject = await getWeatherData("New Delhi", false);
    
            if (weatherDataObject !== null) {
                
                updateDataInDOM(lastAccessedWeatherDataObject);
    
                localStorage.setItem("lastAccessedWeatherDataObject", JSON.stringify(lastAccessedWeatherDataObject));
            }
        }
    
    } else {
    
        lastAccessedWeatherDataObject = JSON.parse(localStorage.getItem("lastAccessedWeatherDataObject"));

        updateDataInDOM(lastAccessedWeatherDataObject);
    }
};

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

const getWeatherData = async (search_location, isLocationManuallySent) => {
    
    const api_request = `https://api.weatherapi.com/v1/current.json?key=6af41b5946e14ac6a3a174318241407&q=${search_location}&aqi=yes`;
    
    const response = await fetch(api_request);

    // if response code is 200 (Status OK)

    if (response.status === 200) {

        const weatherDataObject = await getJSONData(response);

        localStorage.setItem("lastAccessedWeatherDataObject", JSON.stringify(weatherDataObject));

        console.log(weatherDataObject);

        return weatherDataObject;
    }

    // if response code is 400 (Bad Request)

    else if (response.status === 400) {

        if (isLocationManuallySent) {

            alert("Location not found! Please enter a valid location!");

        } else {

            alert("We are having trouble finding your location automatically :(\nPlease try searching it manually!");
        }

    } else {

        console.log(response);
    }

    return null;
};

const getWeatherIconPath = (weatherCondition, isDay, temperature) => {

    // remove the sunny, clear, and moon class of old icon (if exists any)

    weather_condition_icon.classList.remove("sunny", "clear", "moon");

    weatherCondition = weatherCondition.toLowerCase();

    let folder_path = "./images/weather-icons/";
    let icon_name;

    switch (true) {

        case weatherCondition === "sunny":

            if (temperature >= 45) {

                icon_name = "very_hot.png";

            } else {

                icon_name = "clear_day.svg";
                weather_condition_icon.classList.add("sunny");
            }

            break;

        case weatherCondition === "clear":

            icon_name = "clear_night.svg";
            weather_condition_icon.classList.add("clear", "moon");

            break;
    
        case weatherCondition === "partly cloudy":

            if (isDay) {

                icon_name = "partly_cloudy_day.svg";
            }

            else {
                
                icon_name = "partly_cloudy_night.svg";
                weather_condition_icon.classList.add("moon");
            }

            break;

        case weatherCondition === "cloudy":

            icon_name = "cloudy.svg";

            break;

        case weatherCondition === "overcast":

            if (isDay) {

                icon_name = "mostly_cloudy_day.svg";
            }

            else {
                
                icon_name = "mostly_cloudy_night_.svg";
                weather_condition_icon.classList.add("moon");
            }
            
            break;
    
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

            icon_name = isDay ? "scattered_showers_day.svg" : "scattered_showers_night.svg";

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

            icon_name = isDay ? "isolated_scattered_thunderstorms_day.svg" : "isolated_scattered_thunderstorms_night.svg";

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

            if (temperature <= -30) {

                icon_name = "very_cold.svg";

            } else {

                icon_name = "heavy_snow.svg";
            }
            
            break;

        case weatherCondition === "light snow showers":

            if (isDay) {

                icon_name = "scattered_snow_showers_day.svg";
            }

            else {
                
                icon_name = "scattered_snow_showers_night.svg";
                weather_condition_icon.classList.add("moon");
            }

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
            cloudy with snow 
            sunny with snow
            sunny and cloudy
            sunny with cloudy
            sunny with rain
            mostly clear day / night
            tropical storm hurricane
            tornado
            very hot
            very cold
        */
    }    
            
    return folder_path + icon_name;
};

const updateDataInDOM = (weatherDataObject) => {

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

        const isDay = weatherDataObject.current.is_day === 1 ? true : false;
        
        const temperature = weatherDataObject.current.temp_c;
        temperature_value.innerText = temperature;

        const weatherIconPath = getWeatherIconPath(weatherConditon, isDay, temperature);

        weather_condition_icon.src = weatherIconPath !== "./images/weather-icons/unknown" ? weatherIconPath : weatherDataObject.current.condition.icon;

        feels_like_temperature_value.innerText = weatherDataObject.current.feelslike_c;

        const locationObject = weatherDataObject.location;
        location.innerText = `${locationObject.name}, ${locationObject.country}`;

        last_updated_info.innerText = weatherDataObject.current.last_updated;

        humidity_value.innerText = weatherDataObject.current.humidity;

        wind_speed_value.innerText = weatherDataObject.current.wind_kph;

        wind_dir_compass_arrow.style.transform = `rotate(${weatherDataObject.current.wind_degree}deg)`;
};

const updateWeatherData = async (search_location, isLocationManuallySent) => {

    const weatherDataObject = await getWeatherData(search_location, isLocationManuallySent);

    if (weatherDataObject !== null) {

        updateDataInDOM(weatherDataObject);
    }

    return weatherDataObject;
};

const processUserInput = async () => {

    const search_location = searchbar.value;

    console.log(search_location);

    if (search_location !== "") {

        await updateWeatherData(search_location, true);

        searchbar.value = "";
    }    
}

search_btn.addEventListener('click', processUserInput);

document.addEventListener("keyup", (event) => {

    if (event.key === "Enter") {

        processUserInput();
    }
});

// @return {string} : returns the current permission status of the location
//
// i.   granted: The user has granted permission to access location information.
// ii.  denied: The user has denied permission to access location information.
// iii. prompt: The browser is currently prompting the user for permission.

// const checkLocationPermission = async () => {

//     try {

//         const permissionStatus = await navigator.permissions.query({ name: 'geolocation' });
//         return permissionStatus.state;

//     } catch (error) {

//         console.log(error);
//         return 'error';
//     }
// };

// @param {void}
// @return {object} : returns the current location coordinates of the user (if supported by the device)

const fetchCurrentLocationCoords = () => {

    return new Promise((resolve, reject) => {
        
        if (navigator.geolocation) {
    
            navigator.geolocation.getCurrentPosition((position) => {
            
                resolve(position.coords);
            
            }, (error) => {
            
                switch(error.code) {

                    case error.PERMISSION_DENIED:

                        alert("You have denied the request to provide access to location services!\n\nPlease enable them in the permissions option near the search bar or in your browser settings!");
                        break;

                    case error.TIMEOUT:
                            
                        alert("The request to access your location information has timed out!");
                        break;

                    case  error.POSITION_UNAVAILABLE:

                        alert("Your location information is currently unavailable!\nNo worries! You can still search manually :)");
                        break;

                    default:
                        
                        alert("An unknown error occurred while trying to access your location information!\nNo worries! You can try again or search manually :)");
                        break;
                }

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
    // console.log("locate button is disabled");

    try {
        
        const coords = await fetchCurrentLocationCoords();
    
        console.log(coords);
    
        if(coords !== null) {
    
            const latitude = coords.latitude;
            const longitude = coords.longitude;
    
            const weatherDataObject = await updateWeatherData(`${latitude}, ${longitude}`, false);

            return weatherDataObject;
    
        } else {
    
            alert("Geolocation is not supported by your device :(\nNo worries! You can still search manually :)");

            return null;
        }

    } catch (error) {

        console.error("An error occurred while trying to fetch the current location coordinates!");

        return null;
    }

    finally {

        locate_btn.addEventListener('click', updateWeatherDataUsingCurrentLocation);
        locate_btn.classList.remove('disabled');
    }

    // console.log("locate button is enabled back again");
}

locate_btn.addEventListener('click', updateWeatherDataUsingCurrentLocation);

// we will have to use an IIFE, or a function (simple / arrow) and call it below
// because await can only be used inside an async function or at the top level of a module.

(async () => {

    await loadLastAccessedLocationData()

})();

// const api_request = "http://api.weatherapi.com/v1/current.json?key=6af41b5946e14ac6a3a174318241407&q=Bikaner&aqi=yes";

// fetch(api_request)
//     .then((response) => {
//         response.json()
//             .then((jsonData) => {
//                 console.log(jsonData);
//             });
//     });
// });