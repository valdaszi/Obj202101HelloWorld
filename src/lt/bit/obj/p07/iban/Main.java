package lt.bit.obj.p07.iban;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Argumentu skaicius: " + args.length);
//        if (args.length > 0) {
//            for (String a : args) System.out.println(a);
//        }

        if (args.length == 0) {
            interactiveMode();
        } else if (args.length == 1) {
            fileMode(args[0]);
        } else {
            System.err.println("Invalid arguments count");
        }
        System.out.println("The End.");
    }

    private static void interactiveMode() {
        Scanner scanner = new Scanner(System.in);
        IBAN iban = new IBAN();

        while (true) {
            System.out.print("Enter IBAN: ");

            String account = scanner.nextLine();
            if (account.length() == 0) break;

            // boolean isValid = checkIBAN(account);
            boolean isValid = iban.checkIBAN(account);

            System.out.println("IBAN: " + account + " " + isValid);
        }
    }

    private static void fileMode(String filename) {
        IBAN iban = new IBAN();

        try {
            // 1. atidaryti ivedimo faila skaitymui
            BufferedReader reader = new BufferedReader(new FileReader(filename));

            // 2. atidaryti isvedimo faila rasymui
            int dot = filename.lastIndexOf('.');
            String name = dot == -1 ? filename : filename.substring(0, dot);
            String filenameOut = name + ".out";
            BufferedWriter writer = new BufferedWriter(new FileWriter(filenameOut));

            // 3. kol ne ivedimo failo pabaiga - skaityti viena eilute is failo
            String line;
            while ((line = reader.readLine()) != null) {
                // patikrinti koks iban
                boolean isValid = iban.checkIBAN(line);
                // irasyti resultata i isevdimo faila
                writer.write(line + ';' + isValid + '\n');
            }

            reader.close();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
