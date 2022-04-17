package io.example;

import java.io.IOException;

public interface EntityOutput {

    void personOutput(Person person) throws IOException;
    void pointOutput(Point point) throws IOException;
}
