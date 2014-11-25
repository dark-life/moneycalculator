package Process;

import Model.ExchangeRate;
import Model.Money;

public class Exchanger {

    public Money operation (Money money,ExchangeRate exchangeRate){
        
        return new Money(money.getAmount() * exchangeRate.getRate(), exchangeRate.getCurrencyTo());
    }
}
