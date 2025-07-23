package anonymous;

public class AnonymousExampleMain {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.sound();
        cat.sound();

        Animal crow = new Animal() {
            @Override
            public void sound() {
                System.out.println("까악");
            }
        };

        crow.sound();

        Animal sparrow = new Animal() {
            @Override
            public void sound() {
                System.out.println(soundString() + soundString());
            }

            public String soundString() {
                return "짹짹";
            }
        };

        sparrow.sound();
    }
}
