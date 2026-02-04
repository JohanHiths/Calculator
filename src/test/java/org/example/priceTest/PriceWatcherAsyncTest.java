package org.example.priceTest;

import org.awaitility.Awaitility;
import org.example.price.NotificationService;
import org.example.price.PriceWatcher;
import org.example.price.Priceservice;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@ExtendWith(MockitoExtension.class)
public class PriceWatcherAsyncTest {

    @Mock
    Priceservice priceService;

    @Spy
    NotificationService notificationService = new AsyncNotificationService();

    @InjectMocks
    PriceWatcher priceWatcher;


    @Test
    void sendNotlificationWhenPriceLowerThanThreshold(){
        Mockito.when(priceService.getPrice(("T-SHIRT")))
                .thenReturn(95);

        priceWatcher.checkPrices();

        Awaitility.await().atMost(5, TimeUnit.SECONDS)
                        .until(notificationService::isSent);

        assertThat(notificationService.isSent()).isTrue();


    }
}
