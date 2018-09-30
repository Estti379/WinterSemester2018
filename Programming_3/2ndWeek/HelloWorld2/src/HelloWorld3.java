import javax.swing.SwingUtilities;

public class HelloWorld3
{
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                new MyFrame();
            }
        });
    }
}
