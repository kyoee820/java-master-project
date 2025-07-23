package stream;

import java.util.Arrays;
import java.util.function.DoubleBinaryOperator;

/**
 * '11 + 11'을 계산하는 클래스입니다.
 */
public enum Calculator {
    ADD("+", (double a, double b) -> a + b),
    SUBTRACT("-", (double a, double b) -> a - b),
    MULTIPLY("*", (double a, double b) -> a * b),
    DIVIDE("/", (double a, double b) -> a / b);

    private final String symbol;
    private final DoubleBinaryOperator operator;

    Calculator(String symbol, DoubleBinaryOperator operator) {
        this.symbol = symbol;
        this.operator = operator;
    }

    /**
     * '11 + 11'을 계산하는 클래스 입니다.
     * stream을 이용하여 계산합니다.
     */

    public static double calculate(String query) {
        String operator = query.replaceAll("[0-9.]","");
        String[] numbers = query.split("[+\\-*/]");

        double number1 = Double.parseDouble(numbers[0]);
        double number2 = Double.parseDouble(numbers[1]);

        Calculator calc = Arrays.stream(values())
                .filter(calculator -> calculator.getSymbol().equals(operator))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Unknown operator: " + operator));

        return calc.getOperator().applyAsDouble(number1, number2);
    }

    public String getSymbol() {
        return symbol;
    }

    public DoubleBinaryOperator getOperator() {
        return operator;
    }


}
