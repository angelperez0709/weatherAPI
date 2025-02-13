package services;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class WeatherService {
    private static final String API_KEY = "TU_CLAVE_API"; // Sustituye con tu clave real
    private static final String BASE_URL = "https://weather.visualcrossing.com/VisualCrossingWebServices/rest/services/timeline/";

    public static String fetchWeatherData(String queryParams) {
        try {

            // Build URL
            String apiUrl = "https://api.weatherapi.com/v1/current.json?key=TU_API_KEY&" + queryParams;

            // Create HTTP client
            HttpClient client = HttpClient.newHttpClient();

            // Build Get request
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(apiUrl))
                    .GET()
                    .build();

            // Send petition and retrieve response
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Check response
            if (response.statusCode() == 200) {
                return response.body();
            } else {
                return "{\"error\": \"Error al obtener datos. Código: " + response.statusCode() + "\"}";
            }
        } catch (IOException | InterruptedException e) {
            return "{\"error\": \"Excepción en la solicitud: " + e.getMessage() + "\"}";
        }
    }
}

