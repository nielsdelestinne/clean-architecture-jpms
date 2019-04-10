package be.niels.invoicer.adapter.controller.springrest;

import be.niels.invoicer.domain.invoice.Invoice;

import java.math.BigDecimal;
import java.util.Currency;

import static be.niels.invoicer.adapter.controller.springrest.InvoiceDto.invoiceDto;

public class InvoiceMapper {

    public Invoice toDomain(InvoiceDto dto) {
        return new Invoice(new BigDecimal(dto.getAmount()), Currency.getInstance(dto.getCurrency()));
    }

    public InvoiceDto toDto(Invoice invoice) {
        return invoiceDto()
                .withAmount(invoice.getAmount().doubleValue())
                .withCurrency(invoice.getCurrency().getCurrencyCode());
    }
}
