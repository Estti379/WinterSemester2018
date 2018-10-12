import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener
{
    JTextField euros;
    JTextField bitcoins;

    public Controller   (JTextField T1,JTextField T2)
    {
        euros      =   T1;
        bitcoins   =   T2;

        // ADD CODE HERE
    }

    public void actionPerformed  (ActionEvent e)
    {

        double middleState;

        if (e.getSource() == euros) {
            middleState = Double.parseDouble( euros );


        } else if (e.getSource() == bitcoins) {

        }

    }

}