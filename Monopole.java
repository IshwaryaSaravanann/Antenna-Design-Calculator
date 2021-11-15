package Calculator.Monopole;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Monopole {
    public static void main(String []args)
    {
        long c=3*100000000;
        JFrame f = new JFrame("MONOPOLE ANTENNA");
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
        JTextField length=new JTextField();
        length.setBounds(200,400,150,20);
        f.add(frequency);
        f.add(wavelength);
        f.add(length);


        JLabel freq=new JLabel("Frequency");
        freq.setBounds(100,100,100,20);
        JLabel wave=new JLabel("Wavelength");
        wave.setBounds(100,300,100,20);
        JLabel len=new JLabel("Length");
        len.setBounds(100,400,100,20);
        f.add(freq);
        f.add(wave);
        f.add(len);

        f.setSize(600,600);
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
                double lambda = c/(Integer.parseInt(value));
                wavelength.setText(lambda+" m");
                double l=lambda/4;
                length.setText(l+" m");
            }
        });

        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frequency.setText("");
                wavelength.setText("");
                length.setText("");
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
