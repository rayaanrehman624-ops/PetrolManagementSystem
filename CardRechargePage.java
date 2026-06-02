package petrolmanagementsystem;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CardRechargePage {

    // GLOBAL CARD BALANCE

    public static double cardBalance = 5000;

    public void show(Stage stage) {

        Label title =
                new Label("CARD RECHARGE SYSTEM");

        title.getStyleClass()
             .add("dashboard-title");

        TextField amountField =
                new TextField();

        amountField.setPromptText(
                "Enter Recharge Amount"
        );

        Label balanceLabel =
                new Label(
                "Current Balance : "
                + cardBalance
                + " PKR"
                );

        Button rechargeBtn =
                new Button("Recharge Card");

        Button backBtn =
                new Button("Back");

        // RECHARGE

        rechargeBtn.setOnAction(e -> {

            try {

                double amount =
                        Double.parseDouble(
                        amountField.getText()
                        );

                cardBalance += amount;

                balanceLabel.setText(

                    "Current Balance : "
                    + cardBalance
                    + " PKR"

                );

                amountField.clear();

            }

            catch(Exception ex)
            {
                balanceLabel.setText(
                    "Invalid Amount!"
                );
            }

        });

        // BACK

        backBtn.setOnAction(e -> {

            AdminDashboard admin =
                    new AdminDashboard();

            admin.show(stage);

        });

        VBox root =
                new VBox(20);

        root.getChildren().addAll(

                title,
                balanceLabel,
                amountField,
                rechargeBtn,
                backBtn

        );

        root.setAlignment(Pos.CENTER);

        Scene scene =
                new Scene(root,900,600);

        scene.getStylesheets().add(

            getClass()
            .getResource("style.css")
            .toExternalForm()

        );

        stage.setScene(scene);

        stage.setTitle(
                "Recharge Card"
        );

        stage.show();
    }
}
