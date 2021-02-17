package lt.bit.obj.p20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UrlParser {

    static public Set<String> parse(String address) {

        String content = readFrom(address);
        // if (content == null) return new ArrayList<>();

        Set<String> result = new TreeSet<>();

        String regexp = "href=\"(https://www.imones.lt/[^\"']*)";

        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(content);

        while(matcher.find()) {
            String m = normalize(matcher.group(1));
            if (!address.equalsIgnoreCase(m)) {
                result.add(m);
            }
        }

        return result;
    }

    static private String normalize(String url) {
        if (url.length() > 0 && url.charAt(url.length() - 1) == '/') {
            return url.substring(0, url.length() - 1);
        }
        return url;
    }

    static private String readFrom(String address) {
        URL url = null;
        try {
            url = new URL(address);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return "";
        }


        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(url.openStream(), "UTF-8")
        )) {

            StringBuilder result = new StringBuilder("");
            String line;
            while ((line = reader.readLine()) != null) {
                // result += line + '\n';
                result.append(line);
                result.append('\n');
            }

            return result.toString();

        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
