package lt.bit.obj.p05;

import lt.bit.obj.p05.intro.Mokinys;

public class U1 {

    public static void main(String[] args) {

        System.out.println( U1.class.getName() );

        Mokinys[] mokiniai = readFromDB();

        System.out.println("Pradiniai duomenys:");

//        for (Mokinys m : mokiniai) {
//            System.out.println(m.name + " " + m.level + " " + m.address);
//        }
        print(mokiniai);

        // sulygiuoti pagal klase
        for (int i = 0; i < mokiniai.length - 1; i++) {

            for (int j = i + 1; j < mokiniai.length; j++) {

//                if (mokiniai[i].level > mokiniai[j].level) {
//                    // i <-> j
//                    Mokinys tmp = mokiniai[i];
//                    mokiniai[i] = mokiniai[j];
//                    mokiniai[j] = tmp;
//                }
                if (compare(mokiniai[i], mokiniai[j]) > 0) {
                    // i <-> j
                    Mokinys tmp = mokiniai[i];
                    mokiniai[i] = mokiniai[j];
                    mokiniai[j] = tmp;
                }
            }

        }

        System.out.println("Sulygiuota:");

//        for (Mokinys m : mokiniai) {
//            System.out.println(m.name + " " + m.level + " " + m.address);
//        }
        print(mokiniai);

    }

    static void print(Mokinys[] mokiniai) {
        for (Mokinys m : mokiniai) {
            System.out.println(m.getName() + " " + m.getLevel() + " " + m.getAddress());
        }
    }

    static int compare(Mokinys m1, Mokinys m2) {
        if (m1.getLevel() < m2.getLevel()) return -1;
        if (m1.getLevel() > m2.getLevel()) return 1;
        // m1.level == m2.level
        return m1.getName().compareTo(m2.getName());
    }

    static Mokinys[] readFromDB() {
        // p05.intro.Mokinys[] mokiniai = new p05.intro.Mokinys[5];
        Mokinys[] mokiniai = new Mokinys[] {
//                new Mokinys(),
                new Mokinys("Jurgis", "Jurgaitis", 3),
                new Mokinys("Ona", "Onaite"),
                // new Mokinys("J", 1),
                new Mokinys("Antanas", "Antanaitis"),
                new Mokinys("Maryte", "Kazyte", 2)
        };

        //
//        mokiniai[0].setName(null); // "Zose";
//        mokiniai[0].setLevel(0);

        return mokiniai;
    }
}
