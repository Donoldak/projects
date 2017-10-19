import java.io.*;

public class OutStreamSample extends OutputStream {
    private OutputStream outputStream;

    public OutStreamSample(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    @Override
    public void write(int b) throws IOException {
        outputStream.write(b);
    }

    @Override
    public void flush() throws IOException {
        outputStream.flush();
    }
}
