import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class HelloWorld
{
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(
                new Runnable()
            {
                public void run()
                {
                    JFrame F      =   new JFrame("Hello World");
                    F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    F.setSize(400, 300);
                    F.setVisible(true);
                }
            }
            );
    }
}
