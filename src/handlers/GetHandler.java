package handlers;

import com.sun.net.httpserver.HttpExchange;
import handlers.HttpCommand;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class GetCommand implements HttpCommand {
    private static final String API_KEY = "MY_API_KEY";
    private static final String BASE_URL = "https://weather.visualcrossing.com/VisualCrossingWebServices/rest/services/timeline/";

    public void execute(HttpExchange exchange) {
        String query = exchange.getRequestURI().getQuery();
        if (query != null && query.contains("location=")) {
            String location = query.split("location=")[1];
        }
    }

}
