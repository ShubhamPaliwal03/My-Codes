import React from 'react';
import {
  View,
  Text,
  Image,
  TextInput,
  TouchableOpacity,
  StyleSheet,
  Alert,
} from 'react-native';
import { LinearGradient } from 'expo-linear-gradient'; // Import LinearGradient
import { Ionicons } from '@expo/vector-icons'; // Using Ionicons for icons
import { getWeatherData, getWeatherIconPath } from './utils.js';

function App() {
  const [value, setValue] = React.useState("");

  function handleInput(e) {
    setValue(e.nativeEvent.text); // Use nativeEvent.text for React Native
  }

  const [weatherDataObj, setWeatherDataObj] = React.useState({
    weatherCondition: "--",
    isDay: "--",
    temperature: "--",
    weatherIconPath: "--",
    weatherIconSubstitute: null,
    feelsLikeTemperature: "--",
    lastUpdated: "--",
    humidity: "--",
    windSpeed: "--",
    windDirection: "--",
    locationObject: {
      name: "--",
      country: "--",
    },
  });

  async function handleSearchClick() {
    const search_location = value;
    if (search_location == "") {
      return;
    }
    const currWeatherObj = await getWeatherData(search_location, true);
    const weatherCondition = currWeatherObj.current.condition.text;
    const isDay = currWeatherObj.current.is_day === 1;
    const temperature = currWeatherObj.current.temp_c;

    setWeatherDataObj({
      weatherCondition,
      isDay,
      temperature,
      weatherIconPath: getWeatherIconPath(weatherCondition, isDay, temperature),
      weatherIconSubstitute: currWeatherObj.current.condition.icon,
      feelsLikeTemperature: currWeatherObj.current.feelslike_c,
      lastUpdated: currWeatherObj.current.last_updated,
      humidity: currWeatherObj.current.humidity,
      windSpeed: currWeatherObj.current.wind_kph,
      windDirection: currWeatherObj.current.wind_degree,
      locationObject: {
        name: currWeatherObj.location.name,
        country: currWeatherObj.location.country,
      },
    });

    setValue("");
  }

  return (
    <LinearGradient
      colors={['#4c669f', '#3b5998', '#192f6a']} // Replace with your gradient colors
      style={styles.container} // Apply styles
    >
      {/* Search Bar Section */}
      <View style={styles.searchBar}>
        <TextInput
          value={value}
          onChange={handleInput}
          style={styles.searchInput}
          placeholder="Enter a location"
        />
        <TouchableOpacity onPress={handleSearchClick} style={styles.searchButton}>
          <Ionicons name="search" size={24} color="black" />
        </TouchableOpacity>
        <TouchableOpacity style={styles.locationButton}>
          <Ionicons name="location-outline" size={24} color="black" />
        </TouchableOpacity>
      </View>

      {/* Weather Information Section */}
      <View style={styles.weatherInfo}>
        <Image
          style={styles.weatherIcon}
          source={{ uri: weatherDataObj.weatherIconPath === "./images/weather-icons/unknown" ? weatherDataObj.weatherIconSubstitute : weatherDataObj.weatherIconPath }}
          alt="Weather Icon"
        />
        <Text style={styles.temperature}>
          {weatherDataObj.temperature}°C
        </Text>
        <Text>
          Feels like {weatherDataObj.feelsLikeTemperature}°C
        </Text>
        <Text style={styles.weatherCondition}>
          {weatherDataObj.weatherCondition}
        </Text>
        <Text style={styles.location}>
          {`${weatherDataObj.locationObject.name}, ${weatherDataObj.locationObject.country}`}
        </Text>
        <Text style={styles.lastUpdated}>
          Last Updated {weatherDataObj.lastUpdated}
        </Text>
      </View>

      {/* Humidity and Wind Information Section */}
      <View style={styles.humidityWindInfo}>
        <View style={styles.humidityInfo}>
          <Ionicons name="water" size={32} color="black" />
          <Text>{weatherDataObj.humidity}%</Text>
          <Text>Humidity</Text>
        </View>
        <View style={styles.windInfo}>
          <Ionicons name="wind" size={32} color="black" />
          <Text>{weatherDataObj.windSpeed} kph</Text>
          <Text>Wind</Text>
        </View>
      </View>
    </LinearGradient>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
  },
  searchBar: {
    flexDirection: 'row',
    justifyContent: 'center',
    alignItems: 'center',
    marginBottom: 20,
  },
  searchInput: {
    height: 40,
    borderRadius: 20,
    borderWidth: 1,
    borderColor: 'black',
    paddingHorizontal: 10,
    marginRight: 10,
    width: 200,
  },
  searchButton: {
    padding: 10,
    backgroundColor: 'white',
    borderRadius: 20,
  },
  locationButton: {
    padding: 10,
    backgroundColor: 'white',
    borderRadius: 20,
  },
  weatherInfo: {
    alignItems: 'center',
    marginBottom: 20,
  },
  weatherIcon: {
    width: 100,
    height: 100,
  },
  temperature: {
    fontSize: 40,
    fontWeight: 'bold',
  },
  weatherCondition: {
    fontSize: 24,
    fontWeight: 'bold',
  },
  location: {
    fontSize: 18,
  },
  lastUpdated: {
    fontSize: 14,
  },
  humidityWindInfo: {
    flexDirection: 'row',
    justifyContent: 'space-around',
    width: '100%',
  },
  humidityInfo: {
    alignItems: 'center',
  },
  windInfo: {
    alignItems: 'center',
  },
});

export default App;