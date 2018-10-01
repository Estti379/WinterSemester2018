import javax.swing.*;
import javax.swing.text.BadLocationException;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumPad
{
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                JFrame  F = new JFrame("NumPad");
                F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                F.setSize(400, 300);
                F.setVisible(true);
                F.getContentPane().setLayout(new BorderLayout());

                JTextField  T   =   new JTextField();
                F.getContentPane().add(T,BorderLayout.NORTH);

                JPanel  P = new JPanel();
                F.getContentPane().add(P,BorderLayout.CENTER);

                P.setBackground(Color.GREEN);

                // STEP 2: set layout of panel
                P.setLayout(new GridLayout(4,3));

                // STEP 1: create 12 buttons
                // STEP 3: add buttons to panel
                // STEP 4: add listeners
                //JButton button;
                for(int i = 0; i<12 ; i++) {
                    JButton button = new JButton("" + (i + 1) );
                    P.add(button);
                    if( (i >= 0) && (i <= 10) ) {
                        button.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                T.setText(T.getText() + button.getText());
                            }
                        });
                        if (i == 9) {
                            button.setText(".");
                        } else if (i == 10) {
                            button.setText("0");
                        }

                    } else {
                        button.setText("DEL");
                        button.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                try {
                                    if(T.getText().length() > 0) {
                                        T.setText(T.getText(0, T.getText().length() - 1));
                                    }
                                } catch (BadLocationException error) {
                                    System.exit(1);
                                }
                            }
                        });
                    }

                }

            } });
    }
}
