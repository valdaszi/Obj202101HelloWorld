package lt.bit.obj.p11;

import java.util.*;

public class SetaiDemo {

    public static void main(String[] args) {
        System.out.print("TreeSet: ");
        container(new TreeSet<>());

        System.out.print("HashSet: ");
        container(new HashSet<>());

        System.out.print("LinkedList: ");
        container(new LinkedList<>());

        System.out.print("ArrayList: ");
        List<String> miestai = new ArrayList<>();
        container(miestai);

        Collections.sort(miestai);
        System.out.println(miestai.size() + " " + miestai);


        // Integer, Double, Boolean ....

        List<Integer> skaiciukai = new ArrayList<>();
        skaiciukai.add(new Integer(100));
        skaiciukai.add(Integer.valueOf(200));
        skaiciukai.add(300);
        System.out.println(skaiciukai);

        Integer i2 = 2;
        // int i3 = i2;
        int x = skaiciukai.get(0) * i2++ + skaiciukai.get(1); // i2 = i2.intValue() + 1
        System.out.println(x);
        System.out.println("i2=" + i2);

        Boolean b = null;
        if (b == null) {
            System.out.println("???");
        } else if (b) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        // Set'ai su mano klase Adresas
        Set<Adresas> adresas1 = new HashSet<>();
        adresas1.add(new Adresas("Babtai", "Lapu aleja 12"));
        adresas1.add(new Adresas("Vilnius", "Gedimino 1"));
        adresas1.add(new Adresas("Babtai", "Lapu aleja 12"));

        Adresas babtai = new Adresas("Babtai", "Lapu aleja 12");
        adresas1.add(babtai);
        adresas1.add(babtai);

        System.out.println("adresas1=" + adresas1.size() + " " + adresas1);

        Adresas a1 = new Adresas("Babtai", "Lapu aleja 12");
        Adresas a2 = new Adresas("Babtai", "Lapu aleja 12");
        System.out.println("a1 == a2 ? " + (a1 == a2));
        System.out.println("a1.equals(a2) ? " + a1.equals(a2));

    }


    static void container(Collection<String> miestai) {

        miestai.add("Babtai");
        miestai.add("Vilnius");
        miestai.add("Babtai");
        miestai.add("Kaunas");

        System.out.println(miestai.size() + " " + miestai);

    }


}

class Adresas extends Object {
    private String miestas;
    private String gatve;

    public Adresas(String miestas, String gatve) {
        this.miestas = miestas;
        this.gatve = gatve;
    }

    public String getMiestas() {
        return miestas;
    }

    public void setMiestas(String miestas) {
        this.miestas = miestas;
    }

    public String getGatve() {
        return gatve;
    }

    public void setGatve(String gatve) {
        this.gatve = gatve;
    }

    @Override
    public String toString() {
        return miestas + ' ' + gatve;
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(miestas, gatve);
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) return true;
//        if (!(obj instanceof Adresas)) return false;
//        Adresas o = (Adresas) obj;
//        return this.miestas.equals(o.miestas) &&
//                this.gatve.equals(o.gatve);
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adresas adresas = (Adresas) o;
        return Objects.equals(miestas, adresas.miestas) && Objects.equals(gatve, adresas.gatve);
    }

    @Override
    public int hashCode() {
        return Objects.hash(miestas, gatve);
    }
}
