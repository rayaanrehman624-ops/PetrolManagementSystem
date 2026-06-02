package petrolmanagementsystem;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EmployeeDashboard {

    public void show(Stage stage) {

        // TITLE

        Label title =
                new Label("EMPLOYEE DASHBOARD");
        Label cardBalance =
                new Label(

                "Fuel Card Balance : "
                + CardRechargePage.cardBalance
                + " PKR"

                );

        title.getStyleClass()
             .add("dashboard-title");

        // BUTTONS

        Button fuelCheckBtn =
                new Button("Fuel Check");
        Button useFuelBtn =
                new Button("Use Fuel Card");

        Button customerBtn =
                new Button("Customer Records");

        Button stockChartBtn =
                new Button("Fuel Stock Chart");

        Button profileBtn =
                new Button("Employee Profile");

        Button logoutBtn =
                new Button("Logout");

        // BUTTON SIZE

        Button[] buttons = {

                fuelCheckBtn,
                customerBtn,
                stockChartBtn,
                profileBtn,
                logoutBtn
        };

        for(Button btn : buttons)
        {
            btn.setPrefWidth(220);
            btn.setPrefHeight(65);
        }

        // BUTTON ACTIONS

        fuelCheckBtn.setOnAction(e -> {

            FuelStockPage fuel =
                    new FuelStockPage();

            fuel.show(stage);

        });
        useFuelBtn.setOnAction(e -> {

            double fuelAmount = 500;

            if(CardRechargePage.cardBalance >= fuelAmount)
            {
                CardRechargePage.cardBalance -= fuelAmount;

                cardBalance.setText(

                    "Fuel Card Balance : "
                    + CardRechargePage.cardBalance
                    + " PKR"

                );
            }

            else
            {
                cardBalance.setText(
                    "Insufficient Balance!"
                );
            }

        });

        customerBtn.setOnAction(e -> {

            CustomerRecordPage customer =
                    new CustomerRecordPage();

            customer.show(stage);

        });

        stockChartBtn.setOnAction(e -> {

            EmployeeFuelChartPage chart =
                    new EmployeeFuelChartPage();

            chart.show(stage);

        });

        profileBtn.setOnAction(e -> {

            EmployeeProfilePage profile =
                    new EmployeeProfilePage();

            profile.show(stage);

        });

        logoutBtn.setOnAction(e -> {

            LoginPage login =
                    new LoginPage();

            login.show(stage);

        });

        // GRID

        GridPane grid =
                new GridPane();

        grid.setHgap(20);
        grid.setVgap(20);

        grid.add(fuelCheckBtn,0,0);
        grid.add(customerBtn,1,0);

        grid.add(stockChartBtn,0,1);
        grid.add(profileBtn,1,1);

        grid.add(logoutBtn,0,2);

        grid.setAlignment(Pos.CENTER);

        // ROOT

        VBox root =
                new VBox(35);

        // IMPORTANT PART

        root.getChildren().addAll(

                title,
                grid

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
                "Employee Dashboard"
        );

        stage.show();
    }
}