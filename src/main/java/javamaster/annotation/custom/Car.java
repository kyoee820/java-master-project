package javamaster.annotation.custom;

import javamaster.annotation.custom.annotation.ModelDescriptionPrint;
import javamaster.annotation.custom.annotation.ModelDescriptionPrints;

import java.time.LocalDate;

public class Car {
    private final String model;
    // 1980 ~ 2025
    private final Integer year;

    public Car(String model, Integer year) {
        this.model = model;
        this.year = year;
    }

    @ModelDescriptionPrints({
            @ModelDescriptionPrint(model = "Sonata", description = "steady seller"),
            @ModelDescriptionPrint(model = "Ionic", description = "new model"),
            @ModelDescriptionPrint(model = "Grandeur", description = "luxury model"),
            @ModelDescriptionPrint(model = "Avante", description = "compact model"),
            @ModelDescriptionPrint(model = "Morning", description = "small car")
    })
    public String getModel() {
        try {
            ModelDescriptionPrint[] annotations = this.getClass().getMethod("getModel").getAnnotationsByType(ModelDescriptionPrint.class);
            for (ModelDescriptionPrint annotation : annotations) {
                if (annotation.model().equals(model)) {
                    System.out.println(annotation.description());
                }
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return model;
    }

    public Integer getYear() {
        return year;
    }

    // 생산 된지 5년이 넘었으면 정비가 필요합니다.
    private boolean isNeedMaintenance() {
        return LocalDate.of(year,1, 1).isBefore(LocalDate.now().minusYears(5));
    }

    // 오일 교체
    public boolean isNeedChangeOil() {
        // oil 교체는 1개월 마다 해야함
        return LocalDate.of(year, 1, 1).isBefore(LocalDate.now().minusYears(1));
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year='" + year + '\'' +
                '}';
    }

}
