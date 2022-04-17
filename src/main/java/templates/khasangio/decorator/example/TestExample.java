package templates.khasangio.decorator.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TestExample {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("test.txt");
        InputStream is = new ShuffleCaseInputStream(fis);
        int read;
        while ((read = is.read()) != -1) {
            System.out.println("Official thread: " + read);
        }
    }
}
