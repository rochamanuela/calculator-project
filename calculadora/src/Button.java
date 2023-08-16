import javax.swing.*;
import java.awt.*;

public class Button extends JButton {
    public Button(String text){
        super(text);
        this.setSize(74, 74);
        this.setBackground(Color.BLACK);
        this.setBackground(new Color(198, 217, 234));
        this.setFont(new Font("Century Gothic", Font.BOLD, 24));
        this.setBorderPainted(false);
    }
}
