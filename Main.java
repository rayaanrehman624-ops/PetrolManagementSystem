package petrolmanagementsystem;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {

        LoginPage login = new LoginPage();
        login.show(stage);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
