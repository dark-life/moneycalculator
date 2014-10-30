package Model;

import java.util.HashMap;

public class CurrencySet {
   private final HashMap <String,Currency> currencySet;

    public CurrencySet() {
        currencySet = new HashMap<>();
        currencySet.put("$", new Currency("USA","$","Dolar"));
        currencySet.put("£", new Currency("GBP","£","Libra"));
        currencySet.put("€", new Currency("EUR","€","Euro"));
        currencySet.put("┴", new Currency("SS","┴","Suso"));
    }
}
