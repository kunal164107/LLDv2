package com.kunal.designPatterns.SolidPrinciples.OpenClosedPrinciple;

public class SaveToDB implements InvoiceDao {

    @Override
    public void save(Invoice invoice) {
        System.out.println(invoice.getClass() + " saved to DB");
    }
}
