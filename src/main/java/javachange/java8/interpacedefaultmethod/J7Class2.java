package javachange.java8.interpacedefaultmethod;

public class J7Class2 implements J7Interface {
    @Override
    public void printClassName() {
        System.out.println(getClass().getSimpleName());
    }
}
