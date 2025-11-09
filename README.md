# Weather Fetcher (Java)

A simple command-line Java app to get current weather information for any city, using the free [OpenWeatherMap](https://openweathermap.org/) API.

## Features

- Enter any city name (e.g., `London`, `Bangalore`, `Tokyo`)
- Fetches the current temperature, weather condition, and more
- Easy to run—only uses standard Java libraries

## How It Works

1. Prompts the user for a city name
2. Builds an API request with your [OpenWeatherMap](https://openweathermap.org/) API key
3. Makes a GET request and reads the JSON response
4. Extracts key weather data and displays it

## Getting Started

1. **Clone this repo** to your computer or download the `.java` file
2. **Get your own API key:**  
   - Sign up at [https://openweathermap.org/appid](https://openweathermap.org/appid)
   - Copy your API key
3. **Update your code:**  
   - Replace the placeholder API key in the line  
     `String apiKey = "f8a04e4ef50a4215c1e561f270572584";`
4. **Compile & run:**
javac WeatherFetcher.java
java WeatherFetcher

5. **Sample Output:**
Enter city name (e.g., London): Bangalore
Current temperature in Bangalore: 25.24°C
Condition: Clear sky


## Example API URL

https://api.openweathermap.org/data/2.5/weather?q=London&appid=f8a04e4ef50a4215c1e561f270572584&units=metric

text

## Credits

- Powered by [OpenWeatherMap API](https://openweathermap.org/api)
- Java CLI app by Vishnu (replace with your actual name!)

## License

This project is for educational and personal portfolio use.  
Follow [OpenWeatherMap terms](https://openweathermap.org/price) for API usage limits.
