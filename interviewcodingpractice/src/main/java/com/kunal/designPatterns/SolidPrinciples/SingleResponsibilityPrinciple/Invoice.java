package com.kunal.designPatterns.SolidPrinciples.SingleResponsibilityPrinciple;

public class Invoice {

    Marker marker;

    public Invoice(Marker marker) {
        this.marker = marker;
    }

    public String getTotal() {
        String price = marker.price;
        return price;
    }

//    public void printInvoice() {
//        System.out.println("Invoice printed");
//    }
//
//    public void saveToDB() {
//        System.out.println("Saved to SQL database");
//    }
}
