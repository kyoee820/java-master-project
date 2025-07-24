package stream;

import net.datafaker.Faker;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private final Faker faker = new Faker();
    
    @Test
    void testAdd() {
        String query = faker.number().randomDouble(2,1,100) + "+" + faker.number().randomDouble(2,1,100);
        System.out.println(query);
        System.out.println("Result: " + Calculator.calculate(query));
    }
}
