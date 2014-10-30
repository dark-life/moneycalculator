package Model;

public class ExchangeRate {
    private final Currency currencyTo;
    private final Currency currencyFrom;
    private final double rate;

    public ExchangeRate(Currency currencyTo, Currency currencyFrom, double rate) {
        this.currencyTo = currencyTo;
        this.currencyFrom = currencyFrom;
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }


    public Currency getCurrencyTo() {
        return currencyTo;
    }

    public Currency getCurrencyFrom() {
        return currencyFrom;
    }
    
    
}
