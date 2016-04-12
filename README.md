# AirWeather
US Airports weather app
Retrives weather after the user enters the ICAO 4 letters airport code


![Imgur](http://i.imgur.com/HbMnglr.png?1)



## Description:

- Validate user entry (only allows maximum of 4 characters, and only allows letters)
- Displays an error message if the airport corresponding to the code entered is not found, by displaying a snack bar message.
- Uses Retrofit with Gson to manage JSON parsing.
- Persists the last valid airport code entered by the user for the next time the app is relaunched.
