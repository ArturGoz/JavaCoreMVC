package artur.goz;

public class WatchController {
    private static final WatchService watchService = new WatchService();
    public static void controlMessages(String message) {
        switch (message) {
            case "show all":
                watchService.showAllWatches();
                break;
            case "general price":
                watchService.showGeneralWatchesPrice();
                break;
            case "sorted price":
                watchService.showWatchesBySortedPrice();
                break;
            case "sorted colours":
                watchService.showWatchesBySortedColour();
                break;
            case "sorted date":
                watchService.showWatchesBySortedDate();
                break;
            case "add watch":
                watchService.addWatch(new WatchDTORequest().doRequest());
                break;
            default:
                System.out.println("Invalid request");
        }
    }
}
