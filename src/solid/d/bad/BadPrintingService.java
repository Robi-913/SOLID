package solid.d.bad;

import solid.i.Invoice;
import solid.i.good.GoodInvoicePrinter;

public class BadPrintingService {

    private GoodInvoicePrinter invoicePrinter; // notice the lack of an interface!

    public BadPrintingService() {
        this.invoicePrinter = new GoodInvoicePrinter();
    }

    public void print(Invoice invoice) {
        invoicePrinter.print(invoice);
    }

}