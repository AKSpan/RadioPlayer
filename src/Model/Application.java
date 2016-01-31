package Model;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Создал Alexey. Дата: 30.01.2016 17:47.
 */
public class Application {
    private final static String NAME_SPLITTER = "_name_:";
    private final static String URL_SPLITTER = "_url_:";
    private Player player;
    private int volume = 0;

    public Application() {
        List<String> lines = new ArrayList<>();
        //region Open and read file block
        File rsFile = new File(ClassLoader.getSystemResource("resources/rs").getPath());
        if (!rsFile.exists())
            try {
                rsFile.createNewFile();
            } catch (IOException e) {
                System.err.println("Cannot CREATE radio stations list!\n" + e.getMessage());
            }
        try {
            lines = Files.readAllLines(Paths.get(rsFile.getAbsolutePath()), Charset.forName("UTF-8"));
        } catch (IOException e) {
            System.err.println("Cannot READ radio stations list!\n" + e.getMessage());
        }
        //endregion

        //region Create RadioStationList based on data in file
        RadioStationList rslist = new RadioStationList();
        for (String line : lines) {
            String name, url;
            int nameIndex, urlIndex;
            nameIndex = line.indexOf(NAME_SPLITTER);
            urlIndex = line.indexOf(URL_SPLITTER);
            name = line.substring(nameIndex + NAME_SPLITTER.length(), urlIndex);
            url = line.substring(urlIndex + URL_SPLITTER.length());
            rslist.addRadioStation(new RadioStation(name, url));
        }
        //endregion
        Player player = new Player(rslist);
        this.player = player;
    }

    //region Methods

    public void play(RadioStation rs) throws IOException, UnsupportedAudioFileException, LineUnavailableException {
    }

    public void stop() {

    }

    public void volume(int v) {
        this.volume = v;
    }
    //endregion


    @Override
    public String toString() {

        return "Application[" +
                "player=" + player + ']';
    }
}
