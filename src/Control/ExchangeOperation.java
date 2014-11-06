package Control;

import Model.Exchange;
import Model.ExchangeRate;
import Model.Money;


public class ExchangeOperation {
    
    
    public void execute (){
        Exchange exchange = readExchange();
        ExchangeRate exchangeRate = readExchangeRate();
        Money money = calculateExchange();
        displayMoney();
    }

    private Money calculateExchange() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private ExchangeRate readExchangeRate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Exchange readExchange() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayMoney() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
