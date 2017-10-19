import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;

public class GameForm {
    public JPanel panel1;
    public JButton button1;
    public JPanel panelPic;
    static BufferedImage img;
    JFrame game = new JFrame("Камень Ножницы Бумага");



    public void visib(){
        game.setContentPane(new GameForm().panel1);
        game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game.pack();
        game.setVisible(true);
    }

    public GameForm() {

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


            }
        });
    }
}

