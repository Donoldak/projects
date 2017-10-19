import java.io.IOException;
import java.io.InputStream;

public class InputStreamSample {
    public int readBytesSum(InputStream inputStream) throws IOException{
        int sum = 0;
        while (inputStream.available()>0){
            sum = sum + inputStream.read();
        }
        return sum;
    }
}
