public class HelloWorld {

    public static void main(String[] args) {

        System.out.println("UAB \"Ragai ir Kanopos\""); // UAB "Ragai ir Kanopos"


        int a = 100;
        String rez = "a yra " + (a < 100 ? "mažiau" : "daugiau") + " už šimtą ";
        System.out.println(rez);

        System.out.println(a % 2 == 0 ? "lyginis" : 0);

        int suma = 0;
        for (int i = 1; i <= 100; ++i) {
            suma += i;
        }
        System.out.println("1+2+...100 = " + suma);

        for(;;) {
            double x = Math.random();
            System.out.println(x);

            if (x > 0.9) break;
        }

        String[] s = { "A", "A1", "B", "C", "A3" };
        int sk = 0;
        // for (int i = 0; i < s.length; i++) {
        //    String e = s[i];
        for (String e : s) {
            if (e.charAt(0) == 'A') sk++;
        }
        System.out.println("Viso zodziu prasidedanciu A raide yra " + sk);
    }

}
