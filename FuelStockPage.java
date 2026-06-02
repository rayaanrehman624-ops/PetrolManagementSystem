package petrolmanagementsystem;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class FuelStockPage {

    public void show(Stage stage) {

        // TITLE

        Label title =
                new Label("FUEL STOCK MANAGEMENT");

        title.getStyleClass()
             .add("dashboard-title");

        // PETROL STOCK

        Label petrolLabel =
                new Label(
                "Petrol Stock : 500000 Liters"
                );

        petrolLabel.getStyleClass()
                   .add("stock-label");

        ProgressBar petrolBar =
                new ProgressBar(0.75);

        petrolBar.setPrefWidth(400);

        // DIESEL STOCK

        Label dieselLabel =
                new Label(
                "Diesel Stock : 300000 Liters"
                );

        dieselLabel.getStyleClass()
                   .add("stock-label");

        ProgressBar dieselBar =
                new ProgressBar(0.55);

        dieselBar.setPrefWidth(400);

        // FUEL STATUS

        Label status =
                new Label(
                "Fuel Status : Available"
                );

        status.getStyleClass()
              .add("status-label");

        // UPDATE FIELDS

        TextField petrolField =
                new TextField();

        petrolField.setPromptText(
                "Enter New Petrol Stock"
        );

        TextField dieselField =
                new TextField();

        dieselField.setPromptText(
                "Enter New Diesel Stock"
        );

        // MESSAGE

        Label message =
                new Label();

        // BUTTONS

        Button updateBtn =
                new Button("Update Stock");

        Button clearBtn =
                new Button("Clear");

        Button backBtn =
                new Button("Back");

        Button logoutBtn =
                new Button("Logout");

        // BUTTON SIZE

        Button[] buttons = {

                updateBtn,
                clearBtn,
                backBtn,
                logoutBtn
        };

        for(Button btn : buttons)
        {
            btn.setPrefWidth(180);
            btn.setPrefHeight(45);
        }

        // UPDATE BUTTON

        updateBtn.setOnAction(e -> {

            try {

                String petrol =
                        petrolField.getText();

                String diesel =
                        dieselField.getText();

                petrolLabel.setText(
                    "Petrol Stock : "
                    + petrol
                    + " Liters"
                );

                dieselLabel.setText(
                    "Diesel Stock : "
                    + diesel
                    + " Liters"
                );

                message.setText(
                    "Stock Updated Successfully!"
                );

            }

            catch(Exception ex)
            {
                message.setText(
                    "Invalid Input!"
                );
            }

        });

        // CLEAR BUTTON

        clearBtn.setOnAction(e -> {

            petrolField.clear();
            dieselField.clear();

            message.setText("");

        });

        // BACK BUTTON

        backBtn.setOnAction(e -> {

            AdminDashboard admin =
                    new AdminDashboard();

            admin.show(stage);

        });

        // LOGOUT BUTTON

        logoutBtn.setOnAction(e -> {

            LoginPage login =
                    new LoginPage();

            login.show(stage);

        });

        // BUTTON BOX

        HBox buttonBox =
                new HBox(15);

        buttonBox.getChildren().addAll(

                updateBtn,
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

                petrolLabel,
                petrolBar,

                dieselLabel,
                dieselBar,

                status,

                petrolField,
                dieselField,

                buttonBox,

                message

        );

        root.setAlignment(Pos.CENTER);

        root.setPadding(
                new Insets(30)
        );

        // SCENE

        Scene scene =
                new Scene(root,1000,700);

        scene.getStylesheets().add(

                getClass()
                .getResource("style.css")
                .toExternalForm()

        );

        // STAGE

        stage.setScene(scene);

        stage.setTitle(
                "Fuel Stock"
        );

        stage.show();
    }
}