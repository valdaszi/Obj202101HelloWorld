package lt.bit.obj.p16;

import java.util.Arrays;
import java.util.List;

public class ExceptionsDemo {

    public static void main(String[] args) throws InterruptedException {

//        Service service = new Service();

        try {
            int x = Service.calculation(12, 13);
            System.out.println(x);

            System.out.println(Service.getIntValue(0));
            System.out.println(Service.getIntValue(2));
            System.out.println(Service.getIntValue(3));
            System.out.println(Service.getIntValue(4));

            x = Service.calculation(12, 5);
            System.out.println(x);

            x = Service.calculation(12, -5);
            System.out.println(x);

            int y = Service.calculation(13, 0);
            System.out.println(y);

        } catch (ArithmeticException | IllegalArgumentException e) {
            e.printStackTrace();
            System.err.println("Klaida: " + e.getMessage());

        } catch (DalybosRezultatasNulisException e) {
            System.err.println(e.getMessage() + " (" + e.getX() + "," + e.getY() + ")");

//        } catch (Exception e) {
//            e.printStackTrace();
//            System.err.println("Kazkokia klaida: " + e.getMessage());

        } finally {
            System.out.println("Lyg ir pabaiga.");
        }

        System.out.println("The End.");
    }
}


class Service {

    static private List<Integer> listas = Arrays.asList(100, 200, 300, null);

    static public int calculation(int a, int b) throws DalybosRezultatasNulisException, IllegalArgumentException, InterruptedException {
        if (b < 0) {
            throw new IllegalArgumentException(b + " < 0");
        }

        System.out.print("Pradedam skaiciavimus...");
        Thread.sleep(3000);
        System.out.println("...baigiam");

        int c = a / b;
        if (c == 0) {
            throw new DalybosRezultatasNulisException(a, b, "Neteisingas gaunasi rezultatas");
        }
        return c;
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

class DalybosRezultatasNulisException extends Exception {
    private int x;
    private int y;

    public DalybosRezultatasNulisException(String msg) {
        super(msg);
    }

    public DalybosRezultatasNulisException(int x, int y, String msg) {
        this(msg);
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}