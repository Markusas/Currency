import com.fasterxml.jackson.databind.ObjectMapper;

import java.math.BigDecimal;

public class CurrencyController {
    HttpUrlConnection connection = new HttpUrlConnection();

    public CurrencyResponse getAllcurrency() throws Exception {
        String allCurrencyAsJson = connection.responseFromBankAPI("EUR");
        ObjectMapper objectMapper = new ObjectMapper();
        CurrencyResponse currencyResponse = objectMapper.readValue(allCurrencyAsJson, CurrencyResponse.class);
        return currencyResponse;
    }

    public BigDecimal getRate(String from, Integer amount) throws Exception {
        CurrencyResponse allcurrency = getAllcurrency();
        Currency currency = new Currency(from, allcurrency.getRates().get(from), allcurrency.getDate());
        return currency.getRate().multiply(BigDecimal.valueOf(amount));
    }
}
