import javax.swing.JFrame;

public class MyFrame  extends JFrame
{
    public MyFrame()
    {
        setTitle("Hello World");
        setContentPane(new MyPanel());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setVisible(true);
    }
}