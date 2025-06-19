package artur.goz;

import artur.goz.Watches.Colour;
import artur.goz.Watches.Price;

import java.sql.Date;

public class WatchDTO {
    private Colour colour;
    private Date date;
    private Price price;

    public WatchDTO(Colour colour, Date date, Price price) {
        this.colour = colour;
        this.date = date;
        this.price = price;
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }
}
