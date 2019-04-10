package be.niels.invoicer.adapter.controller.springrest;

public class InvoiceDto {

    private String id;
    private double amount;
    private String currency;

    private InvoiceDto() {
    }

    public static InvoiceDto invoiceDto() {
        return new InvoiceDto();
    }

    public String getId() {
        return id;
    }

    public InvoiceDto withId(String id) {
        this.id = id;
        return this;
    }

    public double getAmount() {
        return amount;
    }

    public InvoiceDto withAmount(double amount) {
        this.amount = amount;
        return this;
    }

    public String getCurrency() {
        return currency;
    }

    public InvoiceDto withCurrency(String currency) {
        this.currency = currency;
        return this;
    }
}
