package app;

import javafx.application.Application;
import javafx.stage.Stage;
import UI.SceneNavigator;

public class mainApp extends Application {

    @Override
    public void start(Stage stage) {
        SceneNavigator navigator = new SceneNavigator(stage);
        stage.setTitle("Mindful Journal");

        navigator.goToLogin();

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
