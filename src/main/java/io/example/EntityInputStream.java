package io.example;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public class EntityInputStream implements EntityInput{

    private DataInput dataInput;

    public EntityInputStream(InputStream dst) {
        dataInput = new DataInputStream(dst);
    }

    @Override
    public Person readPerson() throws IOException {
        String personName = dataInput.readUTF();
        int personAge = dataInput.readInt();
        return new Person(personName, personAge);
    }

    @Override
    public Point readPoint() throws IOException {
        int x = dataInput.readInt();
        int y = dataInput.readInt();
        return new Point(x, y);
    }
}
