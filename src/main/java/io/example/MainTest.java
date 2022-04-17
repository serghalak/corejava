package io.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainTest {
    public static void main(String[] args) throws IOException {
        Person serg =new Person("Serg", 48);
        Person lesia = new Person("Lesia", 45);
        Person vova = new Person("Vova", 25);
        Person misha = new Person("Misha", 21);

        EntityOutput entityOutput = new EntityOutputStream(new FileOutputStream("c:/person.dat"));
        entityOutput.personOutput(serg);
        entityOutput.personOutput(lesia);
        entityOutput.personOutput(vova);
        entityOutput.personOutput(misha);
        System.out.println("----everything wrote to file");
        EntityInput entityInput = new EntityInputStream(new FileInputStream("c:/person.dat"));
        System.out.println(entityInput.readPerson());
        System.out.println(entityInput.readPerson());
        System.out.println(entityInput.readPerson());
        System.out.println(entityInput.readPerson());
    }
}
