import javax.swing.*;
import java.util.Scanner;
import java.io.File;





public class lol {


    static String [][] mas = new String[5][3];
    static Scanner scn;

    public static void main(String[] args) {

        openFile();
        readFile();
        //out();
        Student s1 = new Student();
        s1.age=  Integer.parseInt(mas[0][2]);
        Reader r = new Reader("G-гурда");
        r.setVisible(true);
        r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        r.setSize(300, 200);
        r.setResizable(false);
        r.setLocationRelativeTo(null);



    }

   /* private static void out() {
        for (int row=0; row<mas.length; row++){
            for(int col = 0; col<mas[row].length;col++){
                System.out.print(mas[row][col] + "   ");
            }
            System.out.println();
        }

    } */

    private static void openFile(){
        try {
            scn = new Scanner(new File("src//1.txt"));
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Фаил не найден");}
    }


   private static void readFile(){
        while(scn.hasNext()){
            for (int row=0; row<mas.length; row++){
                for(int col = 0; col<mas[row].length;col++){
                    mas[row][col] = scn.next();
                }
            }
        }
    }


    public int [] vozv(){

            return ;
    }

}
