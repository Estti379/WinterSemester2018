

import java.awt.GridLayout;

import javax.swing.BoundedRangeModel;
import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.text.Document;


public class SameModel
{


    public static void main(String[] args)
    {

        javax.swing.SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                JFrame    F    =    new    JFrame();
                F.setTitle("SameModel Exercise");
                F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                F.getContentPane().setLayout(new GridLayout(6,1));

                // CREATE 3 JTEXTFIELDS t1,t2,t3
                JTextField t1 = new JTextField();
                JTextField t2 = new JTextField();
                JTextField t3 = new JTextField();

                // SET THE SAME DOCUMENT FOR THE 3
                t2.setDocument(t1.getDocument());
                t3.setDocument(t1.getDocument());

                F.getContentPane().add(t1);
                F.getContentPane().add(t2);
                F.getContentPane().add(t3);

                // CREATE 3 JSLIDERS s1,s2,s3
                JSlider s1 = new JSlider();
                JSlider s2 = new JSlider();
                JSlider s3 = new JSlider();

                // SET THE SAME DOCUMENT FOR THE 3

                /* old code (But it works!) */
                /*ChangeListener listener = new ChangeListener() {
                    @Override
                    public void stateChanged(ChangeEvent e) {
                        JSlider changedSlider = null;
                        if ( e.getSource() instanceof JSlider) {
                            changedSlider = (JSlider) e.getSource();
                        } else {
                            System.exit(1);
                        }

                        s1.setValue(changedSlider.getValue());
                        s2.setValue(changedSlider.getValue());
                        s3.setValue(changedSlider.getValue());
                    }
                };
                s1.addChangeListener(listener);
                s2.addChangeListener(listener);
                s3.addChangeListener(listener);*/

                s2.setModel(s1.getModel());
                s3.setModel(s1.getModel());

                F.getContentPane().add(s1);
                F.getContentPane().add(s2);
                F.getContentPane().add(s3);

                F.setSize(400,400);
                F.setVisible(true);
            }
        });
    }

}