import java.io.IOException;
import java.io.InputStream;

public class InPutStreamDeshifr extends InputStream {
    private final InputStream inputStream;

    public  InPutStreamDeshifr(InputStream inputStream){
        this.inputStream = inputStream;
    }

    @Override
    public int read() throws IOException {
        int shifr = inputStream.read();
        if (shifr != -1){
            return shifr+1;
        }
        return -1;
    }
}
