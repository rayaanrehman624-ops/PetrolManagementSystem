package petrolmanagementsystem;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.chart.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PetrolUsageChartPage {

    public void show(Stage stage) {

        // TITLE

        Label title =
                new Label(
                "MONTHLY PETROL USAGE"
                );

        title.getStyleClass()
             .add("dashboard-title");

        // X AXIS

        CategoryAxis xAxis =
                new CategoryAxis();

        xAxis.setLabel(
                "Months"
        );

        // Y AXIS

        NumberAxis yAxis =
                new NumberAxis();

        yAxis.setLabel(
                "Petrol Usage (Liters)"
        );

        // BAR CHART

        BarChart<String, Number> chart =
                new BarChart<>(
                        xAxis,
                        yAxis
                );

        chart.setTitle(
                "Monthly Petrol Record"
        );

        // DATA SERIES

        XYChart.Series<String, Number> data =
                new XYChart.Series<>();

        data.setName(
                "Petrol Usage"
        );

        // MONTH DATA

        data.getData().add(
                new XYChart.Data<>(
                "Jan",5000
                ));

        data.getData().add(
                new XYChart.Data<>(
                "Feb",6500
                ));

        data.getData().add(
                new XYChart.Data<>(
                "Mar",7000
                ));

        data.getData().add(
                new XYChart.Data<>(
                "Apr",8000
                ));

        data.getData().add(
                new XYChart.Data<>(
                "May",9500
                ));

        data.getData().add(
                new XYChart.Data<>(
                "Jun",10000
                ));

        data.getData().add(
                new XYChart.Data<>(
                "Jul",8500
                ));

        data.getData().add(
                new XYChart.Data<>(
                "Aug",11000
                ));

        data.getData().add(
                new XYChart.Data<>(
                "Sep",12000
                ));

        data.getData().add(
                new XYChart.Data<>(
                "Oct",9500
                ));

        data.getData().add(
                new XYChart.Data<>(
                "Nov",13000
                ));

        data.getData().add(
                new XYChart.Data<>(
                "Dec",15000
                ));

        chart.getData().add(data);

        // BUTTONS

        Button backBtn =
                new Button("Back");

        Button logoutBtn =
                new Button("Logout");

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

        // ROOT

        VBox root =
                new VBox(20);

        root.getChildren().addAll(

                title,
                chart,
                backBtn,
                logoutBtn

        );

        root.setAlignment(Pos.CENTER);

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
                "Petrol Usage Chart"
        );

        stage.show();
    }
}