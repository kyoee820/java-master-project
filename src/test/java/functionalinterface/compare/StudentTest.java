package functionalinterface.compare;

import net.datafaker.Faker;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(value = MethodOrderer.MethodName.class)
class StudentTest {
    private final Faker faker = new Faker();

    private final Supplier<Student> getStudent = () -> new Student(faker.name().fullName(), faker.number().numberBetween(0, 100));
    private final Supplier<List<Student>> getStudents = () ->
            IntStream.range(0, 20)
                    .mapToObj(i -> getStudent.get())
                    .collect(Collectors.toCollection(ArrayList::new));

    @Test
    void testComparable() {
        Student student1 = getStudent.get();
        Student student2 = getStudent.get();

        System.out.println(student1 + " vs " + student2);
        System.out.println(student1.compareTo(student2));
    }

    @Test
    void testComparableSort() {
        List<Student> students = getStudents.get();
        System.out.println("### Before Sort ###");
        students.forEach(System.out::println);

        System.out.println("### After Sort ###");
        students.sort(Student::compareTo);
        students.forEach(System.out::println);

    }

    @Test
    void testComparableReverseSort() {
        List<Student> students = getStudents.get();
        System.out.println("### Before Sort###");
        students.forEach(System.out::println);

        System.out.println("### After Sort ###");
        students.sort(Collections.reverseOrder());
        students.forEach(System.out::println);
    }

    @Test
    void testComparator() {
        Student student1 = getStudent.get();
        Student student2 = getStudent.get();

        System.out.println(student1 + " vs " + student2);
        System.out.println(new NameComparator().compare(student1, student2));
    }

    @Test
     void testComparatorSort() {
        List<Student> students = getStudents.get();
        System.out.println("### Before Sort ###");
        students.forEach(System.out::println);

        System.out.println("### After Sort ###");
        students.sort(new NameComparator());
        students.forEach(System.out::println);
    }

    @Test
    void testComparatorReverseSort() {
        List<Student> students = getStudents.get();
        System.out.println("### Before Sort ###");
        students.forEach(System.out::println);

        System.out.println("### After Sort ###");
        students.sort(new NameComparator().reversed());
        students.forEach(System.out::println);
    }

}