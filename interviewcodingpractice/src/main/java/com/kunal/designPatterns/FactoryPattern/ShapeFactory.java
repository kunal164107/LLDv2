package com.kunal.designPatterns.FactoryPattern;

/* ABSTRACT Factory Pattern*/

//public class ShapeFactory {

//    public Shape drawShape(String input) {
//        switch (input) {
//            case "circle":
//                return new Circle();
//            case "rectangle":
//                return new Rectangle();
//            default:
//                return null;
//
//        }
//    }
//}

public interface ShapeFactory {

    Shape getShape(String input);
}