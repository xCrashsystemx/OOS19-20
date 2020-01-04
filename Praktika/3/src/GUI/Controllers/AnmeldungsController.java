package GUI.Controllers;

import BenutzerVerwaltung.Benutzer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AnmeldungsController {

    @FXML
    private TextField UserIDtf;

    @FXML
    private TextField Passworttf;

    @FXML
    private Button submitBtn;

    @FXML
    private TextField wiederholentf;

    @FXML
        //Prüfen ob das Passwort gleich ist
    void submit(ActionEvent event) {
        if (!(Passworttf.getText().equals(wiederholentf.getText()))) {
            UserIDtf.setText("Passwort != Wiederholung");
        } else {//Benutzer anlegen...
            //Objekt der Klasse Benutzer erzeugen...
            Benutzer newUser = new Benutzer(UserIDtf.getText(),
                    Passworttf.getText().toCharArray());
            //Ausgeben..
            System.out.println(newUser.toString());
            //Fenster schließen...
            Stage stage = (Stage) submitBtn.getScene().getWindow();
            stage.close();
        }

    }

}

