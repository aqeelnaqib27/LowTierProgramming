package UI;

import javafx.scene.Scene;
import javafx.stage.Stage;
import logic.loginDatabase.UserAuthenticator;
import logic.loginDatabase.UserSession;

public class SceneNavigator {

    private final Stage stage;
    private static boolean wasMaximized = true;
    private UserSession session;

    public void setSession(String emailOrUsername) {
        UserAuthenticator auth = new UserAuthenticator();
        this.session = auth.getUserData(emailOrUsername);
    }
    public UserSession getSession() {
        return session;
    }

    public SceneNavigator(Stage stage) {
        this.stage = stage;

        stage.setMinWidth(1200);
        stage.setMinHeight(750);
        stage.setMaximized(true);
    }

    private void switchScene(Scene scene) {
        wasMaximized = stage.isMaximized();

        stage.setScene(scene);

        stage.setMaximized(wasMaximized);
        stage.setFullScreen(false);
        stage.show();
    }

    // ====== NAVIGATION ======

    public void goToLogin() {
        switchScene(new LoginPage(stage, this).getScene());
    }

    public void goToRegister() {
        switchScene(new RegisterPage(stage, this).getScene());
    }

    public void goToWelcome() {
        switchScene(new WelcomePage(stage, this).getScene());
    }

    public void goToJournalIntro() {
        switchScene(new JournalIntroPage(stage, this).getScene());
    }

    public void goToJournalHub() {
        switchScene(new JournalHubPage(stage, this).getScene());
    }

    public void goToJournalDates() {
        switchScene(new JournalDatesPage(stage, this).getScene());
    }

    public void goToJournalView() {
        switchScene(new JournalViewPage(stage, this).getScene());
    }

    public void goToJournalCreate() {
        switchScene(new JournalCreatePage(stage, this).getScene());
    }

    public void goToSummary() {
        switchScene(new SummaryPage(stage, this).getScene());
    }
}
