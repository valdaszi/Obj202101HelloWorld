package lt.bit.obj.p22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionsStreamsDemo {

    public static void main(String... args) {

        List<Integer> integersList = Arrays.asList(-10, 25, 60, 130, 0, -99);
        System.out.println(integersList);

        //

        int count = 0;
        for (Integer i : integersList) {
            if ( i > 0) count++;
        }
        System.out.println(count);
        System.out.println(integersList.stream().filter(i -> i > 0).count());

        //

        int sum = 0;
        for (Integer i : integersList) {
            if ( i < 0) sum += i;
        }
        System.out.println(sum);
        System.out.println(integersList.stream()
                .filter(i -> i < 0)
                .mapToInt(i -> i)
                .sum()
        );

        //

        List<Integer> integersList2 = new ArrayList<>();
        for (Integer i : integersList) {
            integersList2.add(i * 2);
        }
        System.out.println(integersList2);
        System.out.println(integersList.stream()
                .map(x -> x * 2)
                .collect(Collectors.toList())
        );

        // Susumuoti pirmus 3

        int sum2 = 0;
        int limit = 3;

        for (Integer i : integersList) {
            sum2 += i;
            if (--limit <= 0) break;
        }
        System.out.println(sum2);
        System.out.println(integersList.stream()
                .limit(3)
                .mapToInt(x -> x)
                .sum()
        );

    }

}
