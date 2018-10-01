import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainWindow extends JFrame {

    private JLabel counterPanel;
    private JButton countButton;
    private int  count = 0;

    public MainWindow(){
        setTitle("Click Counter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setResizable(false);
        setSize(200, 100);


        counterPanel = new JLabel("Click count: " + count, SwingConstants.CENTER);

        countButton = new JButton("Click HERE");
        add(counterPanel);
        add(countButton, BorderLayout.SOUTH);

        countButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                count = count + 1;
                counterPanel.setText("Click count: " + count);
            }
        });

        setVisible(true);


    }


}
