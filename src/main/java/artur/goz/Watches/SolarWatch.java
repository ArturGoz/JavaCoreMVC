package artur.goz.Watches;

import java.sql.Date;

public class SolarWatch extends Watch {

    public SolarWatch(Colour colour, Price price, Date date) {
        super(colour, price, date);
    }

    @Override
    public void work() {
        System.out.println("I need sun to work");
    }
}
