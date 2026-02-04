package org.example.price;

public class PriceWatcher {
    Priceservice priceService;
    NotificationService notificationService;

    PriceWatcher(Priceservice priceService, NotificationService notificationService){
            this.priceService = priceService;
            this.notificationService = notificationService;
        }
    public void checkPrices(){
        int price = priceService.getPrice("T-SHIRT");
        if (price < 100)
        notificationService.notify("T-SHIRT", priceService.getPrice("T-SHIRT"));

    }
}
