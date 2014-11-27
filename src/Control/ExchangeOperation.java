package Control;

import Model.Currency;
import Model.CurrencySet;
import Model.Money;
import Model.Exchange;
import Model.ExchangeRate;
import Persistance.ExchangeRateLoader;
import Process.Exchanger;
import UI.ExchangeDialog;
import UI.MoneyDisplay;
import java.util.Scanner;


public class ExchangeOperation {
    
    private double rate;
    private Currency currencyFrom, currencyTo;
    private CurrencySet currencySet = new CurrencySet();
    private MoneyDisplay moneyDisplay = new MoneyDisplay();
    private Money money = new Money(200, currencyFrom);
    private Exchanger exchanger = new Exchanger();
    private ExchangeRateLoader exchangeRateLoader = new ExchangeRateLoader();
    private ExchangeDialog exchangeDialog = new ExchangeDialog();
    
    
    public void execute (){
        Exchange exchange = readExchange();
        ExchangeRate exchangeRate = readExchangeRate();
        money = calculateExchange();
        displayMoney();
    }

    private Money calculateExchange() {
        return exchanger.operation(money, readExchangeRate());
    }

    private ExchangeRate readExchangeRate() {
        return exchangeRateLoader.load(currencyFrom, currencyTo);
    }

    private Exchange readExchange() {
        return exchangeDialog.execute(currencyTo, money);
    }

    private void displayMoney() {
        
        moneyDisplay.show(money);
    }
}
