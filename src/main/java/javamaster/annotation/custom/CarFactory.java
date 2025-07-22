package javamaster.annotation.custom;

import javamaster.annotation.custom.validator.Validator;

public class CarFactory {
    public static Car createdCar(CarRequest carRequest) {
        Validator.validateYear(carRequest);
        return new Car(carRequest.getModel(), carRequest.getYear());
    }
}
