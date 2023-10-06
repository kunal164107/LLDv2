package com.kunal.designPatterns.DecoratorDesignPattern;

import com.kunal.designPatterns.DecoratorDesignPattern.Decorator.ExtraCheese;
import com.kunal.designPatterns.DecoratorDesignPattern.Decorator.Mushroom;
import com.kunal.designPatterns.DecoratorDesignPattern.Pizza.BasePizza;
import com.kunal.designPatterns.DecoratorDesignPattern.Pizza.MargheritaPizza;

public class Main {

    public static void main(String args[]) {

        BasePizza basePizza = new MargheritaPizza();
        System.out.println("Your pizza cost is " + basePizza.cost());

        BasePizza margheritaWithExtraCheese = new ExtraCheese(basePizza);
        System.out.println("Your pizza cost with Extra Cheese is " + margheritaWithExtraCheese.cost());

        BasePizza margheritaWithExtraCheeseAndMushroom = new Mushroom(margheritaWithExtraCheese);
        System.out.println("Your pizza cost with Extra Cheese and Mushroom is " + margheritaWithExtraCheeseAndMushroom.cost());
    }
}
