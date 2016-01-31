package Controller;

import Model.Application;
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

    private static Application app;
    private String currentStation;

    @FXML
    private Label label1;
    @FXML
    private ListView<String> stationsList = new ListView<>();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        app = new Application();
        final ObservableList<String> stations = FXCollections.observableArrayList(app.getRadioStationsName());
        stationsList.setItems(stations);

        stationsList.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            setCurrentStation(newValue);
        });
    }

    public String getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(String currentStation) {
        this.currentStation = currentStation;
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

    public void loadPlaylistMenu(ActionEvent actionEvent) {
        System.out.println("loadPlaylistMenu");
    }

    public void savePlaylistMenu(ActionEvent actionEvent) {

        System.out.println("savePlaylistMenu");

    }
}
