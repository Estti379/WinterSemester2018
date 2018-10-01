import javax.swing.*;

public class ClickCount {

    public static void main(String[] args)
    {

        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                JFrame mainWindow = new MainWindow();
                JFrame mainWindow2 = new MainWindow();

            }
        });
    }
}
