package Model;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;
import java.net.URISyntaxException;

/**
 * Создал Alexey. Дата: 30.01.2016 17:47.
 */
public class Main {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException, URISyntaxException {
        RadioStationList rslist = new RadioStationList()
                .addRadioStation(new RadioStation(1, "Radio1", "http://54.155.51.103/live_6886540"))
                .addRadioStation(new RadioStation(2, "Radio2", "http://54.155.51.103/live_6886540"))
                .addRadioStation(new RadioStation(3, "Radio3", "http://54.155.51.103/live_6886540"));

        Application app = new Application(new Player(rslist));
        System.out.println(app);


    }
}
