package com.kunal.designPatterns.StrategyDesignPattern.WithStrategyDesignPattern.strategy;

public class SpecialDrive implements Drive {

    @Override
    public void drive() {
        System.out.println("Special Drive Capability");
    }
}
