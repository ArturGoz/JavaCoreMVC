package artur.goz.Watches;

import java.sql.Date;

public class MechanicalWatch extends Watch {

    public MechanicalWatch(Colour colour, Price price, Date date) {
        super(colour, price, date);
    }

    @Override
    public void work() {
        System.out.println("I need special mechanism to work");
    }

}
