package SWING;

import Model.Currency;
import Model.Exchange;
import Model.Money;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class ExchangeDialogPanel {

    private Exchange exchange;
    private Currency fromCurrency;
    private Currency toCurrency;
    private double amount;
    
    public ExchangeDialogPanel(){
        //this.add(createAmountField());
        //this.add(createAmountField());
        //this.add(createAmountField());
        
    }
    public Exchange getExchange(){
        return new Exchange(new Money(amount, fromCurrency), toCurrency);
    }
    
    private JTextField createAmountField(){
        JTextField text = new JTextField();
        text.addInputMethodListener(new InputMethodListener() {

            @Override
            public void inputMethodTextChanged(InputMethodEvent event) {
                try{
                amount = Double.parseDouble(text.getText());
                    
                }catch (NumberFormatException e){
                    
                }
            }

            @Override
            public void caretPositionChanged(InputMethodEvent event) {
                
            }
        });
        return text;
    }
    private JComboBox<Currency> createSourceCurrencyField(){
        return null;
    }
}
