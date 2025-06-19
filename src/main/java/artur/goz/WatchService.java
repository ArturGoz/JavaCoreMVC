package artur.goz;

import artur.goz.Watches.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class WatchService {
    private final List<Watch> watchList;

     {
        watchList = new ArrayList<>();
        watchList.add(new MechanicalWatch(Colour.BLACK, new Price(100L, Currency.DOLLAR),
                Date.valueOf("2025-06-18")));
        watchList.add(new QuartzWatch(Colour.WHITE, new Price(155L, Currency.DOLLAR),
                Date.valueOf("2025-06-10")));
        watchList.add(new SolarWatch(Colour.BROWN, new Price(199L, Currency.EURO),
                Date.valueOf("2025-06-5")));
        watchList.add(new SmartWatch(Colour.BLUE, new Price(299L, Currency.EURO),
                Date.valueOf("2025-06-1")));
    }

    public  void addWatch(WatchDTO watchDTO) {
        if (watchDTO.getPrice().getAmount() < 0 ||
                watchDTO.getPrice().getCurrency() == null || watchDTO.getColour() == null)
            throw new RuntimeException("Problem in adding watch");

        watchList.add(new MechanicalWatch(watchDTO.getColour(), new Price(watchDTO.getPrice()), watchDTO.getDate()));
    }

    public  void showGeneralWatchesPrice() {
        System.out.println(watchList.stream().map(e -> e.getPrice().getAmount())
                .reduce(0L, Long::sum));
    }

    public  void showAllWatches() {
        System.out.println(watchList);
    }

    public  void showWatchesBySortedPrice() {
        System.out.println(watchList.stream()
                .sorted(Comparator.comparing(e -> e.getPrice().getAmount()))
                .collect(Collectors.toList()));
    }

    public  void showWatchesBySortedDate() {
        System.out.println(watchList.stream().sorted(Comparator.comparing(Watch::getDate))
                .collect(Collectors.toList()));
    }

    public  void showWatchesBySortedColour() {
        System.out.println(watchList.stream().sorted(Comparator.comparing(Watch::getColour))
                .collect(Collectors.toList()));
    }
}
