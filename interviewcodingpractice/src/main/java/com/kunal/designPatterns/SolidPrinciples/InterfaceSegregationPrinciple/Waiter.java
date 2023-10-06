package com.kunal.designPatterns.SolidPrinciples.InterfaceSegregationPrinciple;

//public class Waiter implements Employee {
//    @Override
//    public void cookFood() {
//        // Not my Job
//    }
//
//    @Override
//    public void washDishes() {
//        // Not my Job
//    }
//
//    @Override
//    public void serveCustomer() {
//        System.out.println("Serving Customer Very Ethically");
//    }
//}

public class Waiter implements WaiterInterface {

    @Override
    public void serveCustomer() {
        System.out.println("Serving Customer Very Ethically");
    }

    @Override
    public void takeOrder() {
        System.out.println("Taking order from Customers");
    }
}
