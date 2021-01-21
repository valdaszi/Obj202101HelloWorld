package lt.bit.obj.intro;

public class Trikampiai {

    public static void main(String[] args) {

        System.out.println("Trikampiai");

        int[][] trikampiai = {{3, 4, 5}, {2, 10, 8}, {5, 6, 5}, {5, 5, 5}};

        System.out.println(trikampiai.length);
        for (int i = 0; i < trikampiai.length; i++) {

            int[] a = trikampiai[i];
            System.out.print("Triangle: " + a[0] + ", " + a[1] + ", " + a[2]);

            // tikriname ar galima padaryti trikampi
            if (a[0] < a[1] + a[2] && a[1] < a[0] + a[2] && a[2] < a[0] + a[1]) {
                System.out.print(" galimas");

                if (a[0] == a[1] && a[1] == a[2]) {
                    System.out.print(" lygiakrastis");
                } else if (a[0] == a[1] || a[1] == a[2] || a[0] == a[2]) {
                    System.out.print(" lygiasonis");
                } else {
                    System.out.print(" ivairiakrastis");
                }

                // paskaiciuojame plota
                double p = (a[0] + a[1] + a[2]) / 2.0;
                System.out.print(", pusperimetris = " + p);
                double s = Math.sqrt(p * (p - a[0]) * (p - a[1]) * (p - a[2]));
                s = Math.round(s * 1000.0) / 1000.0;
                System.out.println(", plotas = " + s);

            } else {
                System.out.println(" negalimas");
            }

        }

    }

}
