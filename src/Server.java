import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;

public class Server {
    private HttpServer httpServer;

    public Server(int port) throws IOException {
        httpServer = HttpServer.create(new InetSocketAddress(port), 0);

        httpServer.createContext("/weather", new WeatherHandler());
        httpServer.setExecutor(null);
    }

    public void start() {
        httpServer.start();
    }

    public void stop() {
        httpServer.stop(0);
    }
}
