package petrolmanagementsystem;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AdminDashboard {

    public void show(Stage stage) {

        // TITLE
        Label title =
                new Label("ADMIN DASHBOARD");

        title.getStyleClass()
             .add("dashboard-title");

        // BUTTONS
        Button fuelBtn =
                new Button("Manage Fuel");
        
        Button fuelRecordBtn =
                new Button("Fuel Check Records");

        Button empBtn =
                new Button("Employees");

        Button salesBtn =
                new Button("Sales Report");

        Button stockBtn =
                new Button("Fuel Stock");

        Button balanceBtn =
                new Button("Daily Balance");

        Button graphBtn =
                new Button("Charts & Graphs");

        Button profileBtn =
                new Button("Admin Profile");
        
        Button rechargeBtn =
                new Button("Recharge Employee Card");
        
        Button storageBtn =
                new Button("File Storage");

        Button logoutBtn =
                new Button("Logout");

        // BUTTON SIZE
        Button[] buttons = {
                fuelBtn,
                fuelRecordBtn,
                empBtn,
                salesBtn,
                stockBtn,
                balanceBtn,
                graphBtn,
                profileBtn,
                storageBtn,
                logoutBtn,
        };

        for(Button btn : buttons)
        {
            btn.setPrefWidth(220);
            btn.setPrefHeight(65);
        }

        // BUTTON ACTIONS

        fuelBtn.setOnAction(e -> {

            FuelEntryPage fuel =
                    new FuelEntryPage();

            fuel.show(stage);

        });
        fuelRecordBtn.setOnAction(e -> {

            FuelRecordPage record =
                    new FuelRecordPage();

            record.show(stage);

        });
        empBtn.setOnAction(e -> {

            EmployeePage employee =
                    new EmployeePage();

            employee.show(stage);

        });

        salesBtn.setOnAction(e -> {

            SalesReportPage sales =
                    new SalesReportPage();

            sales.show(stage);

        });

        stockBtn.setOnAction(e -> {

            FuelStockPage stock =
                    new FuelStockPage();

           stock.show(stage);

        });

        balanceBtn.setOnAction(e -> {

            DailyBalancePage balance =
                    new DailyBalancePage();

            balance.show(stage);

        });

        graphBtn.setOnAction(e -> {

            PetrolUsageChartPage chart =
                    new PetrolUsageChartPage();

            chart.show(stage);

        });

        profileBtn.setOnAction(e -> {

            AdminProfilePage profile =
                    new AdminProfilePage();

            profile.show(stage);

        
        });
        rechargeBtn.setOnAction(e -> {

            CardRechargePage recharge =
                    new CardRechargePage();

            recharge.show(stage);

        });
        storageBtn.setOnAction(e -> {

            FileStoragePage file =
                    new FileStoragePage();

            file.show(stage);

        });

        logoutBtn.setOnAction(e -> {

            LoginPage login =
                    new LoginPage();

            login.show(stage);

        });

        // GRID LAYOUT
        GridPane grid =
                new GridPane();

        grid.setHgap(20);
        grid.setVgap(20);

        grid.add(fuelBtn,0,0);
        grid.add(fuelRecordBtn,1,0);
        grid.add(empBtn,1,0);

        grid.add(salesBtn,0,1);
        grid.add(stockBtn,1,1);

        grid.add(balanceBtn,0,2);
        grid.add(graphBtn,1,2);

        grid.add(profileBtn,0,3);
        grid.add(storageBtn,1,3);

        grid.add(logoutBtn,0,4);

        grid.setAlignment(Pos.CENTER);

        // ROOT LAYOUT
        VBox root =
                new VBox(35);

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
                "Admin Dashboard"
        );

        stage.show();
    }
}
