package com.kunal.designPatterns.SolidPrinciples.DependencyInversionPrinciple;

public class Main {

    public static void main(String args[]) {
//        Computer computer = new Computer(new WiredKeyboard(), new WiredMouse());
//        computer.type();
//        computer.click();

        Computer computer = new Computer(new WiredKeyboard(), new WiredMouse());
        computer.type();
        computer.click();

        Computer computer1 = new Computer(new BluetoothKeyboard(), new BluetoothMouse());
        computer1.type();
        computer1.click();
    }
}
