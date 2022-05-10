package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/LogIn.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setTitle("LOG IN");
            stage.setScene(scene);
            stage.show();
    }

    public void chanceScene() {
        DictionaryManagement dictionaryManagement = new DictionaryManagement();
        dictionaryManagement.start();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
