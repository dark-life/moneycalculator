package Persistance;

import Model.Currency;
import Model.ExchangeRate;

public class ExchangeRateLoader {
    
    
    public ExchangeRate load (Currency currencyIn, Currency currencyOut){
        
        return new ExchangeRate(new Currency("EUR", "€", "Euro"), new Currency("GBP", "£", "Libra"), 1.2);
    }
}
