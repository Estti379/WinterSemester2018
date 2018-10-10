import javax.swing.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                JFrame frame = new JFrame();


                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                frame.setVisible(true);

                frame.setSize(500,400);

                //JPanel panel = new JPanel();
                //frame.getContentPane().add(panel);



            }
        });

    }
}