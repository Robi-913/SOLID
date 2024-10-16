package solid.d.good;

import solid.i.Invoice;

public class HtmlInvoicePrinter implements InvoicePrinter {
    @Override
    public void print(Invoice invoice) {
        System.out.println("<html><body>Invoice: " + invoice.toString() + "</body></html>");
    }
}
