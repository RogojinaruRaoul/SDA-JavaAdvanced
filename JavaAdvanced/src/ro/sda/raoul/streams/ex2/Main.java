package ro.sda.raoul.streams.ex2;


import java.util.List;
import java.util.Locale;

public class Main {

    private static List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

    public static void main(String[] args) {
        courses.stream()
                .forEach(course -> System.out.println(course));

        System.out.println("==================================");

        courses.stream()
                .filter(course -> course.contains("Spring"))
                .forEach(course -> System.out.println(course));

        System.out.println("==================================");

        courses.stream()
                .filter(course->course.length()>=4)
                .forEach(course -> System.out.println(course));

        System.out.println("==================================");

        courses.stream()
                .map(courses->courses.length())
                .forEach(numberOfCharacters-> System.out.println(numberOfCharacters));

        System.out.println("==================================");

        courses.stream()
                .map(course->course.toUpperCase(Locale.ROOT))
                .map(course->"test-".concat(course))
                .sorted()
                .skip(1)
                .limit(4)
                .forEach(course-> System.out.println(course));
    }
}
