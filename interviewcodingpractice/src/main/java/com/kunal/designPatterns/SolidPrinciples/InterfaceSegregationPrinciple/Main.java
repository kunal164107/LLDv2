package com.kunal.designPatterns.SolidPrinciples.InterfaceSegregationPrinciple;

public class Main {

    public static void main(String args[]) {

//        Employee employee = new Chef();
//        employee.cookFood();
//        employee.serveCustomer();
//        employee.washDishes();
//
//        Employee employee = new Waiter();
//        employee.cookFood();
//        employee.serveCustomer();
//        employee.washDishes();

        Chef chef = new Chef();
        chef.cookFood();

        Helper helper = new Helper();
        helper.washDishes();

        Waiter waiter = new Waiter();
        waiter.serveCustomer();
        waiter.takeOrder();
    }
}
