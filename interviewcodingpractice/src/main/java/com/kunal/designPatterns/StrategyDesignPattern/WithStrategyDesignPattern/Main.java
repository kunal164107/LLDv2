package com.kunal.designPatterns.StrategyDesignPattern.WithStrategyDesignPattern;

public class Main {

    public static void main(String args[]) {

        Vehicle v1 = new PassengerVehicle();
        v1.drive();

        Vehicle v2 = new SportsVehicle();
        v2.drive();

        Vehicle v3 = new OffRoadVehicle();
        v3.drive();
    }
}
