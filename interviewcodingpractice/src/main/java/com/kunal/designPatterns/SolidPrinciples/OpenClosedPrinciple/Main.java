package com.kunal.designPatterns.SolidPrinciples.OpenClosedPrinciple;

public class Main {

    public static void main(String arge[]) {
        Invoice invoice = new Invoice();
        invoice.saveToDB();
//        invoice.saveToFile();

        SaveToDB saveToDB = new SaveToDB();
        saveToDB.save(invoice);

        SaveToFile saveToFile = new SaveToFile();
        saveToFile.save(invoice);
    }
}

