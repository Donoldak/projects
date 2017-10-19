

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        /*InputStream inputStream = new FileInputStream("C:\\text.txt");
        while (true) {
            int i = inputStream.read();
            if (i != -1) {
                System.out.println(Integer.toHexString(i));
            }else {
                break;
            }
        }*/
        /*OutputStream outputStream = new FileOutputStream("E:\\output.txt");
        outputStream.write(0b11);
        outputStream.flush();
        outputStream.close();*/
       /* Reader reader = new InputStreamReader(new FileInputStream("C:\\text.txt"), "UTF-8");
        while (true) {
            int c = reader.read();
            if (c != -1)
            System.out.println((char) c);
        }*/
       Writer writer = new OutputStreamWriter(new FileOutputStream("E:\\output.txt"), "UTF-8");
       writer.write("Привет!");
       writer.flush();
       writer.close();

    }
}
