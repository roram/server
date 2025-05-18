import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class App {
  public static void main(String[] args) throws IOException {

    // Crear servidor HTTP en el puerto 8080
    HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);

    // Configurar manejador de la ruta /hello
    server.createContext("/hello", new HttpHandler() {
      @Override
      public void handle(HttpExchange exchange) throws IOException {
        String response = "¡Hola Mundo!"; //Este es mi mensaje a enviar

        // Establecer el tipo de contenido y la codificación
        exchange.getResponseHeaders().set("Content-Type", "text/plain; charset=UTF-8");

        byte[] responseBytes = response.getBytes(); // Lo transformo a bytes ya que el protocolo de HTTP utiliza bytes, lo mismo que Java al codificar el mensaje.

        exchange.sendResponseHeaders(200, responseBytes.length);
        try (OutputStream os = exchange.getResponseBody()){
          os.write(response.getBytes());
        }
      }
    });

    // Iniciar el servidor
    server.start();
    System.out.println("Servidor iniciado en el puerto 8080");
  }
}
