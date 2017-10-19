import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class CryptingWrapper extends FilterOutputStream {
    public CryptingWrapper(OutputStream out){
        super(out);
    }
    @Override
    public void write(int b) throws IOException{
        out.write(b+1);
    }
}
