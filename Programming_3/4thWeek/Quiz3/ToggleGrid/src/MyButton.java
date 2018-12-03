import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyButton extends JButton implements ActionListener
{
    public MyButton()
    {
        // ADD CODE HERE
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        // ADD CODE HERE
        if ( e.getSource() instanceof MyButton) {
            MyButton aButton = (MyButton) e.getSource();

            if(aButton.getText().equals("")){
                aButton.setText("*");
            } else if(aButton.getText().equals("*")){
                aButton.setText("");
            }

        } else {
            System.exit(1);
        }
    }
}

