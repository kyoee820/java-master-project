package javamaster.annotation.custom;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CustomAnnotationMainTest {

    //2000 ~ 2025
    @Test
    public void testValidYearRange() {
        Car car = CarFactory.createdCar(new CarRequest("BMW", 2021));
        assertThat(car.getYear()).isEqualTo(2021);

        System.out.println(car);
    }

    @Test
    public void testInvalidYearRange() {
        assertThatThrownBy(() -> CarFactory.createdCar(new CarRequest("BMW", 2026)))
                .isInstanceOf(IllegalArgumentException.class);
    }

}