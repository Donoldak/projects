import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.*;


@SuppressWarnings("serial")
class MyTestFrame extends JPanel {
    static BufferedImage img;

    public MyTestFrame() {
        super();
        img = MyGetImage.OutputToScrn(img);

    }

    public void paintComponent(Graphics g) {
        g.drawImage(img, 0, 0, null);
        repaint();
    }

    public static void createGUI() {
        final JFrame frame = new JFrame("Камень ножницы бумага");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("Игра");

        //JMenuItem newMenu = new JMenuItem("Отобразить");
        //fileMenu.add(newMenu);

        JButton gameButt = new JButton("Играть");
        gameButt.setLocation(100,100);
        gameButt.setSize(6,10);
        frame.add(gameButt);
        //gameButt.setVisible(true);

        JMenuItem exitItem = new JMenuItem("Выход");
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);

        frame.setJMenuBar(menuBar);
        frame.setSize(new Dimension(650, 450));
        frame.setVisible(true);

        gameButt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().add(new MyTestFrame());
                frame.setSize(img.getWidth(), img.getHeight());
                frame.add(gameButt);

            }
        });

        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createGUI();
            }
        });
    }

}