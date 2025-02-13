package handlers;

import com.sun.net.httpserver.HttpExchange;

public class GetHandler extends ReaderHandler implements HandlerMethod {
    public String handle(HttpExchange exchange) {
        String query = exchange.getRequestURI().getQuery();
        String path = exchange.getRequestURI().getPath();
        getData(path);
        return null;
    }

}
