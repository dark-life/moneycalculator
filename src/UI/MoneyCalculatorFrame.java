package UI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MoneyCalculatorFrame extends JFrame{

    public JButton buttonCalculate;
    public JButton buttonClose;
    
    
    public MoneyCalculatorFrame() {
        setTitle("Money Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(300, 300));
        createComponents();
        setVisible(true);
        
        
    }

    private void createComponents() {
        add(createExchangeDialog());
        add(createToolbar(), BorderLayout.SOUTH);
    }
    
    private JPanel createExchangeDialog() {
        JPanel panel = new JPanel();
        panel.add(new MoneyDialog());
        panel.add(new CurrencyDialog());
        return panel;
    }

    private JPanel createToolbar() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        panel.add(createCalculateButton());
        panel.add(createCloseButton());
        return panel;
    }

    private JButton createCalculateButton() {
        buttonCalculate = new JButton("Calculate");
        buttonCalculate.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Calculating...");
            }
        });
        return buttonCalculate;
    }

    private JButton createCloseButton() {
        buttonClose = new JButton("Close");
        buttonClose.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                MoneyCalculatorFrame.this.dispose();
            }
        });
        return buttonClose;
    }

    
}