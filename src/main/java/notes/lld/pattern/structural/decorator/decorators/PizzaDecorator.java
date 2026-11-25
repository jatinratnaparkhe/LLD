package notes.lld.pattern.structural.decorator.decorators;

import notes.lld.pattern.structural.decorator.BasePizza;

import java.util.Objects;

public abstract class PizzaDecorator implements BasePizza {
    protected final BasePizza pizza;

    protected PizzaDecorator(BasePizza pizza) {
        this.pizza = Objects.requireNonNull(pizza);
    }
}
