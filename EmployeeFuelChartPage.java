package petrolmanagementsystem;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.chart.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EmployeeFuelChartPage {

    public void show(Stage stage) {

        Label title =
                new Label("FUEL STOCK CHART");

        title.getStyleClass()
             .add("dashboard-title");

        CategoryAxis xAxis =
                new CategoryAxis();

        xAxis.setLabel("Fuel Type");

        NumberAxis yAxis =
                new NumberAxis();

        yAxis.setLabel("Stock");

        BarChart<String,Number> chart =
                new BarChart<>(
                        xAxis,
                        yAxis
                );

        XYChart.Series<String,Number> data =
                new XYChart.Series<>();

        data.setName("Fuel Stock");

        data.getData().add(
                new XYChart.Data<>(
                "Petrol",5000
                ));

        data.getData().add(
                new XYChart.Data<>(
                "Diesel",3000
                ));

        chart.getData().add(data);

        Button backBtn =
                new Button("Back");

        Button logoutBtn =
                new Button("Logout");

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

        VBox root =
                new VBox(20);

        root.getChildren().addAll(

                title,
                chart,
                backBtn,
                logoutBtn

        );

        root.setAlignment(Pos.CENTER);

        Scene scene =
                new Scene(root,950,700);

        scene.getStylesheets().add(

                getClass()
                .getResource("style.css")
                .toExternalForm()

        );

        stage.setScene(scene);

        stage.setTitle(
                "Fuel Stock Chart"
        );

        stage.show();
    }
}