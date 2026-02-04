package org.example.weather;

public class outFitAdvisor {

        private final WeatherService weatherService;

        public outFitAdvisor(WeatherService weatherService){
            this.weatherService = weatherService;

        }
        public String getClothingAdvice() {
            try {
                var temp = weatherService.getTemperature();
                if (temp < 0)
                    return "Vinterjacka";
                if (temp >= 15)
                    return "Sweatpants";
                return null;
            } catch(IllegalStateException e) {
                return "Jeans and Jacket";

            }
        }
}
