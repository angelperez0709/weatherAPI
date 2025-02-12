package handlers;

import com.sun.net.httpserver.HttpExchange;

public interface HttpCommand {
    void execute(HttpExchange httpExchange);
}
