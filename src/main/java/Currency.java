import java.math.BigDecimal;

public class Currency {
    private int id;
    private String currencyCode;
    private BigDecimal rate;
    private String updatedOn;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public String getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(String updatedOn) {
        this.updatedOn = updatedOn;
    }

    public Currency(String currencyCode, BigDecimal rate, String updatedOn) {
        this.currencyCode = currencyCode;
        this.rate = rate;
        this.updatedOn = updatedOn;
    }
}
