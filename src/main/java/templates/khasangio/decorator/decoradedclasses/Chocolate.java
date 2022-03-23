package templates.khasangio.decorator.decoradedclasses;

import templates.khasangio.decorator.Baking;
import templates.khasangio.decorator.abstractdecor.Goodies;

public class Chocolate extends Goodies {

    public Chocolate(Baking baking) {
        super(baking);
    }

    @Override
    public int getPrice() {
        return 10 + baking.getPrice();
    }

    @Override
    public String getDescription() {
        return baking.getDescription() + " with chockolate";
    }
}
