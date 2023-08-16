import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NumbersPanel extends JPanel implements ActionListener{
    
    private JTextField txtText;
    
    public NumbersPanel(JTextField txtText) {
        this.txtText = txtText;

        setLayout(new GridLayout(4, 3));

        Button btn1 = new Button("1");
        btn1.addActionListener(this);
        add(btn1);

        Button btn2 = new Button("2");
        btn2.addActionListener(this);
        add(btn2);

        Button btn3 = new Button("3");
        btn3.addActionListener(this);
        add(btn3);

        Button btn4 = new Button("4");
        btn4.addActionListener(this);
        add(btn4);

        Button btn5 = new Button("5");
        btn5.addActionListener(this);
        add(btn5);

        Button btn6 = new Button("6");
        btn6.addActionListener(this);
        add(btn6);

        Button btn7 = new Button("7");
        btn7.addActionListener(this);
        add(btn7);

        Button btn8 = new Button("8");
        btn8.addActionListener(this);
        add(btn8);

        Button btn9 = new Button("9");
        btn9.addActionListener(this);
        add(btn9);

        Button empty1 = new Button("");
        empty1.addActionListener(this);
        add(empty1);

        Button btn0 = new Button("0");
        btn0.addActionListener(this);
        add(btn0);

        Button empty2 = new Button("");
        empty2.addActionListener(this);
        add(empty2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(txtText.getText().length() == 10){
            return;
        }

        JButton btn = (JButton) e.getSource();
        String number = btn.getText();
        txtText.setText(txtText.getText() + number);
    }
}

