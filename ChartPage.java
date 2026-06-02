package petrolmanagementsystem;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ChartPage {

    public void show(Stage stage) {

        PieChart chart =
                new PieChart();

        chart.getData().add(
                new PieChart.Data("Petrol",60)
        );

        chart.getData().add(
                new PieChart.Data("Diesel",40)
        );

        VBox root =
                new VBox(chart);

        root.setAlignment(Pos.CENTER);

        Scene scene =
                new Scene(root,800,600);

        scene.getStylesheets().add(
                getClass()
                .getResource("style.css")
                .toExternalForm()
        );

        stage.setScene(scene);

        stage.setTitle("Charts & Graphs");

        stage.show();
    }
}