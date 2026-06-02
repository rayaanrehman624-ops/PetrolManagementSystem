package petrolmanagementsystem;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SalesPage {

    public void show(Stage stage) {

        Label title =
                new Label("SALES REPORT");

        title.getStyleClass().add(
                "dashboard-title"
        );

        VBox root =
                new VBox(title);

        root.setAlignment(Pos.CENTER);

        Scene scene =
                new Scene(root,800,600);

        scene.getStylesheets().add(
                getClass()
                .getResource("style.css")
                .toExternalForm()
        );

        stage.setScene(scene);

        stage.setTitle(
                "Sales Report"
        );

        stage.show();
    }
}