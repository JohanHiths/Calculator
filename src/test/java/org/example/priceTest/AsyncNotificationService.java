package org.example.priceTest;

import org.example.price.NotificationService;

public class AsyncNotificationService implements NotificationService {

    private boolean isSent = false;


    @Override
    public void notify(String productName, int price) {
        new Thread(() -> {
            try {
                Thread.sleep(5000);

                isSent = true;
                System.out.println("Sending notification for " + productName + " at " + price);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();
    }

    @Override
    public boolean isSent() {
        return isSent;
    }
}
