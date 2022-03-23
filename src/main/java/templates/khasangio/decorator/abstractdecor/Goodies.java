package templates.khasangio.decorator.abstractdecor;

import templates.khasangio.decorator.Baking;

public abstract class Goodies implements Baking {
    protected Baking baking;

    public Goodies(Baking baking) {
        this.baking = baking;
    }

    @Override
    public void about() {
        System.out.println(getDescription() + " " + getPrice());
    }
}
