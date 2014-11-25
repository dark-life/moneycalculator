package Persistance;

import Model.Currency;
import Model.CurrencySet;

public class CurrencySetLoader {
    
    
    
    public void load (){
        CurrencySet currencySet = new CurrencySet();
        currencySet.add(new Currency("EUR","€","Euro"));
        currencySet.add(new Currency("USA","$","Dolar"));
        currencySet.add(new Currency("GBP","£","Libra"));
    }
}
