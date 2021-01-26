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
            Reader reader = new FileReader(filename);

            String filenameOut = filename + ".out";
            Writer writer = new FileWriter(filenameOut);

            int c;
            StringBuilder sb = new StringBuilder();
            while ((c = reader.read()) != -1) {
                if (c == '\n') {
                    // System.out.println("Eilutes pabaiga");
                    boolean isValid = iban.checkIBAN(sb.toString());
                    // writer.write(sb.toString() + ';' + isValid + '\n');
                    sb.append(';');
                    sb.append(isValid);
                    sb.append('\n');
                    writer.write(sb.toString());

                    sb = new StringBuilder();
                } else {
                    sb.append((char)c);
                }
            }

            reader.close();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        // 1. atidaryti ivedimo faila skaitymui
        // 2. atidaryti isvedimo faila rasymui
        // 3. kol ne ivedimo failo pabaiga
        //      3.1. skaityti viena eilute is failo
        //      3.2. patikrinti koks iban
        //      3.3. irasyti resultata i isevdimo faila
        // Pabaiga
    }

}
