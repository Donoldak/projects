import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        byte[] bytes = {1, 2, 3};
        ByteArrayInputStream stream = new ByteArrayInputStream(bytes);
        InputStreamSample inputStreamSample = new InputStreamSample();
        int result = inputStreamSample.readBytesSum(stream);
        System.out.println(result);
    }

    public static void printString(String string, OutputStream outputStream) throws IOException {
        byte[] bytes = string.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            outputStream.write(bytes[i]);
        }
    }
}
