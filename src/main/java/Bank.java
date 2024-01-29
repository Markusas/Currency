import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

public class Bank {
    private boolean success;
    private String timestamp;
    private String base;
    private String date;
    private Map<String, Double> rates;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Map<String, Double> getRates() {
        return rates;
    }

    public void setRates(Map<String, Double> rates) {
        this.rates = rates;
    }

    public static void main(String[] args) throws Exception {
        HttpUrlConnection connection = new HttpUrlConnection();
        String allCurrencyAsJson = connection.getAllcurrency();
        ObjectMapper objectMapper = new ObjectMapper();
        Bank bank = objectMapper.readValue(allCurrencyAsJson, Bank.class);
        //test
        System.out.println(bank.rates.get("GBP"));
    }
}
