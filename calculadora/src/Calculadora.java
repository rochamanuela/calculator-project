import java.awt.*;

import javax.swing.*;
//import javax.swing.UIManager;

public class Calculadora extends JFrame {
    public Calculadora() {
        super("Calculadora");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(360, 400);
        setLocation(700, 200);
        setBackground(Color.BLACK);

        setLayout(new BorderLayout());

        TextPanel textPanel = new TextPanel();
        add(BorderLayout.NORTH, textPanel);

        JPanel digitsPanel = new JPanel();
        digitsPanel.setLayout(new BorderLayout());
        digitsPanel.add(BorderLayout.CENTER, new NumbersPanel(textPanel.getTxtNumber()));
        digitsPanel.add(BorderLayout.EAST, new OperationsPanel(textPanel.getTxtNumber()));

        add(BorderLayout.CENTER, digitsPanel);
        setVisible(true);
    }

    public static void main(String[] args) throws Exception{
        new Calculadora();
    }
}