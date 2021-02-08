package lt.bit.obj.p14;

import java.util.ArrayList;
import java.util.List;

final public class FinalDemo {

    public final static int F1 = 1001;
    public final static int F2;

    static {
        //TODO ...
        F2 = 2222;
    }

    private final int x = 100;
    private final List<String> cities = new ArrayList<>();
    private final int y;
    private final String s;
    private double d;

    FinalDemo() {
        y = 999;
    }

    FinalDemo(int a) {
        y = 222;
    }

    {
        s = "Abc";
//        y = 333;
        d = 1.23;
    }
    {
        d += 4.567;
    }

    final void m1(final int k) {
        // this.x = 2;
        // this.cities = new ArrayList<>();
        this.cities.add("Aaaaa");
        this.cities.add("Baaaa");
        this.cities.add("A2");

        final double d;
        if (this.cities.size() == 0) {
            d = 1.234;
        } else {
            d = 9.87;
        }
        // ...
        // d = 2.23;

        // k = 1234;

        int count = 0;
//        cities.forEach(city -> {
//            if (city.charAt(0) == 'A') count++;
//        });
        for (String city : cities) {
            if (city.charAt(0) == 'A') count++;
        }

        final List<String> citiesA = new ArrayList<>();
        cities.forEach(city -> {
            if (city.charAt(0) == 'A') citiesA.add(city);
        });

//        citiesA = new ArrayList<>();

    }


}

//class FD2 extends FinalDemo {
////    void m1(final int k) {
////        //TODO
////    }
//}

class A1 {
    int a1() {
        return 1;
    }
}

class A2 extends A1 {
    final int a1() {
        return 2;
    }
}

class A3 extends A2 {
//    int a1() {
//        return 3;
//    }
}