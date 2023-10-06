package com.kunal.designPatterns.SolidPrinciples.SingleResponsibilityPrinciple;

public class InvoicePrinter {

    Invoice invoice;

    public InvoicePrinter(Invoice invoice) {
        this.invoice = invoice;
    }

    public void printInvoice() {
        System.out.println("Invoice printed");
    }
}
