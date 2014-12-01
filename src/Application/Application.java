package Application;

import Persistance.CurrencySetLoader;
import SWING.ApplicationFrame;
import UI.MoneyCalculatorFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class Application {

    public static void main(String[] args) {
        CurrencySetLoader currencySetLoader = new CurrencySetLoader();
        currencySetLoader.load();
        MoneyCalculatorFrame moneyCalculatorFrame = new MoneyCalculatorFrame();
        ApplicationFrame frame = new ApplicationFrame();
        frame.register (new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        }){
        
     }

        
    }
    
}
