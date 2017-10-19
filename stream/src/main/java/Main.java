import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //Без оберток
        InputStream inputStream = new FileInputStream("E:\\kek\\text.txt");
        OutputStream outputStream = new FileOutputStream("E:\\kek\\output.txt");
        InputStream inputStream1 = new FileInputStream("E:\\kek\\output.txt");
       // OutputStream outputStream1 = new FileOutputStream("E:\\kek\\decrypted.txt");
        crypt(inputStream, outputStream);
        //decrypt(inputStream1, outputStream1);
        inputStream.close();
        outputStream.close();
        //outputStream1.close();

        //////////////////////
        //C Оберткой для шифрования
        OutputStream outputStream2 = new CryptingWrapper(new FileOutputStream("E:\\kek\\crypted_wrapper.txt"));
        copy(inputStream, outputStream2);
        //outputStream2.write("Hello World".getBytes("UTF-8"));
        copy(new FileInputStream("E:\\kek\\crypted_wrapper.txt"), new DecryptingWrapper(new FileOutputStream("E:\\kek\\decrypted.txt")));
        outputStream2.flush();
        outputStream2.close();
        //////////////////////
    }
    public static void crypt(InputStream inputStream, OutputStream outputStream) throws IOException{
        while (true){
            int b = inputStream.read();
            if (b == -1){
                break;
            }else {
                outputStream.write(b+1);
                System.out.println((char) b + " encoded " + (char) (b + 1));
            }
        }
    }
    public static void decrypt(InputStream inputStream, OutputStream outputStream) throws IOException {
        while (true){
            int b = inputStream.read();
            if (b == -1){
                break;
            }else {
                outputStream.write(b-1);
            }
        }
    }
    public static void  copy(InputStream inputStream, OutputStream outputStream) throws IOException{
        while (true){
            int b = inputStream.read();
            if (b == -1){
                break;
            }else {
                outputStream.write(b);
            }
        }
    }
}
