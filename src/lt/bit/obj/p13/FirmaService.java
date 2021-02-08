package lt.bit.obj.p13;

import java.io.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FirmaService implements IFirmaService {

    @Override
    public List<Firma> read(String filename) {
        try {
            // 1. Atidaryti faila (input stream reader) skaitymui
            InputStream inputStream = new FileInputStream(filename);
            System.out.println("Failas atidarytas");

            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

            // BufferedReader reader = new BufferedReader(new FileReader(filename));

            List<Firma> firmos = new ArrayList<>();

            // 2. skaitome po viena eilute
            String line;
            while ((line = reader.readLine()) != null) {
                Firma firma = parse(line);
                firmos.add(firma);
            }

            return firmos;


        } catch (FileNotFoundException e) {
            System.err.println("Failas " + filename + " nerastas");
        } catch (IOException e) {
            System.err.println("Failo " + filename + " skaitymo klaida");
        }
        return new ArrayList<>();
    }

    /*
        1,2020-01-01,UAB Pirmas žingsnis,123,456.89
     */
    private Firma parse(String line) {
        String[] fields = line.split(",");
        if (fields.length != 5) return null;

        try {
            Firma firma = new Firma();
            firma.setId(Integer.parseInt(fields[0]));
            firma.setDate(LocalDate.parse(fields[1]));
            firma.setName(parseString(fields[2]));
            firma.setQty(Integer.parseInt(fields[3]));
            firma.setPrice(new BigDecimal(fields[4]));

            return firma;

        } catch (Exception e) {
            System.err.println("Neteisingi duomenys: " + line);
        }

        return null;
    }

    private String parseString(String s) {
        if (s == null || s.length() == 0) return s;
        if (s.charAt(0) != '"') return s;

        // tekstine eilute su kabutemis
        // 1. istraukiame teksta is kabuciu
        s = s.substring(1, s.length() - 1);

        // 2. Pakeiciam dvigubas dvi kabutes i viena
        s = s.replaceAll("\"\"", "\"");

        return s;
    }
}
