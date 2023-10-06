package com.kunal.designPatterns.AbstractFactoryPattern;

import com.kunal.designPatterns.FactoryPattern.Rectangle;
import com.kunal.designPatterns.FactoryPattern.Shape;
import com.kunal.designPatterns.FactoryPattern.ShapeFactory;

public class Quadrilateral implements ShapeFactory {

//    @Override
//    public Shape getObj(String input) {
//        return new ShapeFactory().drawShape(input);
//    }

    @Override
    public Shape getShape(String input) {
        switch (input) {
            case "rectangle":
                return new Rectangle();
            default:
                return null;
        }
    }
}
