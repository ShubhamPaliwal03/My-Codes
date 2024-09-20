import React from 'react';
import {FontAwesomeIcon} from '@fortawesome/react-fontawesome'
import {faLocationDot} from '@fortawesome/free-solid-svg-icons'
import {getWeatherData, getWeatherIconPath} from './utils.js';

function App() {

  const [value, setValue] = React.useState("");

  function handleInput (e) {

    setValue(e.target.value);
  }

  const [weatherDataObj, setWeatherDataObj] = React.useState({

    "weatherCondition" : "--",
    "isDay" : "--",
    "temperature" : "--",
    "weatherIconPath"  : "--",
    "weatherIconSubstitute" : null,
    "feelsLikeTemperature" : "--",
    "lastUpdated" : "--",
    "humidity" : "--",
    "windSpeed" : "--",
    "windDirection" : "--",
    "locationObject" : {

          "name" : "--",
          "country" : "--"
      },
  });

  async function handleSearchClick() {

    const search_location = value;

    if (search_location == "") {

      return;
    }

    const currWeatherObj = await getWeatherData(search_location, true);

    const weatherCondition = currWeatherObj.current.condition.text;
    const isDay = currWeatherObj.current.is_day === 1 ? true : false;
    const temperature = currWeatherObj.current.temp_c;

    setWeatherDataObj({

      "weatherCondition" : weatherCondition,

      "isDay" : isDay,

      "temperature" : temperature,

      "weatherIconPath"  : getWeatherIconPath(weatherCondition, isDay, temperature),

      "weatherIconSubstitute" : currWeatherObj.current.condition.icon,

      "feelsLikeTemperature" : currWeatherObj.current.feelslike_c,

      "lastUpdated" : currWeatherObj.current.last_updated,

      "humidity" : currWeatherObj.current.humidity,

      "windSpeed" : currWeatherObj.current.wind_kph,

      "windDirection" : currWeatherObj.current.wind_degree,

      "locationObject" : {

            "name" : currWeatherObj.location.name,
            "country" : currWeatherObj.location.country,
        },
    });

    setValue("");
  }

  // function handleLocateClick () {


  // }

  const searchbarRef = React.useRef(null)

  function widenSearchBar() {

    const searchbar = searchbarRef.current;

    const curr_width = searchbar.clientWidth / 16;

    searchbar.style.width = (curr_width + 3).toString()+"rem";
  }

  function narrowSearchBar() {

    const searchbar = searchbarRef.current;

    const curr_width = searchbar.clientWidth / 16;

    searchbar.style.width = (curr_width - 3).toString()+"rem";
  }

  return (
    <div className="bg-custom-gradient h-[38rem] w-[24rem] rounded-[15px] flex flex-col justify-evenly items-center gap-[0.5rem]">
      {/* Search Bar Section */}
      <div className="mt-4 flex flex-row justify-center items-center gap-4">
        <input
          ref={searchbarRef}
          onChange={handleInput}
          onFocus={widenSearchBar}
          onBlur={narrowSearchBar}
          className="text-black text-lg h-10 rounded-[15px] border-none outline-none px-4 transition-width duration-500 ease-in-out max-w-[calc(24rem*0.58)]"
          type="search"
          placeholder="Enter a location"
        />
        <div
          onClick={handleSearchClick}
          className="h-10 w-10 bg-white rounded-full cursor-pointer flex justify-center items-center"
          title="Search"
        >
          <img className="h-6" src="./images/search.png" alt="Search icon" />
        </div>
        <div
          className="h-10 w-10 bg-white text-black rounded-full cursor-pointer flex justify-center items-center"
          title="Use Current Location"
        >
          <FontAwesomeIcon icon={faLocationDot} className='scale-150 text-gray-700'/>
        </div>
      </div>

      {/* Weather Information Section */}
      <div className="flex flex-col justify-evenly items-center gap-[0.5rem]">
        <img className="h-28 my-6 weather-condition-icon" src={weatherDataObj.weatherIconPath === "./images/weather-icons/unknown" ? weatherDataObj.weatherIconSubstitute : weatherDataObj.weatherIconPath} alt="--" />
        <h1 className="mt-[-0.5rem] mb-[0.5rem]">
          <span className="temperature-value text-4xl font-bold">{weatherDataObj.temperature}</span><span className='text-4xl font-bold'>&deg;</span><span className='text-4xl font-bold'>C</span>
        </h1>
        <br />
        <span>
          Feels like <span className="feels-like-temperature-value">{weatherDataObj.feelsLikeTemperature}</span>&deg;C
        </span>
        <h2 className="mt-[0.5rem] mb-[0.5rem] weather-description text-2xl font-semibold">{weatherDataObj.weatherCondition}</h2>
        <h3 className="location text-xl font-medium mb-[0.5rem]">{`${weatherDataObj.locationObject.name}, ${weatherDataObj.locationObject.country}`}</h3>
        <small className='text-sm font-medium'>
          Last Updated <span className="last-updated-info">{weatherDataObj.lastUpdated}</span>
        </small>
      </div>

      {/* Humidity and Wind Information Section */}
      <div className="flex flex-row justify-center items-center gap-4">
        <div className="humidity-info flex flex-row justify-center items-center gap-4">
          <img className="humidity-icon h-8" src="./images/humidity.png" alt="Humidity icon" />
          <div className="flex flex-col justify-evenly items-center gap-[0.5rem]">
            <div>
              <span className="humidity-value">{weatherDataObj.humidity}</span>%
            </div>
            <div>Humidity</div>
          </div>
        </div>
        <div className="wind-info flex flex-row justify-center items-center gap-4">
          <div id="wind-dir-compass" className="relative flex justify-center items-center">
            <img
              id="wind-dir-compass-outer"
              className="invert h-20"
              src="./images/compass-icon-outer.png"
              alt="Wind direction compass"
            />
            <img
              id="wind-dir-compass-arrow"
              className={`absolute transition-transform duration-500 ease-in-out`}
              style={{transform: `rotate(${weatherDataObj.windDirection}deg)`}}
              src="./images/compass-icon-arrow.png"
              alt="Compass arrow"
            />
          </div>
          <div className="flex flex-col justify-evenly items-center gap-[0.5rem]">
            <div>
              <span className="wind-speed-value">{weatherDataObj.windSpeed}</span> kph
            </div>
            <div>Wind</div>
          </div>
        </div>
      </div>
    </div>
  );
}
  
export default App;