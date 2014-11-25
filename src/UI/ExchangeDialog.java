package UI;

import Model.Currency;
import Model.Exchange;
import Model.Money;

public class ExchangeDialog {

    public Exchange execute(Currency currency, Money money){
        return new Exchange(money, currency);
    }
}
