package TeluskoStreamsAndLambda;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Streams {

    public static void doubleIt(int i) {
        System.out.println(i * 2);
    }

    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);

        Iterator<Integer> iterator = values.listIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (int i : values) {
            System.out.println(i);
        }

        Consumer<Integer> cc = (Integer i) -> {
            System.out.println(i);
        };

        values.forEach(cc);
        values.forEach(integer -> System.out.println(integer));

        values.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });

        values.forEach(System.out::println);
        values.forEach(Streams::doubleIt);

//        Function<Integer, Integer> function = (integer) -> {
//            return integer * 2;
//        };
//
//        BinaryOperator<Integer> b = (integer, integer2) -> {
//            return integer + integer2;
//        };

        Stream<Integer> streams1 = values.stream();
//        Stream<Integer> stream2 = streams1.map((integer) -> integer * 2);
//        Integer val = (Integer) stream2.reduce(0, (integer, integer2) -> integer + integer2);

//        Integer val =  streams1.map(i -> i* 2).reduce(0, (integer, integer2) -> integer + integer2);
//        Integer val = values.stream().map(i -> i * 2).reduce(0, (c, e) -> c + e);
//        System.out.println(val);

//        System.out.println(values.stream().map(i -> i * 2).reduce(0, (c, e) -> c + e));
        System.out.println(values.stream().map(i -> i * 2).reduce(0, Integer::sum));

        List<Integer> list1 = Arrays.asList(12,20,35,46,55,68,75);

        int result = 0;

        for (int i : list1)
        {
            if (i%5 == 0)
            {
                result += i;
            }
        }

        System.out.println(result);
        System.out.println(list1.stream().filter(integer -> integer%5 == 0).reduce(0,(c,e)-> c+e));

        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer%5 == 0;
            }
        };

        System.out.println(list1.stream().filter(predicate).reduce(Integer::sum).orElse(0));
        System.out.println(list1.stream().filter(i-> i%5==0).map(i->i*2).findFirst().orElse(0));
    }
}
