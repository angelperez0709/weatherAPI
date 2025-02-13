import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import handlers.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WeatherHandler implements HttpHandler {
    private final Map<String, HandlerMethod> commands = new HashMap<>();

    public WeatherHandler() {
        this.commands.put("GET", new GetHandler());
        this.commands.put("PUT", new PutHandler());
        this.commands.put("POST", new PostHandler());
        this.commands.put("DELETE", new DeleteHandler());
    }

    @Override
    public void handle(HttpExchange httpExchange) throws IOException {
        HandlerMethod handler = this.commands.get(httpExchange.getRequestMethod());
        String response = handler.handle(httpExchange);

        httpExchange.sendResponseHeaders();

    }

    public void sendResponse(){

    }

}
