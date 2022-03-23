package templates.khasangio.decorator;

public class Cake implements Baking {
    @Override
    public int getPrice() {
        return 100;
    }

    @Override
    public String getDescription() {
        return "Cake";
    }
}
