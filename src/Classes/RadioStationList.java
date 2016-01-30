package Classes;

import java.util.HashMap;
import java.util.Map;

/**
 * Создал Alexey. Дата: 30.01.2016 17:44.
 */
class RadioStationList {
    private Map<Integer, RadioStation> radioStationList;

    RadioStationList() {
        this.radioStationList = new HashMap<>();
    }

    RadioStationList(Map<Integer, RadioStation> map) {
        this.radioStationList = map;
    }


    /**
     * Add new Station in list
     *
     * @param rs new {@link RadioStation}
     * @return {@link RadioStation}
     */
    RadioStationList addRadioStation(RadioStation rs) {
        this.radioStationList.put(rs.getId(), rs);
        return this;
    }

    /**
     * Get Radio Station by ID
     *
     * @param id ID of station
     * @return {@link RadioStation} which contains this id
     */
    RadioStation getRadioStation(int id) {
        return radioStationList.get(id);
    }

    /**
     * Get Radio Station by NAME
     *
     * @param name Name of Station
     * @return {@link RadioStation} if list contains the station with this Name, else {@code null}
     * @throws NullPointerException if {@link RadioStation#getName()} return {@code null}
     */
    RadioStation getRadioStation(String name) throws NullPointerException {
        for (Map.Entry<Integer, RadioStation> rs : radioStationList.entrySet()) {
            if (rs.getValue().getName().equals(name))
                return rs.getValue();
        }
        return null;
    }

    RadioStationList removeRadioStation(int id) {
        this.radioStationList.remove(id);
        return this;
    }

    RadioStationList removeRadioStation(String name) {
        Map<Integer, RadioStation> proxy = new HashMap<>(radioStationList);
        for (Map.Entry<Integer, RadioStation> rs : proxy.entrySet()) {
            if (rs.getValue().getName().equals(name))
                this.radioStationList.remove(rs.getValue().getId());
        }
        return this;
    }

    RadioStationList editRadioStation(RadioStation rs) {
        this.radioStationList.put(rs.getId(), rs);
        return this;
    }

    @Override
    public String toString() {
        return "RadioStationList[" +
                "radioStationList=" + radioStationList +
                ']';
    }
}
