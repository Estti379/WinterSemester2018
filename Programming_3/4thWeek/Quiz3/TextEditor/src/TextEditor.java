import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class TextEditor
{
    static public void main(String[] args) {

        javax.swing.SwingUtilities.invokeLater(new Runnable()
        {
            public void run() {
                JFrame F    =    new    JFrame();
                F.setTitle("Texteditor Exercice");
                F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                F.getContentPane().setBackground(Color.WHITE);

                JTextArea mainText = new JTextArea();
                F.getContentPane().add(mainText);

                F.setJMenuBar(createMainMenu(mainText));


                F.setSize(400,400);
                F.setVisible(true);
            }
        });


    }


    static JMenuBar createMainMenu(JTextArea T) {
        JMenuBar    M    =    new    JMenuBar();

        //Create File menu
        JMenu menu = new JMenu("File");
        menu.setMnemonic(KeyEvent.VK_F);
        M.add(menu);

        JMenuItem menuItem = new JMenuItem("Clear");
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.ALT_MASK));
        menuItem.addActionListener(new ClearAction(T));
        menu.add(menuItem);

        menuItem = new JMenuItem("Exit");
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.ALT_MASK));
        menuItem.addActionListener(new ExitAction());
        menu.add(menuItem);


        //Create Color menu
        menu = new JMenu("Color");
        menu.setMnemonic(KeyEvent.VK_O);
        M.add(menu);

        menuItem = new JMenuItem("Red");
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.ALT_MASK));
        menuItem.addActionListener(new ColorAction(T, Color.RED, menuItem.getText()));
        menu.add(menuItem);

        menuItem = new JMenuItem("Green");
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, ActionEvent.ALT_MASK));
        menuItem.addActionListener(new ColorAction(T, Color.GREEN, menuItem.getText()));
        menu.add(menuItem);

        menuItem = new JMenuItem("Blue");
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, ActionEvent.ALT_MASK));
        menuItem.addActionListener(new ColorAction(T, Color.BLUE, menuItem.getText()));
        menu.add(menuItem);


        return M;

    }
}
