package com.kunal.designPatterns.SolidPrinciples.LiskovSubstitutionPrinciple;

public class Cycle implements Vehicle {

    @Override
    public void applyBrake() {
        System.out.println("Cycle Brake Applied");
    }
}
