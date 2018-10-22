

import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.border.TitledBorder;

public class Converter {

    public static void main(String[] args)
    {

        javax.swing.SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                JFrame    F    =    new    JFrame("Converter");
                F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                F.getContentPane().setLayout(new GridLayout(2,1));

                JTextField  t1   =   new JTextField(20);
                JTextField  t2   =   new JTextField(20);



                // SET TEXT ALIGNMENT 2 AND BORDER FOR t1
                t1.setBorder(BorderFactory.createTitledBorder( null , "euros", TitledBorder.CENTER, TitledBorder.CENTER));
                t1.setHorizontalAlignment(JTextField.RIGHT);

                // SET TEXT ALIGNMENT AND BORDER FOR t2
                t2.setBorder(BorderFactory.createTitledBorder( null , "bitcoins", TitledBorder.CENTER, TitledBorder.CENTER));
                t2.setHorizontalAlignment(JTextField.RIGHT);


                F.getContentPane().add(t1);
                F.getContentPane().add(t2);
                new Controller(t1,t2);

                F.pack();
                F.setVisible(true);
            }
        });
    }

}