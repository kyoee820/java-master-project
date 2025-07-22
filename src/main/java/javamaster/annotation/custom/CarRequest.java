package javamaster.annotation.custom;

public class CarRequest {
        private final String model;
        private final Integer year;

        public CarRequest(String model, Integer year) {
            this.model = model;
            this.year = year;
        }

        public String getModel() {
            return model;
        }

        public Integer getYear() {
            return year;
        }

}
