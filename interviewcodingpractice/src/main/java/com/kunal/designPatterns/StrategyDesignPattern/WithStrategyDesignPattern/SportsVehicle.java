package com.kunal.designPatterns.StrategyDesignPattern.WithStrategyDesignPattern;

import com.kunal.designPatterns.StrategyDesignPattern.WithStrategyDesignPattern.strategy.SpecialDrive;

public class SportsVehicle extends Vehicle {

    SportsVehicle() {
        super(new SpecialDrive());
    }
}
