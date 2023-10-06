package com.kunal.designPatterns.DecoratorDesignPattern.Decorator;

import com.kunal.designPatterns.DecoratorDesignPattern.Pizza.BasePizza;

public class Mushroom extends ToppingsDecorator {

    BasePizza basePizza;

    public Mushroom(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 15;
    }

}
