import java.awt.*;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class TextPanel extends JPanel{

    private JTextField txtNumber;

    public TextPanel(){
        setLayout(new FlowLayout());

        txtNumber = new JTextField(15);
        txtNumber.setHorizontalAlignment(JTextField.CENTER);
        txtNumber.setEnabled(true);
        txtNumber.setForeground(new Color(51, 119, 220));
        txtNumber.setBackground(new Color(255, 255, 255));
        txtNumber.setFont(new Font("Century Gothic", Font.BOLD, 24));
        add(txtNumber);
    }

    public JTextField getTxtNumber() {
        return txtNumber;
    }
}
