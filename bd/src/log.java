import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class log {
    public JPanel panel1;
    public JTextField textField2;
    public JPasswordField passwordField1;
    public JButton Enter;
    private JButton RegButton;
    public Scanner scanData;
    public JFrame login = new JFrame("Вход");
    String userLog = new String();
    String userPass = new String();
    Body body = new Body();
    int count = 0;
    public void close(){
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSED);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

    public log() {
        Enter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userLog = textField2.getText();
                userPass = String.valueOf(passwordField1.getPassword());
                body.openLog();


                //Реализация проверки логина и пароля

                for (int j=0;j<body.logAndPass.size();j=j+2){
                     if (new String(body.logAndPass.get(j)).equals(userLog) || new String(body.logAndPass.get(j++)).equals(userPass))  {
                         count ++;
                    }
                }
                if (count == 1){
                    login.setVisible(false);
                    login.dispose();
                    //Создаем следующие окно для работы с "БД"
                    JOptionPane.showMessageDialog(null, "Логтн и пароль верны");
                }else {
                    JOptionPane.showMessageDialog(null,"Логин и пароль не верны");
                }

            }
        });

        RegButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                login.setVisible(false);
                panel1.setVisible(false);
            }
        });
    }

    public void open() {
        try {
            File data = new File("C:\\Users\\User\\workspace\\bd\\src\\data.txt");
            scanData = new Scanner(data);

            //Тут надо считать фаил БД и закинуть в ArrayList наверно, это не точно, посмотрим



            login.setContentPane(new log().panel1);
            login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            login.pack();
            login.setVisible(true);

        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Фаилы данных не найден");
        }

    }
}






