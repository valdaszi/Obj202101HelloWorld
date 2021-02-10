package lt.bit.obj.p17;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class NumbersSorting {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(100, 22, 9, 10, null, 2, 21, 99, 1);

//        Comparator<Integer> cmpInt = new Comparator<Integer>() {
//
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                // return o1 < o2 ? -1 : o1 == o2 ? 0 : 1;
//                return o1 - o2;
//            }
//        };

//        Comparator<Integer> cmpInt = (Integer o1, Integer o2) -> { return o1 - o2; };

//        Comparator<Integer> cmpInt = (o1, o2) -> o1 - o2;
//        numbers.sort(cmpInt);

        numbers.sort((o1, o2) -> (o1 == null ? Integer.MAX_VALUE : o1) - (o2 == null ? Integer.MAX_VALUE : o2));

        System.out.println(numbers);


        List<String> strings = Arrays.asList("100", "22", "9", "10", null, "2", "21", "99", "1");
        strings.sort((s1, s2) -> (s1 == null ? "" : s1).compareTo(s2 == null ? "" : s2));
        System.out.println(strings);

    }
}
