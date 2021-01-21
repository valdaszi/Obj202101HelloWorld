package lt.bit.obj.p04;

public class P04U1 {

    public static void main(String[] args) {

        int[] a = {5, 6, 10, 0xF, 010, 4};    // 0xF (16) = 15, 010 (8) = 8
        long[] b = {8L, 5, 0b11};    // 0b11 (2) = 3

//        System.out.println("4 / 2 = " + 4 / 2);
//        System.out.println("5 / 2 = " + 5 / 2);

        int suma1 = 0;
        for (int e : a) { // for (e of a) { ...
            suma1 += e;
        }
        double vidurkis1 = (double) suma1 / a.length;
        System.out.println("a[] vidurkis = " + vidurkis1);


        int suma2 = 0;
        for (long e : b) { // for (e of b) { ...
            suma2 += e;
        }
        float vidurkis2 = 1.0f * suma2 / b.length;
        System.out.println("b[] vidurkis = " + vidurkis2);

        System.out.println(vidurkis1 - vidurkis2);

        // byte -> short -> int -> long -----> float -> double
    }
}
