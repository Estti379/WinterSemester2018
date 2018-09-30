import java.awt.*;
import javax.swing.*;

public class MyPanel  extends JPanel {
    public MyPanel() {
        setBackground(Color.GREEN);
        setLayout(new GridLayout(2, 2));
        add(new JLabel("Hello"));
        add(new JButton("Button 1"));
        add(new JButton("Button 2"));
        add(new JLabel("World"));
    }
}

