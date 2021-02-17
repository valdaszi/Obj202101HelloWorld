package lt.bit.obj.p21;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class LocaleDemo {

    public static void main(String[] args) {

        Locale locale = Locale.getDefault();

        System.out.println(locale);

        double d = 12345.67;

        System.out.println(d);

        defaultLocale();

        //

        Locale localeUK = new Locale("en", "GB");
        NumberFormat numberFormatUK = NumberFormat.getCurrencyInstance(localeUK);
        System.out.println("UK: " + numberFormatUK.format(d));

        DateFormat dateFormatUK = DateFormat.getDateInstance(DateFormat.LONG, localeUK);
        System.out.println("UK: " + dateFormatUK.format(new Date()));

        //

        Locale.setDefault(Locale.US);
        defaultLocale();

        Locale.setDefault(Locale.CHINA);
        defaultLocale();
    }

    static void defaultLocale() {
        double d = 12345.67;

        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        System.out.println(Locale.getDefault() + ": " + numberFormat.format(d));

        DateFormat dateFormat = DateFormat.getDateInstance();
        System.out.println(Locale.getDefault() + ": " + dateFormat.format(new Date()));
    }
}
