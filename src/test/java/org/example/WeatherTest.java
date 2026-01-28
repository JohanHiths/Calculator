package org.example;


import org.example.weather.WeatherService;
import org.example.weather.outFitAdvisor;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@ExtendWith(MockitoExtension.class)
public class WeatherTest {

    @Mock
    WeatherService weatherService;

    @InjectMocks
    outFitAdvisor advisor;

//    @BeforeEach
//    void setup() {
//
//        WeatherService weatherService;
//        outFitAdvisor advisor;
//    }


    @Test
    void freezingTemps(){
        Mockito.when(weatherService.getTemperature()).thenReturn((float) -5.0);
        String advice = advisor.getClothingAdvice();
        assertThat(advice).isEqualTo("VinterJacka");

    }

    @Test
    void summerTemps(){
        Mockito.when(weatherService.getTemperature()).thenReturn((float) 15.0);
        String advice = advisor.getClothingAdvice();
        assertThat(advice).isEqualTo("Sweatpants");
    }
    @Test
    void defaultAdvice(){
        Mockito.when(weatherService.getTemperature())
                .thenThrow(new IllegalStateException());

        assertThat(advisor.getClothingAdvice()).
                isEqualTo("Jeans and Jacket");


    }

}
