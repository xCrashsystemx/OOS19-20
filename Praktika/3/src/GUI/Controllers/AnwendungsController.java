package GUI.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class AnwendungsController {

    @FXML
    private Button abbrechenBtn;


    @FXML
    void abbrechen(ActionEvent event) {
        System.out.println("Das Programm wurde abgebrochen...");
        Stage stage = (Stage) abbrechenBtn.getScene().getWindow();
        stage.close();

    }

}

