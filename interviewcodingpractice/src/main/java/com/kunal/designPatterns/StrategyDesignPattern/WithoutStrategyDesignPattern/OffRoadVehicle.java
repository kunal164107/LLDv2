package com.kunal.designPatterns.StrategyDesignPattern.WithoutStrategyDesignPattern;

public class OffRoadVehicle extends Vehicle {

    @Override
    void drive() {
        System.out.println("Special Drive Capability");
    }
}
