package templates.khasangio.decorator.decoradedclasses;

import templates.khasangio.decorator.Baking;
import templates.khasangio.decorator.abstractdecor.Goodies;

public class Cream extends Goodies {

    public Cream(Baking baking) {
        super(baking);
    }

    @Override
    public int getPrice() {
        return 12 + baking.getPrice();
    }

    @Override
    public String getDescription() {
        return baking.getDescription() + " with cream";
    }
}
