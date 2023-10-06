package com.kunal.designPatterns.SolidPrinciples.OpenClosedPrinciple;

public class SaveToFile implements InvoiceDao {

    @Override
    public void save(Invoice invoice) {
        System.out.println(invoice.getClass() + " saved to File");
    }

}
