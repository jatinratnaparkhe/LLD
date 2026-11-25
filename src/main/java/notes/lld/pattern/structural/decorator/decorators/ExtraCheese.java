package notes.lld.pattern.structural.decorator.decorators;

import notes.lld.pattern.structural.decorator.BasePizza;

import java.util.Objects;

public class ExtraCheese extends PizzaDecorator {

    public ExtraCheese(BasePizza pizza) {
        super(pizza);
    }

    @Override
    public int cost() {
        return this.pizza.cost() + 20;
    }
}
