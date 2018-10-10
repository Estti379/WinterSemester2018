
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class ColorSliders {


    public static void main(String[] args)
    {

        javax.swing.SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                JFrame    F    =    new    JFrame();
                F.setTitle("Color Sliders Exercise");
                F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                // ADD TOP PANEL


                JPanel    P1    =    new JPanel();

                JPanel    P2    =    new JPanel();
                P2.setLayout(new GridLayout(3,1));

                JSlider s1    = new JSlider(0,255,0);
                JSlider s2    = new JSlider(0,255,0);
                JSlider s3    = new JSlider(0,255,0);

                P1.setBackground(new Color(s1.getValue(),s2.getValue(),s3.getValue()));

                // add code for look of sliders
                s1.setMajorTickSpacing(50);
                s1.setMinorTickSpacing(0);
                s1.setPaintTicks(true);
                s1.setPaintLabels(true);

                s2.setMajorTickSpacing(50);
                s2.setMinorTickSpacing(0);
                s2.setPaintTicks(true);
                s2.setPaintLabels(true);

                s3.setMajorTickSpacing(50);
                s3.setMinorTickSpacing(0);
                s3.setPaintTicks(true);
                s3.setPaintLabels(true);
                // add titles for sliders

                s1.setBorder(BorderFactory.createTitledBorder("red"));
                s2.setBorder(BorderFactory.createTitledBorder("green"));
                s3.setBorder(BorderFactory.createTitledBorder("blue"));

                P2.add(s1);
                P2.add(s2);
                P2.add(s3);

                ChangeListener    L    =    new ChangeListener() {
                    @Override
                    public void stateChanged(ChangeEvent e) {
                        P1.setBackground(new Color(s1.getValue(),s2.getValue(),s3.getValue()));
                    }
                };

                s1.addChangeListener(L);
                s2.addChangeListener(L);
                s3.addChangeListener(L);

                F.getContentPane().add(P1);
                F.getContentPane().add(P2,BorderLayout.SOUTH);

                F.setSize(400,400);
                F.setVisible(true);
            }
        });
    }

}
