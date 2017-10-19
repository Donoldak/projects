import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Reader extends JFrame {
    JButton b1;
    JLabel l1, l2, l3;
    JTextField t1;
    int i, k;
    String a, b;
    //eHandler handler = new eHandler();

    public Reader(String s) {
        super(s);
        setLayout(new FlowLayout());
        b1 = new JButton("Выбрать");
        l1 = new JLabel("Выберите номер студента: ");
        l2 = new JLabel("");
        l3 = new JLabel("");
        t1 = new JTextField(10);
        add(l1);
        add(t1);
        add(l2);
        add(l3);
        add(b1);
        //b1.addActionListener(handler);




    }





}