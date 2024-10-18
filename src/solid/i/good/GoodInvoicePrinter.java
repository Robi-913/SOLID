package solid.i.good;

import solid.i.ComplexInvoice;
import solid.i.Invoice;

public class GoodInvoicePrinter implements GoodInvoicePrinter_I {
    @Override
    public void print(Invoice invoice) {
        System.out.println("Printing invoice " + invoice);
    }

    @Override
    public void printComplexInvoice(ComplexInvoice complexInvoice) {
        System.out.println("Printing complex invoice " + complexInvoice);
    }
}
