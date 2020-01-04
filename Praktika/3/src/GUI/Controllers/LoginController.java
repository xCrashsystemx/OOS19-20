package GUI.Controllers;

import BenutzerVerwaltung.Benutzer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {
    private boolean neuAnmeldung = false;


    @FXML
    private TextField UserIDtf;

    @FXML
    private TextField Passworttf;

    @FXML
    private CheckBox neuanmeldungcheckbox;

    @FXML
    private Button submitBtn;

    @FXML
        //Wenn neuAnmeldung Checkbox gechecked wird...
    void neuanmeldung(ActionEvent event) {
        neuAnmeldung = true;
        System.out.println(neuAnmeldung);

    }

    @FXML
        //Wenn ausführen gedrückt wird...
    void submit(ActionEvent event) {
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
