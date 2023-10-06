package com.kunal.designPatterns.SolidPrinciples.LiskovSubstitutionPrinciple;

public class Main {

    public static void main(String args[]) {

//        Bike motorCycle = new MotorCycle();
//        motorCycle.startEngine();
//        motorCycle.applyBrake();

//        Bike cycle = new Cycle();
//        try {
//            cycle.startEngine();
//        } catch (AssertionError e) {
//            System.out.println("Exception Message : " + e.getMessage());
//        }
//        cycle.applyBrake();

        Vehicle motorCycle = new MotorCycle();
        motorCycle.applyBrake();
//        motorCycle.startEngine(); // Compile time error is fine, at least it should change or break the code in run time.

        Bike bike = new MotorCycle();
        bike.applyBrake();
        bike.startEngine();

        Vehicle cycle = new Cycle();
        cycle.applyBrake();

    }
}
