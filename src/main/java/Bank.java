import java.util.Map;

public class Bank {
    private boolean success;
    private String timestamp;
    private String base;
    private String date;
    private Map<String, Double> rates;

    public static void main(String[] args) throws Exception {
        HttpUrlConnection connection = new HttpUrlConnection();
        connection.getAllcurrency();
    }
}
