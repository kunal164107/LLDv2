package com.kunal.designPatterns.SolidPrinciples.InterfaceSegregationPrinciple;

//public class Chef implements Employee {
//    @Override
//    public void cookFood() {
//        System.out.println("Cooked food deliciously");
//    }
//
//    @Override
//    public void washDishes() {
//        // Not my Job
//    }
//
//    @Override
//    public void serveCustomer() {
//        // Not my Job
//    }
//}

public class Chef implements ChefInterface {

    @Override
    public void cookFood() {
        System.out.println("Cooked food deliciously");
    }
}
