package Model;

import java.util.HashMap;

public class CurrencySet {
   private  HashMap <String,Currency> currencySet;

    public void add (Currency currency){
        currencySet.put(currency.getCode(), currency);
    }

    
}
