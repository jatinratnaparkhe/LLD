package notes.lld.pattern.structural.decorator.decorators;

import notes.lld.pattern.structural.decorator.BasePizza;

import java.util.Objects;

public class Mushroom extends PizzaDecorator {

    public Mushroom(BasePizza pizza) {
        super(pizza);
    }

    @Override
    public int cost() {
        return this.pizza.cost() + 40;
    }
}
