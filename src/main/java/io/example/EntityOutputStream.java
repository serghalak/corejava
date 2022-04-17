package io.example;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class EntityOutputStream implements EntityOutput{

    private DataOutput dataOutput;

    public EntityOutputStream(OutputStream src) {
        this.dataOutput = new DataOutputStream(src);
    }

    @Override
    public void personOutput(Person person) throws IOException {
        dataOutput.writeUTF(person.getName());
        dataOutput.writeInt(person.getAge());
    }

    @Override
    public void pointOutput(Point point) throws IOException {
        dataOutput.writeInt(point.getX());
        dataOutput.writeInt(point.getY());
    }
}
