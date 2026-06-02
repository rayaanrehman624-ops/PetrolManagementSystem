package petrolmanagementsystem;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ProfilePage {

    public void show(Stage stage) {

        Label title =
                new Label("ADMIN PROFILE");

        title.getStyleClass()
             .add("dashboard-title");

        Label name =
                new Label("Name: Admin");

        Label email =
                new Label("Email: admin@gmail.com");

        Label phone =
                new Label("Phone: 03001234567");

        VBox root =
                new VBox(20);

        root.getChildren().addAll(
                title,
                name,
                email,
                phone
        );

        root.setAlignment(Pos.CENTER);

        Scene scene =
                new Scene(root,800,600);

        scene.getStylesheets().add(
                getClass()
                .getResource("style.css")
                .toExternalForm()
        );

        stage.setScene(scene);

        stage.setTitle("Admin Profile");

        stage.show();
    }
}
