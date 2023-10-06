package com.kunal.designPatterns.SolidPrinciples.DependencyInversionPrinciple;

public class WiredMouse implements Mouse {

    @Override
    public void click() {
        System.out.println("Clicking through Wired Mouse");
    }
}
