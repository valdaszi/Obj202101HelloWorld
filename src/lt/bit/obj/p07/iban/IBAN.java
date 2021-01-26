package lt.bit.obj.p07.iban;

import java.math.BigInteger;

public class IBAN {

    public boolean checkIBAN(String iban) {
        iban = removeSpaces(iban);
        // System.out.println(iban);

        // 1. Check that the total IBAN length is correct as per the country.
        // If not, the IBAN is invalid
        //TODO

        // 2. Move the four initial characters to the end of the string
        // System.out.println(iban.substring(0, 4));
        // System.out.println(iban.substring(4));
        iban = swap(iban);
        // System.out.println(iban);

        // 3. Replace each letter in the string with two digits, thereby expanding the string,
        // where A = 10, B = 11, ..., Z = 35
        // System.out.println((int)'A'); // 65 ? 10 -> 'A' - 55
        // System.out.println((int)'B'); // 66 ? 11 -> 'B' - 55
        // System.out.println((char)67);
        // x - 55 |  x - 'A' + 10
        iban = decode(iban);
        // System.out.println(iban);

        // 4. Interpret the string as a decimal integer and
        // compute the remainder of that number on division by 97

//        long ibanNumber = Long.parseLong(iban);
//        long remainder = ibanNumber % 97;
        BigInteger ibanNumber = new BigInteger(iban);
        BigInteger remainder = ibanNumber.remainder(BigInteger.valueOf(97));

        return remainder.equals(BigInteger.ONE);
    }

    private String decode(String iban) {
        String res = "";
        for (int i = 0; i < iban.length(); i++) {
            if (Character.isAlphabetic(iban.charAt(i))) {
                res += iban.charAt(i) - 'A' + 10; // - 55
            } else {
                res += iban.charAt(i);
            }
        }
        return res;
    }

    private String removeSpaces(String iban) {
//        String res = "";
//        for (int i = 0; i < iban.length(); i++) {
//            if (iban.charAt(i) != ' ') res += iban.charAt(i);
//        }
//        return res;

        return iban.replace(" ", "");
    }

    private String swap(String iban) {
        return iban.substring(4) + iban.substring(0, 4);
    }
}
