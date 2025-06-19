package artur.goz.Watches;

import java.sql.Date;

public class SmartWatch extends Watch{

    public SmartWatch(Colour colour, Price price, Date date) {
        super(colour, price, date);
    }

    @Override
    public void work() {
        System.out.println("I need energy to work");
    }
}
