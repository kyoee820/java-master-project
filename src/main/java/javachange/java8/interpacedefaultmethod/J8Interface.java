package javachange.java8.interpacedefaultmethod;

public interface J8Interface {
    default void printTime() {
        System.out.println(getTime());
    }

    String getTime();
}
