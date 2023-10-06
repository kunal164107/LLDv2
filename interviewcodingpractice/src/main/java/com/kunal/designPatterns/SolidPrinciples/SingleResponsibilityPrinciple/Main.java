package com.kunal.designPatterns.SolidPrinciples.SingleResponsibilityPrinciple;

public class Main {

    public static void main(String args[]) {

        Marker marker = new Marker("Red", "10");
        Invoice invoice = new Invoice(marker);
        System.out.println("Total " + marker.name + " marker is " + invoice.getTotal());
//        invoice.printInvoice();
//        invoice.saveToDB();

        InvoiceDao invoiceDao = new InvoiceDao(invoice);
        invoiceDao.saveToDB();

        InvoicePrinter invoicePrinter = new InvoicePrinter(invoice);
        invoicePrinter.printInvoice();

    }
}
