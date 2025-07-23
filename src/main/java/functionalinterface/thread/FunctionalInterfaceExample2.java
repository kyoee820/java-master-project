package functionalinterface.thread;

import java.util.function.*;

public class FunctionalInterfaceExample2 {
    public static void main(String[] args) {
        // BiConsumer : 입력값을 두 개 받아 처리만 하고 반환값은 없음
        BiConsumer<String, Integer> biConsumer  = (String s, Integer i) -> System.out.println(s + " " + i);
        biConsumer.accept("안녕하세요", 5);

        // BiFunction : 입력값을 두 개 받아 결과값을 반환함
        BiFunction<Integer, Integer, String> biFunction = (Integer a, Integer b) -> "결과: " + (a + b);
        String result1 = biFunction.apply(10,20);
        System.out.println(result1);

        // BinaryOperator : 입력값을 두 개 받아 같은 타입의 결과값을 반환함
        BinaryOperator<Integer> binaryOperator = (Integer a, Integer b) -> a * b;
        int result2 = binaryOperator.apply(3,4);
        System.out.println("곱셈 결과: " + result2);

        // BiPredicate : 입력 값을 두 개 받아 boolean 값을 반환함
        BiPredicate<String, String> biPredicate = (String s1, String s2) -> s1.equals(s2);
        boolean isEqual = biPredicate.test("테스트", "테스트");
        System.out.println("문자열 비교 결과: " + isEqual);
    }
}
