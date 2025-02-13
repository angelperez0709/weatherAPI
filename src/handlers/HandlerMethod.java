package handlers;

import com.sun.net.httpserver.HttpExchange;

public interface HandlerMethod {
    String handle(HttpExchange httpExchange);
}
