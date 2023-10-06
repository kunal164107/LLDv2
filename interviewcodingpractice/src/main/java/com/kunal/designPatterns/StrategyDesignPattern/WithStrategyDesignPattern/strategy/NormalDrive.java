package com.kunal.designPatterns.StrategyDesignPattern.WithStrategyDesignPattern.strategy;

public class NormalDrive implements Drive {

    @Override
    public void drive() {
        System.out.println("Normal Drive Capability");
    }
}
