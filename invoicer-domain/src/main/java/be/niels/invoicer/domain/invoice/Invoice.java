package be.niels.invoicer.domain.invoice;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.UUID;

public class Invoice {

    private UUID id;
    private BigDecimal amount;
    private Currency currency;

    public Invoice(BigDecimal amount, Currency currency) {
        this.id = UUID.randomUUID();
        this.amount = amount;
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "Invoice " + id + " | " + amount + " " + currency.getDisplayName();
    }
}
