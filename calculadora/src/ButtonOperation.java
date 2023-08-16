import javax.swing.*;
import java.awt.*;

public class ButtonOperation extends JButton {
    public ButtonOperation(String text){
        super(text);
        this.setSize(74, 74);
        this.setBackground(new Color(132, 178, 222));
        this.setForeground(new Color(20,99, 174));
        this.setFont(new Font("Century Gothic", Font.BOLD, 24));
        this.setBorderPainted(false);
    }
}
