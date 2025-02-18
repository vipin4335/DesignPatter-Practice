package Decoratorpattern.Decorators;

import Decoratorpattern.Items.BasePizza;

public class Cheese extends Toppings {
 BasePizza pizza;

    public Cheese(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return this.pizza.cost()+20;
    }
}
