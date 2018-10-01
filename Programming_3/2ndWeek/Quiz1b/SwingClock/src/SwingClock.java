import javax.swing.*;
import java.awt.event.*;
import java.util.Date;

public class SwingClock {
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run() {
                JFrame mainWindow = new JFrame("Current Time");
                mainWindow.setVisible(true);
                mainWindow.setSize(200,100);

                JLabel clock = new JLabel("The time is ", SwingConstants.CENTER);
                mainWindow.add(clock);

                Timer timer = new Timer(1000, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Date today = new Date();
                        clock.setText("The time is " + today.getHours() + ":"
                                                     + today.getMinutes() + ":"
                                                     + today.getSeconds() );
                    }
                });

                timer.start();
            }
        });
    }
}
