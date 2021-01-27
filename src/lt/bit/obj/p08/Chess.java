package lt.bit.obj.p08;

import java.math.BigInteger;

public class Chess {

    public static void main(String[] args) {

        int s = 1;
        long l = 1;
        double d = 1;
        BigInteger big = BigInteger.ONE;
        for (int i = 1; i <= 64; i++) {
            System.out.println(i + " = " + s + ", " + l + ", " + d + ", " + big); //  + " " + (int) Math.pow(2, (i - 1)));
            s *= 2; // s = s * 2
            l *= 2;
            d *= 2;
            big = big.multiply(BigInteger.TWO);
        }

        // 000..00001 = 1
        // 000..00010 = 2
        // 000..00011 = 3
        // 000..00100 = 4
        // ...
        // 000..01000 = 8
        // ...
        // 000..10000 = 16
        //
        // 010..00000 = 1073741824 (2^30)
        // 100..00000 = -2147483648
        // 000..00000 = 0

    }
}
