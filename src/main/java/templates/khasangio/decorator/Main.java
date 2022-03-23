package templates.khasangio.decorator;

import templates.khasangio.decorator.decoradedclasses.Chocolate;
import templates.khasangio.decorator.decoradedclasses.Cream;

public class Main {
    public static void main(String[] args) {
        Baking baking = new Cake();
        System.out.println(baking.getDescription() + " " + baking.getPrice());
        baking = new Chocolate(new Cream(baking));
        System.out.println(baking.getDescription() + " " + baking.getPrice());
    }
}
