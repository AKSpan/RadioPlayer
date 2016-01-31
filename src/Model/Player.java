package Model;

import java.net.URL;

/**
 * Создал Alexey. Дата: 30.01.2016 18:18.
 */
public class Player {
    private RadioStationList radioStationList;

    public Player(RadioStationList radioStationList) {
        this.radioStationList = radioStationList;
    }

    Player(RadioStation radioStation) {
        if(this.radioStationList==null)
            this.radioStationList = new RadioStationList();

        this.radioStationList.addRadioStation(radioStation);
    }

   URL getStationURL(RadioStation rs)
   {
       return this.radioStationList.getRadioStation(rs.getId()).getUrl();
   }

    @Override
    public String toString() {
        return "Player{" +
                "radioStationList=" + radioStationList.toString() +
                '}';
    }
}
