package javamaster.annotation.general.override;

public class OverrideMain {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        p1.printMessage();
        p1.printMeassageNotOverride();

        Parent p2 = new Child();
        p2.printMessage();
        p2.printMeassageNotOverride();
    }
}
