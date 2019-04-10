package be.niels.invoicer.adapter.controller.springrest;

import be.niels.invoicer.usecase.invoice.CreateInvoice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InvoiceController {

    private final CreateInvoice createInvoice;
    private final InvoiceMapper invoiceMapper;

    public InvoiceController(CreateInvoice createInvoice, InvoiceMapper invoiceMapper) {
        this.createInvoice = createInvoice;
        this.invoiceMapper = invoiceMapper;
    }

    @PostMapping(path = "/invoices", consumes = "application/json", produces = "application/json")
    public InvoiceDto create(@RequestBody final InvoiceDto invoiceDto) {
        return invoiceMapper
                .toDto(createInvoice
                        .execute(invoiceMapper
                                .toDomain(invoiceDto)));
    }

}
