package FunctionalJavaWithAmigoscode;

import java.util.List;

import static FunctionalJavaWithAmigoscode.Main.Gender.FEMALE;
import static FunctionalJavaWithAmigoscode.Main.Gender.MALE;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(new Person("John", MALE),
                new Person("John", MALE),
                new Person("Maria", FEMALE));
    }

    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}
