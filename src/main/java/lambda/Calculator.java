package lambda;

public class Calculator {
    private final int a;
    private final int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // 매개변수(Operate) 자체를 인터페이스(Operate.class)로 받아서 받은 인터페이스로 명령을 수행하는
    public int calculate(Operate operate) {
        return operate.operate(a, b);
    }
}
