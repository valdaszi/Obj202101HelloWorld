package lt.bit.obj.p11;

import java.util.*;

public class Uzdavinys {

    public static void main(String[] args) {
        System.out.println("*** HashMap ***");
        mapTest(new HashMap<>());

        System.out.println("*** TreeMap ***");
        mapTest(new TreeMap<>());

        System.out.println("*** TreeMap / List ***");
        mapTest2(new TreeMap<>());
    }

    static void mapTest(Map<String, Zmogus> zmones) {
        Zmogus z1 = new Zmogus("V1", "P1", "123");
        zmones.put(z1.getAk(), z1);

        zmones.put("333", new Zmogus("V3", "P3", "333"));
        zmones.put("111", new Zmogus("V11", "P11", "111"));
        zmones.put("220", new Zmogus("V20", "P20", "220"));
        zmones.put("228", new Zmogus("V28", "P28", "228"));
        zmones.put("111", new Zmogus("V110", "P110", "111"));

        System.out.println("333: " + zmones.containsKey("333"));
        System.out.println("444: " + zmones.containsKey("444"));

        System.out.println("Raktai:");
        for (String ak : zmones.keySet()) {
            System.out.println(ak);
        }

        System.out.println("Reiksmes:");
        for (Zmogus z : zmones.values()) {
            System.out.println(z.getAk() + " " + z.getVardas() + " " + z.getPavarde());
        }
    }

    static void mapTest2(Map<String, List<Zmogus>> zmones) {
        Zmogus z1 = new Zmogus("V1", "P1", "123");
        addMapTest2(zmones, z1);

        addMapTest2(zmones, new Zmogus("V3", "P3", "333"));
        addMapTest2(zmones, new Zmogus("V11", "P11", "111"));
        addMapTest2(zmones, new Zmogus("V20", "P20", "220"));
        addMapTest2(zmones, new Zmogus("V28", "P28", "228"));
        addMapTest2(zmones, new Zmogus("V110", "P110", "111"));

        System.out.println("Reiksmes:");
        for (List<Zmogus> listas : zmones.values()) {
            System.out.println(listas.size() + ": ");
            for (Zmogus z : listas) {
                System.out.println("   " + z.getAk() + " " + z.getVardas() + " " + z.getPavarde());
            }
        }

    }

    static void addMapTest2(Map<String, List<Zmogus>> zmones, Zmogus z) {
        String ak = z.getAk();

        if (!zmones.containsKey(ak)) {
            List<Zmogus> zmonesSuAK = new ArrayList<>();
            zmonesSuAK.add(z);
            zmones.put(ak, zmonesSuAK);

        } else {
            List<Zmogus> zmonesSuAK = zmones.get(ak);
            zmonesSuAK.add(z);
        }
    }
}


class Zmogus {

    private String vardas;
    private String pavarde;
    private String ak;

    public Zmogus(String vardas, String pavarde, String ak) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.ak = ak;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public String getAk() {
        return ak;
    }

    public void setAk(String ak) {
        this.ak = ak;
    }
}