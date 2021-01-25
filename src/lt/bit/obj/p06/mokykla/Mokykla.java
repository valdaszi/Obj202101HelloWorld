package lt.bit.obj.p06.mokykla;

/*
        Mokytojas
            Vardas
            Pavarde
            Asmens kodas
            Adresas
            Telefonas
            Email

            Destomas dalykas
            Kabineto numeris
            Mokytojo tvarkarastis

        Mokinys
            Vardas
            Pavarde
            Asmens kodas
            Adresas
            Telefonas
            Email

            Klase
            Mokinio tvarkarastis
 */

public class Mokykla {

    public static void main(String[] args) {
        Mokytojas m1 = new Mokytojas();
        m1.setVardas("Jonas");
        m1.setPavarde("Jonaitis");
        m1.setAk("2345678901");
        m1.setDalykas("Fizika");

        Mokinys o1 = new Mokinys();
        o1.setVardas("Ona");
        o1.setPavarde("Onyte");
        o1.setAk("345678987643");
        o1.setKlase(3);

    }
}

