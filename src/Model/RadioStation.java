package Model;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Создал Alexey. Дата: 30.01.2016 17:48.
 */
public class RadioStation {
    private static int idCouter ;
    private int id;
    private String name;
    private URL url;

    public RadioStation(String name, String url) {
        this.id = ++idCouter;
        this.name = name;
        try {
            this.url = new URL(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(String url) {
        try {
            this.url = new URL(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "RadioStation[" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ']';
    }
}
