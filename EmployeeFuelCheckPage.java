package petrolmanagementsystem;

import java.io.BufferedReader;
import java.io.FileReader;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EmployeeFuelCheckPage {

    public void show(Stage stage) {

        Label title =
                new Label("EMPLOYEE FUEL CHECK");

        title.getStyleClass()
             .add("dashboard-title");

        TextArea area =
                new TextArea();

        area.setPrefWidth(500);
        area.setPrefHeight(300);

        Button checkBtn =
                new Button("Check Fuel Records");

        Button backBtn =
                new Button("Back");

        // CHECK RECORDS

        checkBtn.setOnAction(e -> {

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

            EmployeeDashboard employee =
                    new EmployeeDashboard();

            employee.show(stage);

        });

        VBox root =
                new VBox(20);

        root.getChildren().addAll(

                title,
                area,
                checkBtn,
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
                "Employee Fuel Access"
        );

        stage.show();
    }
}