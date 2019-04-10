package be.niels.invoicer.domain.invoice;

import java.util.List;
import java.util.Optional;

public interface InvoiceRepository {

    Invoice save(Invoice invoice);

    Optional<Invoice> findById(String id);

    List<Invoice> findAllInvoices();

}
