import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpUrlConnection {
    public String getAllcurrency() throws Exception {
        String API_KEY = "f3a1b7e47c449089b21c0fd5cc904d59";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(URI.create(String.format("http://data.fixer.io/api/latest?access_key=%s", API_KEY)))
                .header("accept", "application/json")
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }


}