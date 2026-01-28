package org.example.weather;

public class outFitAdvisor {

        private final WeatherService weatherService;

        public outFitAdvisor(WeatherService weatherService){
            this.weatherService = weatherService;

        }
        public String getClothingAdvice(){
            if(weatherService.getTemperature() < 0)
            return  "Vinterjacka";
            return null;
        }

}
