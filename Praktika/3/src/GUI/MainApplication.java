package GUI;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApplication extends javafx.application.Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Views/login.fxml"));
        primaryStage.setTitle("Benutzerverwaltung");
        primaryStage.setScene(new Scene(root, 600, 140));
        primaryStage.show();
    }
}
