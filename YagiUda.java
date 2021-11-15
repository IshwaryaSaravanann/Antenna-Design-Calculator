package Calculator.YagiUda;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class YagiUda {
    public static void main (String[] args)
    {
        int c=3*100000000;
        JFrame f = new JFrame("YAGI UDA ANTENNA");
        JLabel l = new JLabel("Enter the frequency:");
        l.setBounds(100,50,300,20);
        JButton b1=new JButton("CALCULATE");
        JButton close=new JButton("CLOSE");
        JButton reset=new JButton("RESET");
        b1.setBounds(100,200,110,20);
        close.setBounds(250,200,75,20);
        reset.setBounds(350,200,75,20);
        f.add(l);
        f.add(b1);
        f.add(close);
        f.add(reset);

        JTextField frequency = new JTextField();
        frequency.setBounds(200,100,150,20);
        JTextField wavelength= new JTextField();
        wavelength.setBounds(200,300,150,20);
        JTextField fdipole= new JTextField();
        fdipole.setBounds(230,350,130,20);
        JTextField reflector=new JTextField();
        reflector.setBounds(200,400,150,20);
        JTextField director=new JTextField();
        director.setBounds(450,400,150,20);
        JTextField s1=new JTextField();
        s1.setBounds(200,450,150,20);
        JTextField s2=new JTextField();
        s2.setBounds(450,450,150,20);
        f.add(frequency);
        f.add(wavelength);
        f.add(fdipole);
        f.add(reflector);
        f.add(director);
        f.add(s1);
        f.add(s2);


        JLabel freq=new JLabel("Frequency");
        freq.setBounds(100,100,100,20);
        JLabel wave=new JLabel("Wavelength");
        wave.setBounds(100,300,100,20);
        JLabel fdip=new JLabel("Folded Dipole Length");
        fdip.setBounds(100,350,200,20);
        JLabel ref=new JLabel("Reflector Length");
        ref.setBounds(100,400,100,20);
        JLabel dir=new JLabel("Director Length");
        dir.setBounds(360,400,100,20);
        JLabel s1space=new JLabel("Spacing s1");
        s1space.setBounds(100,450,100,20);
        JLabel s2space=new JLabel("Spacing s2");
        s2space.setBounds(360,450,100,20);
        f.add(freq);
        f.add(wave);
        f.add(fdip);
        f.add(ref);
        f.add(dir);
        f.add(s1space);
        f.add(s2space);

        f.setSize(700,600);
        f.setLayout(null);
        f.setVisible(true);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String value= frequency.getText();
                try{
                    frequency.setText(Integer.toString(Integer.parseInt(value)));
                }
                catch(Exception a)
                {
                    frequency.setText("Invalid input");
                }
                float lambda = c/(Integer.parseInt(value));
                wavelength.setText(lambda+" m");
                float l=lambda/2;
                fdipole.setText(l+" m");
                double rlen = (1.1)*(lambda/2);
                reflector.setText(rlen+" m");
                double dlen = (0.9)*(lambda/2);
                director.setText(dlen+" m");
                double ss1= 0.25*lambda;
                s1.setText(ss1+" m");
                double ss2 = 0.33*(lambda);
                s2.setText(ss2+" m");
            }
        });

        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frequency.setText("");
                wavelength.setText("");
                reflector.setText("");
                director.setText("");
                s1.setText("");
                s2.setText("");
            }
        });

        close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                f.dispose();
                return;
            }
        });

    }
}
