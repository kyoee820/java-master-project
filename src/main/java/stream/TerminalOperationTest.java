package stream;

import net.datafaker.Faker;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class TerminalOperationTest {
    private final Faker faker = new Faker();

    @Test
    void forEach() {
        List<String> names = Stream.generate(()->faker.name().fullName())
                        .limit(10)
                        .toList();
        System.out.println(names);

        Stream.generate(()-> faker.name().fullName())
                .limit(10)
                .forEach(System.out::println);
    }

    @Test
    void count() {
        long count = Stream.generate(()->faker.name().fullName())
                .limit(14)
                .count();
        System.out.println(count);
    }

    @Test
    void match() {
        boolean anyMatch = Stream.generate(()-> faker.number().numberBetween(1,5))
                .limit(10)
                .peek(System.out::println)
                .anyMatch(i -> i == 3);
        System.out.println("anyMatch: " + anyMatch);

        boolean allMatch = Stream.generate(()-> faker.number().numberBetween(1,5))
                .limit(10)
                .peek(System.out::println)
                .allMatch(i -> i == 3);
        System.out.println("allMatch: " + allMatch);

        boolean noneMatch = Stream.generate(()-> faker.number().numberBetween(1,5))
                .limit(10)
                .peek(System.out::println)
                .noneMatch(i -> i == 3);
        System.out.println("noneMatch: " + noneMatch);
    }

    @Test
    void findFirst() {
        String name = Stream.generate(()-> faker.name().fullName())
                .limit(10)
                .peek(System.out::println)
                .findFirst()
                .orElse("No Name");
        System.out.println(name);
    }

    /**
     * 포켓몬 이름의 5개 문자열을 만들고
     * 그 문자열을 하나의 String으로 합쳐줘.
     * 포켓몬 이름 사이에는 //를 넣어줘
     */
    @Test
    void reduce() {
        String pokemonName = Stream.generate(()-> faker.pokemon().name())
                .limit(5)
                .peek(System.out::println)
                .reduce((s1, s2) -> s1 + "//" + s2)
                .orElse("No Name");
        System.out.println(pokemonName);
    }
}
