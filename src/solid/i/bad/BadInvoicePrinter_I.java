package solid.i.bad;

import solid.i.ComplexInvoice;
import solid.i.Invoice;

public interface BadInvoicePrinter_I {

    void print(Invoice invoice);

    void printComplexInvoice(ComplexInvoice complexInvoice);

    void someOtherPrintMethod(Invoice invoice);

}