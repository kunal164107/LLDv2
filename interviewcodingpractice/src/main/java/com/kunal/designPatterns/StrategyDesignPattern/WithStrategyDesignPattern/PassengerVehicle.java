package com.kunal.designPatterns.StrategyDesignPattern.WithStrategyDesignPattern;

import com.kunal.designPatterns.StrategyDesignPattern.WithStrategyDesignPattern.strategy.NormalDrive;

public class PassengerVehicle extends Vehicle {

    PassengerVehicle() {
        super(new NormalDrive());
    }
}
