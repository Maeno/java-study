package exception;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TryCatchResource {
    public static void main(String[] args) {

        try (final InputStream inputStream = Files.newInputStream(Paths.get("aaa"))) {
            inputStream.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
