package javamaster.annotation.general.deprecated;

public class DeprecatedMain {
    public static void main(String[] args) {
        OldLibrary oldLibrary = new OldLibrary();
        oldLibrary.printMessage();

        NewLibrary newLibrary = new NewLibrary();
        newLibrary.printMessage();
    }
}
