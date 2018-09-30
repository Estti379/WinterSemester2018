import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.GridLayout;


public class HelloWorld1 {
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                JFrame F      =   new JFrame("Hello World");
                F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                F.setSize(400, 300);
                F.setVisible(true);

                JPanel P   =   new JPanel();
                P.setBackground(Color.GREEN);
                P.setLayout(new GridLayout(2, 2));
                P.add(new JLabel("Hello"));
                P.add(new JButton("Button 1"));
                P.add(new JButton("Button 2"));
                P.add(new JLabel("World"));

                F.setContentPane(P);
            }
        });
    }
}
