import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("C://text.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("E://shifr.txt");
        FileInputStream fileInputStream1 = new FileInputStream("E://shifr.txt");
        FileOutputStream fileOutputStream1 = new FileOutputStream("E://deshifr.txt");
        //shifrovka(fileInputStream, fileOutputStream);
        //deshifrovka(new FileInputStream("E://output.txt"), new FileOutputStream("E://deshir.txt"));
       InPutStreamShifr inPutStreamShifr = new InPutStreamShifr(fileInputStream);
       InPutStreamDeshifr inPutStreamDeshifr = new InPutStreamDeshifr(fileInputStream1);
       int q = 0;
       while (true){
           q = inPutStreamShifr.read();
           if (q != -1){
               fileOutputStream.write(q);
           }else {
               break;
           }
       }
       inPutStreamShifr.close();
       fileOutputStream.close();
        int q1 = 0;
        while (true){
            q1 = inPutStreamDeshifr.read();
            if (q1 != -1){
                fileOutputStream1.write(q1);
            }else {
                break;
            }
        }


    }

    public static void shifrovka(InputStream inputStream, OutputStream outputStream) throws IOException{
        while (inputStream.available() >0){
            int in = inputStream.read();
            outputStream.write(in+1);
        }
        inputStream.close();
        outputStream.close();
    }

    public static void deshifrovka(InputStream inputStream, OutputStream outputStream) throws IOException{
        while (inputStream.available() >0){
            int in = inputStream.read();
            outputStream.write(in - 1);
        }
        inputStream.close();
        outputStream.close();
    }
}
