import javax.swing.*;
import java.awt.*;

public class Sudoku {


public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable(){
        @Override
        public void run() {
            JFrame mainWindow = new JFrame("Sudoku!");
            mainWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            mainWindow.setSize(300,300);
            mainWindow.setResizable(false);

            mainWindow.getContentPane().setLayout(new GridLayout(3,3,5,5));

            JPanel aPanel;
            JTextField aTextField;
            for (int i = 0; i < 9; i++) {
                aPanel = new JPanel();
                aPanel.setLayout(new GridLayout(3,3,2,2));
                for (int j = 0; j < 9 ; j++) {
                    aTextField = new JTextField("", SwingConstants.CENTER);
                    aPanel.add(aTextField);
                }
                mainWindow.add(aPanel);
            }

            mainWindow.setVisible(true);

        }
    });
}
}
