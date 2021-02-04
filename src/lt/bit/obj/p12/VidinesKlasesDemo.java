package lt.bit.obj.p12;

import java.util.*;

public class VidinesKlasesDemo {

    public static void main(String[] args) {
        new VidinesKlasesDemo().start();

        List<ManoVidineStaticKlase> listas = new ArrayList<>();
        listas.add(new ManoVidineStaticKlase("Jonas", 100));

//        List<ManoVidineKlase> listas2 = new ArrayList<>();
//        listas2.add(new ManoVidineKlase("Jonas", 100));

        // VidinesKlasesDemo.start();
    }

    void start() {
        List<ManoVidineStaticKlase> listas2 = new ArrayList<>();
        listas2.add(new ManoVidineStaticKlase("Jonas", 100));

        List<ManoVidineKlase> listas = new ArrayList<>();
        listas.add(new ManoVidineKlase("Jonas", 100));

        {
            class A { int x; }
            Set<A> setas = new HashSet<>();
            A a  = new A();
        }
        // A a;
    }

    class ManoVidineKlase {
        private String name;
        private int count;

        public ManoVidineKlase(String name, int count) {
            this.name = name;
            this.count = count;
        }
    }

    static class ManoVidineStaticKlase {
        private String name;
        private int count;

        public ManoVidineStaticKlase(String name, int count) {
            this.name = name;
            this.count = count;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }
    }
}

class Vidine2 {

    void m1() {
        VidinesKlasesDemo.ManoVidineStaticKlase obj = new VidinesKlasesDemo.ManoVidineStaticKlase("A", 123);

        VidinesKlasesDemo demo = new VidinesKlasesDemo();
        demo.start();

        VidinesKlasesDemo.ManoVidineKlase obj1 = demo.new ManoVidineKlase("B", 9);
    }

    void m2() {
        Map<String, Integer> mapas = new HashMap<>();
        mapas.put("Vilnius", 10);
        mapas.put("Alytus", 20);
        mapas.put("Zarasai", 50);

        for (String key : mapas.keySet()) {
            System.out.println(key + ": " + mapas.get(key));
        }

        for (Map.Entry<String, Integer> entry : mapas.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
