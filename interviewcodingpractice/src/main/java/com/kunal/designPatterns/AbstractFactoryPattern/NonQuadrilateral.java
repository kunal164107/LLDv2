package com.kunal.designPatterns.AbstractFactoryPattern;

import com.kunal.designPatterns.FactoryPattern.Circle;
import com.kunal.designPatterns.FactoryPattern.Shape;
import com.kunal.designPatterns.FactoryPattern.ShapeFactory;

public class NonQuadrilateral implements ShapeFactory {

//    @Override
//    public Shape getObj(String input) {
//        return new ShapeFactory().drawShape(input);
//    }

    @Override
    public Shape getShape(String input) {
        switch (input) {
            case "circle":
                return new Circle();
            default:
                return null;
        }
    }
}
