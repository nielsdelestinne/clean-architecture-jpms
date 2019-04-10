package be.niels.invoicer.usecase.invoice;

import be.niels.invoicer.domain.invoice.Invoice;
import be.niels.invoicer.domain.invoice.InvoiceRepository;

public class CreateInvoice {

    private final InvoiceRepository invoiceRepository;

    public CreateInvoice(final InvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    public Invoice execute(final Invoice invoice) {
        // TODO: perform validation
        return invoiceRepository.save(invoice);
    }
}
