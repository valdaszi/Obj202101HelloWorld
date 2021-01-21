package lt.bit.obj.intro;

import java.util.Random;

public class Switch {

    public static void main(String[] args) {

        int x = 3; //  (int) Math.round(Math.random() * 10); // 0..10

        switch (x) {
            case 0:
                System.out.println("Nulis");
                break;

            default:
                System.out.println("?");

            case 1: // !!!
                System.out.println("Vienetukas");

            case 2:
            case 3:
                System.out.println("Du");
        }

        System.out.println("Pabaiga");
    }
}
