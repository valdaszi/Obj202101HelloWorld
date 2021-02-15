package lt.bit.obj.p19;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.List;

public class ThreadAndURLDemo {

    private static final String API_KEY = "De8M_Q2UjEQvrMU88Y0u16pQpbwZIje_zgdEvOd_UOs";


    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        Thread t1 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
            response("petrol station");
        });

        Thread t2 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
            response("library");
        });

        Thread t3 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
            response("restaurant");
        });

        Thread t4 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
            response("market");
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        System.out.println(Thread.currentThread().getName());

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long time = System.currentTimeMillis() - start;
        System.out.println("Time: " + time + "ms");

        System.out.println("The End.");
    }

    static void response(String search) {
        try {
            URL url = new URL("https://discover.search.hereapi.com/v1/discover" +
                    "?at=54.89725475889574,23.914784792655215" +
                    "&q=" + URLEncoder.encode(search, "UTF-8") +
                    "&lang=en-US" +
                    "&apiKey=" + API_KEY);

            ObjectMapper mapper = new ObjectMapper();

            DiscoverResponse response = mapper.readValue(url, DiscoverResponse.class);

            System.out.println("Total items '" + search + "': " + response.getItems().size());

        } catch (IOException e) {
            System.err.println(e.toString());
        }

    }
}

class DiscoverResponse {
    List<DiscoverItem> items;

    public List<DiscoverItem> getItems() {
        return items;
    }

    public void setItems(List<DiscoverItem> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Response{" +
                "items=" + items +
                '}';
    }
}

@JsonIgnoreProperties(ignoreUnknown = true)
class DiscoverItem {
    String title;
    String id;
    String ontologyId;
    String resultType;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOntologyId() {
        return ontologyId;
    }

    public void setOntologyId(String ontologyId) {
        this.ontologyId = ontologyId;
    }

    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }

    @Override
    public String toString() {
        return "Item{" +
                "title='" + title + '\'' +
                ", id='" + id + '\'' +
                ", ontologyId='" + ontologyId + '\'' +
                ", resultType='" + resultType + '\'' +
                '}';
    }
}
