package artur.goz.Watches;

import java.sql.Date;

public class QuartzWatch extends Watch{

    public QuartzWatch(Colour colour, Price price, Date date) {
        super(colour, price, date);
    }

    @Override
    public void work() {
        System.out.println("I need quartz to work");
    }
}
