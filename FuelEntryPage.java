package petrolmanagementsystem;

import java.io.FileWriter;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FuelEntryPage {

    public void show(Stage stage) {

        Label title =
                new Label("FUEL ENTRY");

        title.getStyleClass()
             .add("dashboard-title");

        TextField customerField =
                new TextField();

        customerField.setPromptText(
                "Customer Name"
        );

        TextField fuelField =
                new TextField();

        fuelField.setPromptText(
                "Fuel Type"
        );

        TextField literField =
                new TextField();

        literField.setPromptText(
                "Liters"
        );

        TextField amountField =
                new TextField();

        amountField.setPromptText(
                "Amount"
        );

        Button saveBtn =
                new Button("Save Entry");

        Button backBtn =
                new Button("Back");

        Label message =
                new Label();

        // SAVE ENTRY

        saveBtn.setOnAction(e -> {

            try {

                FileWriter writer =
                        new FileWriter(
                        "fuelentry.txt",
                        true
                        );

                writer.write(

                    "Customer: "
                    + customerField.getText()

                    + "\nFuel: "
                    + fuelField.getText()

                    + "\nLiters: "
                    + literField.getText()

                    + "\nAmount: "
                    + amountField.getText()

                    + "\n-----------------\n"
                );

                writer.close();

                message.setText(
                        "Fuel Entry Saved!"
                );

                customerField.clear();
                fuelField.clear();
                literField.clear();
                amountField.clear();

            }

            catch(Exception ex)
            {
                ex.printStackTrace();
            }

        });

        // BACK


        Button logoutBtn =
                new Button("Logout");

        backBtn.setOnAction(e -> {

            AdminDashboard admin =
                    new AdminDashboard();

            admin.show(stage);

        });


        logoutBtn.setOnAction(e -> {

            LoginPage login =
                    new LoginPage();

            login.show(stage);

        });

        VBox root =
                new VBox(20);

        root.getChildren().addAll(

                title,
                customerField,
                fuelField,
                literField,
                amountField,
                backBtn,
                logoutBtn

        );
        VBox root1 =
                new VBox(20);

        root1.getChildren().addAll(

                title,
                customerField,
                fuelField,
                literField,
                amountField,
                saveBtn,
                backBtn,
                message

        );

        root1.setAlignment(Pos.CENTER);

        Scene scene =
                new Scene(root1,850,650);

        scene.getStylesheets().add(

                getClass()
                .getResource("style.css")
                .toExternalForm()

        );

        stage.setScene(scene);

        stage.setTitle("Fuel Entry");

        stage.show();
    }
}
