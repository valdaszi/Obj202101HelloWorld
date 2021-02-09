package lt.bit.obj.p16;

import java.util.Arrays;
import java.util.List;

public class ExceptionsDemo {

    public static void main(String[] args) {

//        Service service = new Service();

        try {
            System.out.println(Service.getIntValue(0));
            System.out.println(Service.getIntValue(2));
            System.out.println(Service.getIntValue(3));
            System.out.println(Service.getIntValue(4));

            int x = Service.calculation(12, 5);
            System.out.println(x);

            x = Service.calculation(12, -5);
            System.out.println(x);

            int y = Service.calculation(13, 0);
            System.out.println(y);


        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.err.println("Kazkokia aritmetine klaida: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.err.println("Neteisingi duomenys: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Kazkokia klaida: " + e.getMessage());
        }

        System.out.println("The End.");
    }
}


class Service {

    static private List<Integer> listas = Arrays.asList(100, 200, 300, null);

    static public int calculation(int a, int b) {
        if (b < 0) {
            throw new IllegalArgumentException(b + " < 0");
        }
        return a / b;
    }


    static public int getIntValue(int index) {
        try {
            Integer value = listas.get(index);
            return value;
        } catch (NullPointerException e) {
            System.out.println("Nulis");
            return 0;
        }
    }


}