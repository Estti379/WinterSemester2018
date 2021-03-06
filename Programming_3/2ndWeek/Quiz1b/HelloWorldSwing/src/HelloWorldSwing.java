import javax.swing.*;

public class HelloWorldSwing
{

    private static void initGUI()
    {
        JFrame frame = new JFrame("HelloWorldSwing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(400, 400);
        frame.setResizable(false);

        JLabel label = new JLabel("Hello World", SwingConstants.CENTER);
        frame.getContentPane().add(label);

        //frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                initGUI();
            }
        });
    }
}