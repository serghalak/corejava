package templates.khasangio.decorator.example;

import java.io.FileInputStream;
import java.io.IOException;

public class TestExample {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("test.txt");
        ShuffleCaseInputStream is = new ShuffleCaseInputStream(fis);
        int read;
        while ((read = is.read()) != -1) {
            System.out.println("Official thread: " + read);
        }
    }
}
