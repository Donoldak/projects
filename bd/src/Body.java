import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Body {
    public ArrayList<String> logAndPass = new ArrayList<>();
    public Scanner scanLog;
    public   void openLog() {
        try {
            scanLog = new Scanner(new File("C:\\Users\\User\\workspace\\bd\\src\\login.txt"));

            while(scanLog.hasNext()){
                logAndPass.add(scanLog.next());
            }
        } catch (FileNotFoundException e){
            JOptionPane.showMessageDialog(null,"Фаилы данных не найден");
        }
    }






    }




