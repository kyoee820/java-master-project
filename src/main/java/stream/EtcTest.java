package stream;

import net.datafaker.Faker;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class EtcTest {
    private final Faker faker = new Faker();

    @Test
    void streamCanNotBeReused() {
        Stream<String> names = Stream.generate(()-> faker.name().fullName())
                .limit(2);

        names.forEach(System.out::println);
        names.forEach(System.out::println);
    }

    @Test
    void streamNeedReused() {
        List<String> names = Stream.generate(()-> faker.name().fullName())
                .limit(2)
                .toList();

        names.stream().forEach(System.out::println);
        names.stream().forEach(System.out::println);
    }
}