package lt.bit.obj.p05.intro;

import java.time.LocalDate;

public class P05ZmogusIntro {

    public static void main(String[] args) {

        // Zmogus:
        //      int id
        //      String firstName;
        //      String lastName;
        //      LocalDate birthday;

        int[] id = { 1, 2, 3 };
        String[] firstName = { "Jonas", "Ona", "Antanas "};
        String[] lastName = { "Jonaitis", "One", "Kazys "};
        LocalDate[] birthday = { null, null, null };

        Zmogus[] zmones = { null, null, null };
        System.out.println(zmones.length);

        Zmogus z1 = new Zmogus();
        z1.id = 1;
        z1.firstName = "Jonas";
        z1.lastName = "Jonaitis";
        z1.birthday = LocalDate.of(2000, 1, 31);
        zmones[0] = z1;

        Zmogus z2 = new Zmogus();
        z2.id = 2;
        z2.firstName = "Ona";
//        z2.lastName = "One";
        zmones[1] = z2;

        Zmogus z3 = z1;
        z3.firstName = "Petras";

        for (Zmogus z : zmones) {
            if (z != null) {
                System.out.println(z.firstName + " " + z.lastName);
            } else {
                System.out.println("Neturime info apie zmogu");
            }
        }
    }

}

class Zmogus {
    int id;
    String firstName;
    String lastName;
    LocalDate birthday;
}
