package com.kunal.designPatterns.SolidPrinciples.DependencyInversionPrinciple;

public class Computer {

//    WiredKeyboard keyboard;
//    WiredMouse mouse;
//
//    Computer(WiredKeyboard keyboard, WiredMouse mouse) {
//        this.keyboard = keyboard;
//        this.mouse = mouse;
//    }

    Keyboard keyboard;
    Mouse mouse;

    Computer(Keyboard keyboard, Mouse mouse) {
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

    void type() {
        keyboard.type();
    }

    void click() {
        mouse.click();
    }
}
