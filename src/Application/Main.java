package Application;

import Control.ExchangeOperation;
import Persistance.CurrencySetLoader;
import UI.MoneyCalculatorFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class Main {

    public static void main(String[] args) {
        CurrencySetLoader currencySetLoader = new CurrencySetLoader();
        currencySetLoader.load();
        MoneyCalculatorFrame moneyCalculatorFrame = new MoneyCalculatorFrame();
        moneyCalculatorFrame.buttonCalculate.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                new ExchangeOperation().execute();
            }
            
            
        });
        
    }
    
}
