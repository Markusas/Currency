import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Properties;

public class HttpUrlConnection {
        public String responseFromBankAPI(String arg) throws Exception {
                Properties prop = new Properties();
                InputStream input = getClass().getResourceAsStream("./config.properties");
                prop.load(input);
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder(URI.create(String.format(prop.getProperty("url"), arg)))
                        .header("accept", "application/json")
                        .build();
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
                return response.body();
        }
}