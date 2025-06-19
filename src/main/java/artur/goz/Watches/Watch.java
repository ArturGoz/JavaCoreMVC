package artur.goz.Watches;

import java.sql.Date;
import java.util.Objects;

public abstract class Watch {
    protected Colour colour;
    protected Price price;
    protected Date date;

    public Watch(Colour colour, Price price, Date date) {
        this.colour = colour;
        this.price = price;
        this.date = date;
    }

    public abstract void work();

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Watch{" +
                "colour='" + colour + '\'' +
                ", price=" + price +
                ", date=" + date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Watch watch = (Watch) o;
        return Objects.equals(colour, watch.colour) && Objects.equals(price, watch.price) && Objects.equals(date, watch.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(colour, price, date);
    }
}
