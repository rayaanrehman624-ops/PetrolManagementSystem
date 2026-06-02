package petrolmanagementsystem;

import java.io.BufferedReader;
import java.io.FileReader;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FuelRecordPage {

    public void show(Stage stage) {

        // TITLE

        Label title =
                new Label("FULL FUEL RECORDS");

        title.getStyleClass()
             .add("dashboard-title");

        // TEXT AREA

        TextArea area =
                new TextArea();

        area.setPrefWidth(600);
        area.setPrefHeight(350);

        area.setEditable(false);

        // BUTTONS

        Button loadBtn =
                new Button("Load Records");

        Button clearBtn =
                new Button("Clear");

        Button backBtn =
                new Button("Back");

        Button logoutBtn =
                new Button("Logout");

        loadBtn.setPrefWidth(180);
        clearBtn.setPrefWidth(180);
        backBtn.setPrefWidth(180);
        logoutBtn.setPrefWidth(180);

        // LOAD RECORDS

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
                area.setText(
                    "No Fuel Records Found!"
                );
            }

        });

        // CLEAR

        clearBtn.setOnAction(e -> {

            area.clear();

        });

        // BACK

        backBtn.setOnAction(e -> {

            AdminDashboard admin =
                    new AdminDashboard();

            admin.show(stage);

        });

        // LOGOUT

        logoutBtn.setOnAction(e -> {

            LoginPage login =
                    new LoginPage();

            login.show(stage);

        });

        // BUTTON BOX

        HBox buttonBox =
                new HBox(15);

        buttonBox.getChildren().addAll(

                loadBtn,
                clearBtn,
                backBtn,
                logoutBtn

        );

        buttonBox.setAlignment(Pos.CENTER);

        // ROOT

        VBox root =
                new VBox(20);

        root.getChildren().addAll(

                title,
                area,
                buttonBox

        );

        root.setPadding(
                new Insets(30)
        );

        root.setAlignment(Pos.CENTER);

        // SCENE

        Scene scene =
                new Scene(root,950,700);

        scene.getStylesheets().add(

                getClass()
                .getResource("style.css")
                .toExternalForm()

        );

        // STAGE

        stage.setScene(scene);

        stage.setTitle(
                "Fuel Records"
        );

        stage.show();
    }
}