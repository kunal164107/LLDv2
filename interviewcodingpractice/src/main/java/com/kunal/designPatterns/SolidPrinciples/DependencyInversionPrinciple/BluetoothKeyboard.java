package com.kunal.designPatterns.SolidPrinciples.DependencyInversionPrinciple;

public class BluetoothKeyboard implements Keyboard {

    @Override
    public void type() {
        System.out.println("Typing through Bluetooth Keyboard");
    }
}
