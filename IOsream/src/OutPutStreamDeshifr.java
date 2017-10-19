import java.io.IOException;
import java.io.OutputStream;

public class OutPutStreamDeshifr extends OutputStream {
    private final OutputStream outputStream;

    public OutPutStreamDeshifr(OutputStream outputStream){
        this.outputStream = outputStream;
    }
    @Override
    public void write(int b) throws IOException {
        outputStream.write(b+1);
    }
}
