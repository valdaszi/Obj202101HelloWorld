package lt.bit.obj.p12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AnoniminePraktika1 {

    public static void main(String[] args) {

        List<A> adresai = new ArrayList<>();
        adresai.add(new A("Alytus", "A"));
        adresai.add(new A("Kaunas", "Z"));
        adresai.add(new A("Alytus", "B"));
        adresai.add(new A("Vilnius", "A"));

        // Collections.sort(adresai);

        // sulygiuoti pagal miesta ir gatve

        class Cmp1 implements Comparator<A> {

            @Override
            public int compare(A o1, A o2) {
                int c = o1.getMiestas().compareTo(o2.getMiestas());
                if (c != 0) return c;
                return o1.getGatve().compareTo(o2.getGatve());
            }
        }

        adresai.sort(new Cmp1());
        System.out.println(adresai);

        // sulygiuoti pagal gatve ir miesta

//        class Cmp2 implements Comparator<A> {
//
//            @Override
//            public int compare(A o1, A o2) {
//                int c = o1.getGatve().compareTo(o2.getGatve());
//                if (c != 0) return c;
//                return o1.getMiestas().compareTo(o2.getMiestas());
//            }
//        }
//
//        adresai.sort(new Cmp2());
        adresai.sort(new Comparator<A>() {

            @Override
            public int compare(A o1, A o2) {
                int c = o1.getGatve().compareTo(o2.getGatve());
                if (c != 0) return c;
                return o1.getMiestas().compareTo(o2.getMiestas());
            }
        });
        System.out.println(adresai);

        // sulygiuoti pagal miesta ir gatve atvirkstine tvarka

        adresai.sort((o1, o2) ->
                    -o1.getMiestas().compareTo(o2.getMiestas()) != 0 ?
                            -o1.getMiestas().compareTo(o2.getMiestas()) :
                            -o1.getGatve().compareTo(o2.getGatve())
        );
        System.out.println(adresai);
    }
}


class A {
    private String miestas;
    private String gatve;

    public A(String miestas, String gatve) {
        this.miestas = miestas;
        this.gatve = gatve;
    }

    public String getMiestas() {
        return miestas;
    }

    public String getGatve() {
        return gatve;
    }

    @Override
    public String toString() {
        return miestas + " " + gatve;
    }
}