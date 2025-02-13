package handlers;


import services.WeatherService;

public class ReaderHandler {
    public String getData(String params) {
        return WeatherService.fetchWeatherData(params);
    }
}
