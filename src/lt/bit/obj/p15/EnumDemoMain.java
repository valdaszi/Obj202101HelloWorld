package lt.bit.obj.p15;

import java.util.Arrays;

public class EnumDemoMain {

    public static void main(String[] args) {

        // Color c = new Color("black");

//        Color.Red.setRgb(new int[] { 255, 0, 0 });
//        Color.Yellow.setRgb(new int[] { 255, 255, 0 });
//        Color.Green.setRgb(new int[] { 0, 255, 0 });

        Sviesoforas sviesoforas = new Sviesoforas();
        System.out.println(sviesoforas);

        sviesoforas.setActive(true);
        sviesoforas.setColor(Color.Red);
        System.out.println(sviesoforas);

        sviesoforas.setColor(Color.Yellow);
        System.out.println(sviesoforas);

        sviesoforas.setColor(Color.Green);
        System.out.println(sviesoforas);

        System.out.println(Arrays.toString(sviesoforas.getColor().getRgb()));

        // BigDecimal income = Basic.income()
        // BigDecimal income = basic.income()

        // sviesoforas.setColor(null);
        if (sviesoforas.getColor() == Color.Green) {
            System.out.println("Go-go");
        } else {
            System.out.println("Stop");
        }
    }
}
