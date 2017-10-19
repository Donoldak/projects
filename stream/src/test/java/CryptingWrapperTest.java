import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import static org.junit.Assert.*;

public class CryptingWrapperTest {
    @Test
    public void testCrypt() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        CryptingWrapper cryptingWrapper = new CryptingWrapper(out);

        cryptingWrapper.write(4);
        byte[] crypted = out.toByteArray();

        byte[] expected = {5};

        assertArrayEquals(expected, crypted);
    }

    @Test
    public void testDecrypt() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        DecryptingWrapper decryptingWrapper  = new DecryptingWrapper(out);

        decryptingWrapper.write(4);
        byte[] decrypted = out.toByteArray();

        byte[] expected = {3};

        assertArrayEquals(expected, decrypted);
    }
}
