package artur.goz.Watches;


import java.util.Objects;

public class Price {
    private Long amount;
    private Currency currency;

    public Price(Long amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Price(Price price) {
        this.amount = price.getAmount();
        this.currency = price.getCurrency();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Price price = (Price) o;
        return Objects.equals(amount, price.amount) && currency == price.currency;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, currency);
    }

    @Override
    public String toString() {
        return "Price{" +
                "amount=" + amount +
                ", currency=" + currency +
                '}';
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}
