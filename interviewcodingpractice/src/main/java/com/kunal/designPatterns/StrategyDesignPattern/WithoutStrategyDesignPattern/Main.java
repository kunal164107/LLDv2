package com.kunal.designPatterns.StrategyDesignPattern.WithoutStrategyDesignPattern;

public class Main {

    public static void main(String args[]) {
        Vehicle vehicle = new PassengerVehicle();
        vehicle.drive();

        Vehicle vehicle1 = new OffRoadVehicle();
        vehicle1.drive();

        Vehicle vehicle2 = new SportsVehicle();
        vehicle2.drive();
    }
}
