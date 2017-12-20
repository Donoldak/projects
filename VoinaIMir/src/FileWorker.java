import java.io.*;
import java.nio.charset.Charset;

public class FileWorker {
    public static String readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        StringBuilder text = new StringBuilder();
        exists(fileName);
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file.getAbsoluteFile()), Charset.forName("CP1251")));
            try {
                String txt;
                while ((txt = reader.readLine()) != null) {
                    text.append(txt);
                    text.append("/n");
                }
            } finally {
                reader.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return text.toString();
    }

    private static void exists(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        if (!file.exists()) {
            throw new FileNotFoundException(file.getName());
        }
    }

}
