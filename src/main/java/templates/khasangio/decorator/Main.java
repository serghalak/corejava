package templates.khasangio.decorator;

import templates.khasangio.decorator.decoradedclasses.Chocolate;
import templates.khasangio.decorator.decoradedclasses.Cream;

import java.io.*;
import java.util.zip.GZIPInputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        Baking baking = new Cake();
        //System.out.println(baking.getDescription() + " " + baking.getPrice());
        baking.about();
//        baking = new Cream(baking);
//        baking.about();

         InputStream is = new GZIPInputStream(new BufferedInputStream(new FileInputStream("c://test.txt")));

        baking = new Cream(baking);
        baking.about();
        baking = new Chocolate(baking);
        //System.out.println(baking.getDescription() + " " + baking.getPrice());
        baking.about();
    }
}
