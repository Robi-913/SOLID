package solid.d.good;

import solid.i.Invoice;

public class GoodPrintingService {

    private final InvoicePrinter invoicePrinter;

    public GoodPrintingService(InvoicePrinter invoicePrinter) {
        this.invoicePrinter = invoicePrinter;
    }

    public void print(Invoice invoice) {
        invoicePrinter.print(invoice);
    }
}
