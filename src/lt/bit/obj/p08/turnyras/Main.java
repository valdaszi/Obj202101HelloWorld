package lt.bit.obj.p08.turnyras;

/*
    Turnyras:
        Zaidejas:
            Zmones
            Pora:
                1) Zmogus + Zmogus
                2) Poros laimetojas + Zmogus
                3) Poros laimetojas + Poros laimetojas

 */


public class Main {

    public static void main(String[] args) {
//        Zmogus z1 = new Zmogus("Jonas");
//        Zmogus z2 = new Zmogus("Ona");
//        Pora p1 = new Pora(z1, z2);
//        Pora p2 = new Pora(p1, new Zmogus("Kazys"));
//        Pora p3 = new Pora(p1, p2);
//
//        System.out.println(z1.getNumber() + ". " + z1.vardasPoroje());
//        System.out.println(z2.getNumber() + ". " + z2.vardasPoroje());
//        System.out.println(p1.getNumber() + ". " + p1.vardasPoroje());
//        System.out.println(p2.getNumber() + ". " + p2.vardasPoroje());
//        System.out.println(p3.getNumber() + ". " + p3.vardasPoroje());
//
//        Zaidejas a1 = z1; //
//        Zaidejas a2 = p1;

        Zaidejas[] zaidejai = pradiniaiDuomenys();
        int etapas = 1;

        do {
            zaidejai = etapas(zaidejai);
            printEtapas(etapas, zaidejai);
            etapas++;
        } while (zaidejai.length > 1);

        // Zaidejas zzz = new Zaidejas();
        Object o = "Kuku";
        System.out.println(o.getClass().getName());

        o = 123;
        System.out.println(o.getClass().getName());

        o = true;
        System.out.println(o.getClass().getName());

        o = zaidejai;
        System.out.println(o.getClass().getName());

    }

    static Zaidejas[] pradiniaiDuomenys() {
        Zaidejas[] zaidejai = new Zaidejas[] {
                new Zmogus("A1"),
                new Zmogus("A2"),
                new Zmogus("A3"),
                new Zmogus("A4"),
                new Zmogus("A5"),
                new Zmogus("A6"),
                new Zmogus("A7"),
                new Zmogus("A8")
        };
        System.out.println("Zaidejai: ");
        for (Zaidejas z : zaidejai) {
            System.out.println("  " + z.getNumber() + ". " + z.laimetojas());
        }
        return zaidejai;
    }

    static Zaidejas[] etapas(Zaidejas[] zaidejai) {
        Zaidejas[] naujas = new Zaidejas[zaidejai.length / 2];

        for (int i = 0; i < naujas.length; i++) {
            int x = 2 * i;
            naujas[i] = new Pora(zaidejai[x], zaidejai[x + 1]);
        }

        return naujas;
    }

    static void printEtapas(int nr, Zaidejas[] zaidejai) {
        System.out.println("Ratas " + nr);
        for (Zaidejas z : zaidejai) {
            System.out.println("  " + z.getNumber() + ". " + z.vardasPoroje());
        }
    }
}
