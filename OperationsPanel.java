import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class OperationsPanel extends JPanel implements ActionListener{
    private JTextField txtText;

    private char op;
    private double value1;
    private double value2;

    private ButtonOperation btnAdd;
    private ButtonOperation btnSub;
    private ButtonOperation btnMult;
    private ButtonOperation btnDiv;
    private ButtonOperation btnEq;
    private ButtonOperation btnClear;
    
    public OperationsPanel(JTextField txtText) {
        this.txtText = txtText;

        setLayout(new GridLayout(3, 2));

        btnAdd = new ButtonOperation("+");
        btnAdd.addActionListener(this);
        add(btnAdd);

        btnSub = new ButtonOperation("-");
        btnSub.addActionListener(this);
        add(btnSub);

        btnMult = new ButtonOperation("×");
        btnMult.addActionListener(this);
        add(btnMult);

        btnClear = new ButtonOperation("C");
        btnClear.addActionListener(this);
        add(btnClear);

        btnEq = new ButtonOperation("=");
        btnEq.addActionListener(this);
        add(btnEq);

        btnDiv = new ButtonOperation("÷");
        btnDiv.addActionListener(this);
        add(btnDiv);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (txtText.getText().isEmpty()){
            return;
        }

        JButton btn = (JButton) e.getSource();

        if (btn == btnClear) {
            op = '\u0000';
            txtText.setText("");
        }
        else if (btn == btnEq) {
            value2 = Double.parseDouble(txtText.getText());
            double result = 0.0;

            if (op == '+') { result = value1 + value2; }
            else if (op == '-') { result = value1 - value2; }
            else if (op == '×') { result = value1 * value2; }
            else if (op == '÷') { result = value1 / value2; }

            txtText.setText(String.valueOf(result)); // conversão de um tipo primitivo para uma string
            op = '\u0000';
            value1 = result;
            value2 = 0;
        }
        else {
            op = btn.getText().charAt(0);
            value1 = Double.parseDouble(txtText.getText());
            txtText.setText("");
        }
    }
}
