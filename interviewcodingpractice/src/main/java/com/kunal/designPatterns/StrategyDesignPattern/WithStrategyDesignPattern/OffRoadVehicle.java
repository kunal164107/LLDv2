package com.kunal.designPatterns.StrategyDesignPattern.WithStrategyDesignPattern;

import com.kunal.designPatterns.StrategyDesignPattern.WithStrategyDesignPattern.strategy.SpecialDrive;

public class OffRoadVehicle extends Vehicle {

    OffRoadVehicle() {
        super(new SpecialDrive());
    }
}
