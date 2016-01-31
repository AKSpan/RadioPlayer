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

        Application app =  new Application();
        System.out.println(app);



    }
}
