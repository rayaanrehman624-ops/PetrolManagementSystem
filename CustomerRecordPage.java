package petrolmanagementsystem;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class CustomerRecordPage {

    public void show(Stage stage) {

        Label title =
                new Label("CUSTOMER RECORDS");

        title.getStyleClass()
             .add("dashboard-title");

        TextArea area =
                new TextArea();

        area.setPrefHeight(350);

        area.setText(

            "Customer : Hafiz Muhammad Ibrahim Khan\n"
          + "Fuel : Petrol\n"
          + "Liters : 20\n"
          + "Amount : 6000\n\n"

          + "Customer : Ahmed Atif\n"
          + "Fuel : Diesel\n"
          + "Liters : 15\n"
          + "Amount : 4500\n\n"

          + "Customer : Hamza Mukhtar\n"
          + "Fuel : Petrol\n"
          + "Liters : 30\n"
          + "Amount : 9000\n"

        );

        Button backBtn =
                new Button("Back");

        Button logoutBtn =
                new Button("Logout");

        backBtn.setPrefWidth(180);
        logoutBtn.setPrefWidth(180);

        // BACK

        backBtn.setOnAction(e -> {

            EmployeeDashboard employee =
                    new EmployeeDashboard();

            employee.show(stage);

        });

        // LOGOUT

        logoutBtn.setOnAction(e -> {

            LoginPage login =
                    new LoginPage();

            login.show(stage);

        });

        HBox buttonBox =
                new HBox(15);

        buttonBox.getChildren().addAll(

                backBtn,
                logoutBtn

        );

        buttonBox.setAlignment(Pos.CENTER);

        VBox root =
                new VBox(20);

        root.getChildren().addAll(

                title,
                area,
                buttonBox

        );

        root.setAlignment(Pos.CENTER);

        root.setPadding(
                new Insets(30)
        );

        Scene scene =
                new Scene(root,950,700);

        scene.getStylesheets().add(

                getClass()
                .getResource("style.css")
                .toExternalForm()

        );

        stage.setScene(scene);

        stage.setTitle(
                "Customer Records"
        );

        stage.show();
    }
}