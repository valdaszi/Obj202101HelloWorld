package lt.bit.obj.p20;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TelefonuSkaneris {

    public static void main(String[] args) {

        Set<String> hrefs = UrlParser.parse("https://www.imones.lt");
        // hrefs.forEach(href -> System.out.println(href));
        System.out.println("Viso linku: " + hrefs.size());

        Set<String> childHrefs = new TreeSet<>();

        int i = 1;
        for (String href : hrefs) {
            System.out.println("Tikriname: " + i++ + " " + href);
            childHrefs.addAll(UrlParser.parse(href));
        }

        childHrefs.forEach(href -> System.out.println(href));
    }
}
