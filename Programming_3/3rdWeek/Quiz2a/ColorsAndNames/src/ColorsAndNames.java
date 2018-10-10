
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.*;


public class ColorsAndNames {

    static    JLabel    B    =    new    JLabel();

    public static void main(String[] args)
    {

        javax.swing.SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                JFrame    F    =    new    JFrame();
                F.setTitle("JMenu Exercise");
                F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                F.getContentPane().add(B);
                B.setOpaque(true);
                B.setHorizontalAlignment(JLabel.CENTER);


                F.setJMenuBar(createJMenuBar());

                F.setSize(400,400);                   // set Window size
                F.setVisible(true);
            }
        });
    }

    static    JMenuBar    createJMenuBar()
    {
        JMenuBar    M    =    new    JMenuBar();

        JMenu menu = new JMenu("Name");
        menu.setMnemonic(KeyEvent.VK_N);
        M.add(menu);

        JMenuItem menuItem = new JMenuItem("Alice");
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
        menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setLabelText(e);
            }
        });
        menu.add(menuItem);

        menuItem = new JMenuItem("Bob");
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, ActionEvent.ALT_MASK));
        menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setLabelText(e);
            }
        });
        menu.add(menuItem);

        menuItem = new JMenuItem("Carol");
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_3, ActionEvent.ALT_MASK));
        menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setLabelText(e);
            }
        });
        menu.add(menuItem);


        menu = new JMenu("Color");
        menu.setMnemonic(KeyEvent.VK_C);
        M.add(menu);

        menuItem = new JMenuItem("Red");
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_4, ActionEvent.ALT_MASK));
        menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setLabelColor(Color.RED);
            }
        });
        menu.add(menuItem);

        menuItem = new JMenuItem("Green");
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_5, ActionEvent.ALT_MASK));
        menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setLabelColor(Color.GREEN);
            }
        });
        menu.add(menuItem);

        menuItem = new JMenuItem("Blue");
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_6, ActionEvent.ALT_MASK));
        menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setLabelColor(Color.BLUE);
            }
        });
        menu.add(menuItem);


        return M;
    }



    static private void setLabelText(ActionEvent e){

        if ( e.getSource() instanceof JMenuItem) {
            JMenuItem menuItem = (JMenuItem) e.getSource();
            B.setText("Hello, " + menuItem.getText() +"!");
        } else {
            System.exit(1);
        }
    }

    static private void setLabelColor(Color color){
        B.setBackground(color);
    }
}
