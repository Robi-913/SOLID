package solid.i.good;

import solid.i.ComplexInvoice;
import solid.i.Invoice;

public interface GoodInvoicePrinter_I {

    void print(Invoice invoice);

    void printComplexInvoice(ComplexInvoice complexInvoice);

}
