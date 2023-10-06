package com.kunal.designPatterns.SolidPrinciples.LiskovSubstitutionPrinciple;

public class MotorCycle implements Bike {

    @Override
    public void startEngine() {
        System.out.println("Motorcycle Engine Started");
    }

    @Override
    public void applyBrake() {
        System.out.println("Motorcycle Brake Applied");
    }

}
