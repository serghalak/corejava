package templates.khasangio.decorator.example;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ShuffleCaseInputStream extends FilterInputStream {

    public ShuffleCaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int c = super.read();
        System.out.println("output dublicate: " + c);
        return c;
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        return super.read(b, off, len);
    }
}
