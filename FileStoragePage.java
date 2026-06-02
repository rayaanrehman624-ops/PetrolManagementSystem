package petrolmanagementsystem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FileStoragePage {

    public void show(Stage stage) {

        // TITLE

        Label title =
                new Label("FILE STORAGE");

        title.getStyleClass()
             .add("dashboard-title");

        // TEXT AREA

        TextArea area =
                new TextArea();

        area.setPromptText(
                "Enter Fuel, Sales, Employee Data..."
        );

        area.setPrefWidth(500);
        area.setPrefHeight(250);

        // BUTTONS

        Button saveBtn =
                new Button("Save File");

        Button loadBtn =
                new Button("Load File");

        Button clearBtn =
                new Button("Clear");

        Button backBtn =
                new Button("Back");

        saveBtn.setPrefWidth(220);
        loadBtn.setPrefWidth(220);
        clearBtn.setPrefWidth(220);
        backBtn.setPrefWidth(220);

        // SAVE FILE

        saveBtn.setOnAction(e -> {

            try {

                FileWriter writer =
                        new FileWriter(
                                "storage.txt"
                        );

                writer.write(
                        area.getText()
                );

                writer.close();

                area.appendText(
                        "\n\nData Saved Successfully!"
                );

            }

            catch(Exception ex)
            {
                ex.printStackTrace();
            }

        });

        // LOAD FILE

        loadBtn.setOnAction(e -> {

            try {

                BufferedReader reader =
                        new BufferedReader(
                                new FileReader(
                                        "storage.txt"
                                )
                        );

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

        // ROOT

        VBox root =
                new VBox(20);

        root.getChildren().addAll(

                title,
                area,
                saveBtn,
                loadBtn,
                clearBtn,
                backBtn

        );

        root.setAlignment(Pos.CENTER);

        // SCENE

        Scene scene =
                new Scene(root,900,700);

        scene.getStylesheets().add(

                getClass()
                .getResource("style.css")
                .toExternalForm()

        );

        stage.setScene(scene);

        stage.setTitle(
                "File Storage"
        );

        stage.show();
    }
}