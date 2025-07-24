package javachange.java8.interpacedefaultmethod;

public class InterfaceDefaultMethodExample {
    public static void main(String[] args) {
        J7Class j7Class = new J7Class();
        j7Class.printClassName();

        J8Class j8Class = new J8Class();
        J8Class2 j8Class2 = new J8Class2();
        J8Class3 j8Class3 = new J8Class3();
        j8Class.printTime();
        j8Class2.printTime();
        j8Class3.printTime();
    }
}
