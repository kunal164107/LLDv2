package com.kunal.designPatterns.FactoryPattern;

import com.kunal.designPatterns.AbstractFactoryPattern.Object;

public class Main {

    public static void main(String args[]) {

//        ShapeFactory shapeFactory = new ShapeFactory();
//        Shape shapeObj = shapeFactory.drawShape("circle");
//        shapeObj.draw();
//
//        Shape shapeObj1 = shapeFactory.drawShape("rectangle");
//        shapeObj1.draw();

//        Object object = new Quadrilateral(); // wrong Abstract Factory Implementation
//        Shape shape = object.getObj("rectangle");
//        shape.draw();
//
//        Object object1 = new NonQuadrilateral();
//        Shape shape1 = object1.getObj("circle");
//        shape1.draw();

        Object object = new Object();
        Shape shape = object.getObject("quadrilateral", "rectangle");
        shape.draw();

        Object object1 = new Object();
        Shape shape1 = object1.getObject("non-quadrilateral", "circle");
        shape1.draw();

        Object object2 = new Object();
        Shape shape2 = object2.getObject("non-quadrilateral", "triangle");
        shape2.draw();

    }
}
