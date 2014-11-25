package UI;

import Model.Money;

public class MoneyDisplay {
    public void show (Money money){
        System.out.println(money.getAmount()+ " " + money.getCurrency().getSymbol());
    }
}
