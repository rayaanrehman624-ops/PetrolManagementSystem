package petrolmanagementsystem;

import java.io.BufferedReader;
import java.io.FileReader;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SalesReportPage {

    public void show(Stage stage) {

        Label title =
                new Label("SALES REPORT");

        title.getStyleClass()
             .add("dashboard-title");

        TextArea area =
                new TextArea();

        area.setPrefWidth(500);
        area.setPrefHeight(300);

        Button loadBtn =
                new Button("Load Sales");

        Button backBtn =
                new Button("Back");

        // LOAD SALES

        loadBtn.setOnAction(e -> {

            try {

                BufferedReader reader =
                        new BufferedReader(
                        new FileReader(
                        "fuelentry.txt"
                        ));

                String line;

                area.clear();

                while((line =
                        reader.readLine())
                        != null)
                {
                    area.appendText(
                            line + "\n"
                    );
                }

                reader.close();

            }

            catch(Exception ex)
            {
                ex.printStackTrace();
            }

        });

        // BACK

        backBtn.setOnAction(e -> {

            AdminDashboard admin =
                    new AdminDashboard();

            admin.show(stage);

        });

        VBox root =
                new VBox(20);

        root.getChildren().addAll(

                title,
                area,
                loadBtn,
                backBtn

        );

        root.setAlignment(Pos.CENTER);

        Scene scene =
                new Scene(root,850,650);

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
