import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpUrlConnection {
    static String API_KEY = "f3a1b7e47c449089b21c0fd5cc904d59";

    public static void main(String[] args) throws IOException, InterruptedException {
        //I will move it to another class
        var client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder(URI.create(String.format("http://data.fixer.io/api/latest?access_key=%s", API_KEY)))
                .header("accept", "application/json")
                .build();

        var response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}