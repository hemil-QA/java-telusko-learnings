package JavaBrainsLambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Unit1Exercise {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 54),
                new Person("Charlotte", "Bronte", 45),
                new Person("Mathew", "Arnold", 40)
        );


    }

    public List sort(List list) {
        List<String> names = Arrays.asList("Hey","My","Goal");
        for (String s : names) {
            System.out.println(s);
        }
        return list;
    }
}
