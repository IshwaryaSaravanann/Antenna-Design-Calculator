package Calculator;

import Calculator.Dipole.*;
import Calculator.Monopole.*;
import Calculator.YagiUda.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Antenna extends Component implements ActionListener{
    JFrame f;
    String msg="";
    JLabel l;
    JRadioButton button1, button2, button3;
    JButton next,close, reset;
    ButtonGroup G;
    Antenna(){
        G=new ButtonGroup();
        f= new JFrame("ANTENNA DESIGN CALCULATOR");
        l=new JLabel("Choose the antenna type:");
        l.setBounds(200,50,300,20);
        button1 = new JRadioButton(" WIRE MONOPOLE ANTENNA");
        button1.setBounds(200,150,400,20);
        button2 = new JRadioButton(" WIRE DIPOLE ANTENNA");
        button2.setBounds(200,250,400,20);
        button3 = new JRadioButton(" YAGI UDA ANTENNA");
        button3.setBounds(200,350,400,20);
        next = new JButton("NEXT");
        close = new JButton("CLOSE");
        close.setBounds(300,450,75,30);
        next.setBounds(200,450,70,30);
        next.addActionListener(this);
        f.add(l);
        f.add(button1);
        f.add(button2);
        f.add(button3);
        f.add(next);
        f.add(close);
        f.setSize(600,600);
        f.setLayout(null);
        f.setVisible(true);
        G.add(button1);
        G.add(button2);
        G.add(button3);


        close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                f.dispose();
                return;
            }
        });

    }
    public void actionPerformed(ActionEvent e){

        if(button1.isSelected()){
            Calculator.Monopole.Monopole.main(null);

        }
        if(button2.isSelected()){

            Calculator.Dipole.Dipole.main(null);
        }
        if(button3.isSelected()){

            Calculator.YagiUda.YagiUda.main(null);
        }

    }
    public static void main(String[] args) {
        new Antenna();
    }
}
