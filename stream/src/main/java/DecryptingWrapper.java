import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class DecryptingWrapper extends FilterOutputStream {
    public DecryptingWrapper(OutputStream out) {
        super(out);
    }
    @Override
    public void write(int b) throws IOException {
        out.write(b);
    }
}
