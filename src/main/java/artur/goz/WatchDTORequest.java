package artur.goz;

import artur.goz.Watches.Colour;
import artur.goz.Watches.Currency;
import artur.goz.Watches.Price;

import java.sql.Date;
import java.util.Scanner;

public class WatchDTORequest implements DTORequest<WatchDTO> {
    @Override
    public WatchDTO doRequest() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the colour of the watch: ");
        Colour colour = Colour.valueOf(sc.nextLine());
        System.out.println("Enter the amount of price for the watch: ");
        Long amount = Long.valueOf(sc.nextLine());
        System.out.println("Enter the currency of price for the watch: ");
        Currency currency = Currency.valueOf(sc.nextLine());
        Price price = new Price(amount, currency);
        Date date = new Date(System.currentTimeMillis());
        System.out.println("watch added");
        return new WatchDTO(colour, date, price);
    }
}
