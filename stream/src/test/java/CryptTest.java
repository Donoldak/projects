import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import static org.junit.Assert.*;

public class CryptTest {
    @Test
    public void cryptTest() throws IOException{
        byte[] original = {1, 2, 3, 4, 5};
        ByteArrayInputStream input = new ByteArrayInputStream(original);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Main.crypt(input, out);
        byte[] crypted = out.toByteArray();
        input.close();
        out.close();
        byte[] expected = {2, 3, 4, 5, 6};
        assertArrayEquals(expected, crypted);
    }

    @Test
    public void decryptTeest() throws IOException{
        byte[] original = {2, 3, 4, 5, 6} ;

        ByteArrayInputStream input = new ByteArrayInputStream(original);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Main.decrypt(input, out);
        byte[] decrypted = out.toByteArray();
        input.close();
        out.close();
        byte[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, decrypted);
    }
}
