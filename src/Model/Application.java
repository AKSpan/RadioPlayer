package Model;

import javax.sound.sampled.*;
import java.io.IOException;

/**
 * Создал Alexey. Дата: 30.01.2016 17:47.
 */
public class Application {
    private Player player;
    private int volume = 0;

    public Application(Player player) {
        this.player = player;
    }

    //region Methods
    public void play(RadioStation rs) throws
            IOException, UnsupportedAudioFileException, LineUnavailableException {
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
