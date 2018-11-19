import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller extends AbstractAction implements ActionListener
{
    private JTextField euros;
    private JTextField bitcoins;

    private final double euroBitrate = 5540.54 ;

    public Controller   (JTextField T1,JTextField T2)
    {
        euros      =   T1;
        bitcoins   =   T2;

        // ADD CODE HERE
        euros.setAction(this);
        bitcoins.setAction(this);
    }

    @Override
    public void actionPerformed  (ActionEvent e)
    {

        Double middleState;

        if (e.getSource() == euros) {
            middleState = formatInput( euros.getText() );

            if ( middleState == null) {
                bitcoins.setText( "ERROR" );
            } else {
                euros.setText(String.valueOf(middleState));
                bitcoins.setText( String.valueOf( middleState/euroBitrate ) );
            }




        } else if (e.getSource() == bitcoins) {
            middleState = formatInput( bitcoins.getText() );

            if ( middleState == null) {
                euros.setText( "ERROR" );
            } else {
                bitcoins.setText(String.valueOf(middleState));
                euros.setText( String.valueOf( middleState*euroBitrate ) );
            }
        }

    }

    private Double formatInput(String s) {
        int checkComma = 0;

        if (s.equals("") ) {
            return 0.0;
        }
        char c;
        for (int i = 0 ; i < s.length(); i++) {
            c=s.charAt(i);
            if ( s.charAt(i) >=  '0' && s.charAt(i) <=  '9') {
                /* empty */
            } else if (s.charAt(i) ==  ',' || s.charAt(i) ==  '.') {
                if (checkComma < 1 ) { // if there is 1 or less commas, change them to dot's
                    checkComma++;
                    s = s.substring(0, i) + '.' + s.substring(i+1);
                } else { // If more than 2 commas are present, return null
                    return null;
                }
            } else { // if there is anything other than the acceptable characters
                return null;
            }
        }


        return Double.parseDouble(s);
    }

}