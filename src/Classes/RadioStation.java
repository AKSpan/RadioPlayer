package Classes;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Создал Alexey. Дата: 30.01.2016 17:48.
 */
class RadioStation {
    private int id;
    private String name;
    private URL url;

    public RadioStation(int id, String name, String url) {
        this.id = id;
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

    public void setId(int id) {
        this.id = id;
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
