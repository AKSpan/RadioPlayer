package Controller;

import Model.Application;
import Model.Player;
import Model.RadioStation;
import Model.RadioStationList;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Создал Alexey. Дата: 31.01.2016 16:52.
 */
public class MainFormController implements Initializable {

    private RadioStationList rslist;
    private Application app;

    public String getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(String currentStation) {
        this.currentStation = currentStation;
    }

    private String currentStation;

    @FXML
    private Label label1;
    @FXML
    private ListView<String> stationsList = new ListView<>();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        rslist = new RadioStationList()
                .addRadioStation(new RadioStation("Radio1", "http://54.155.51.103/live_6886540"))
                .addRadioStation(new RadioStation( "Radio2", "http://54.155.51.103/live_6886540"))
                .addRadioStation(new RadioStation( "Radio3", "http://54.155.51.103/live_6886540"));

       // app = new Application(new Player(rslist));
        final ObservableList stations =
                FXCollections.observableArrayList("1", "2", "3", "4", "5", "6", "7");
        stationsList.setItems(stations);

        stationsList.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                // Your action here
                setCurrentStation(newValue);
            }
        });
    }

    @FXML
    private void record(ActionEvent e) {
        System.out.println("record");
        label1.setText("record");
    }

    @FXML
    private void stop(ActionEvent e) {
        System.out.println("stop");
        label1.setText("stop");
    }

    @FXML
    private void play(ActionEvent e) {
        System.out.println("play");
        String curr = getCurrentStation();
        if (curr == null)
            label1.setText("Choose station before playing!");
        else
            label1.setText("Now playing: " + getCurrentStation());
    }


    public void addMenu(ActionEvent actionEvent) {
        System.out.println("addmenu");
    }

    public void deleteMenu(ActionEvent actionEvent) {
        System.out.println("deletemenu");
    }

    public void aboutMenu(ActionEvent actionEvent) {
        System.out.println("aboutmenu");

    }

    public void closeMenu(ActionEvent actionEvent) {
        System.out.println("closeMenu");

    }
}
