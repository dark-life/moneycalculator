package Application;

import Control.ExchangeOperation;
import Persistance.CurrencySetLoader;




public class Main {

    public static void main(String[] args) {
        CurrencySetLoader currencySetLoader = new CurrencySetLoader();
        currencySetLoader.load();
        
        new ExchangeOperation().execute();
    }
    
}
