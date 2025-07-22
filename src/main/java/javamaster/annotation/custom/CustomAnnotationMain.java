package javamaster.annotation.custom;

import javamaster.annotation.custom.validator.Validator;

public class CustomAnnotationMain {
    public static void main(String[] args) {
        Car car = CarFactory.createdCar(new CarRequest("BMW", 2021));
        System.out.println(car);
    }
}
