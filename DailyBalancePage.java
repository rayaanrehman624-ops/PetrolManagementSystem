package petrolmanagementsystem;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DailyBalancePage {

    public void show(Stage stage) {

        // TITLE

        Label title =
                new Label("DAILY BALANCE");

        title.getStyleClass()
             .add("dashboard-title");

        // INPUT FIELDS

        TextField openingField =
                new TextField();

        openingField.setPromptText(
                "Opening Balance"
        );

        TextField salesField =
                new TextField();

        salesField.setPromptText(
                "Total Sales"
        );

        TextField expenseField =
                new TextField();

        expenseField.setPromptText(
                "Total Expenses"
        );

        // RESULT LABEL

        Label result =
                new Label();

        result.setStyle(
                "-fx-font-size:18px;"
              + "-fx-text-fill:white;"
        );

        // BUTTONS

        Button calculateBtn =
                new Button("Calculate");

        Button clearBtn =
                new Button("Clear");

        Button backBtn =
                new Button("Back");

        Button logoutBtn =
                new Button("Logout");

        calculateBtn.setPrefWidth(180);
        clearBtn.setPrefWidth(180);
        backBtn.setPrefWidth(180);
        logoutBtn.setPrefWidth(180);

        // CALCULATE

        calculateBtn.setOnAction(e -> {

            try {

                double opening =
                        Double.parseDouble(
                        openingField.getText()
                        );

                double sales =
                        Double.parseDouble(
                        salesField.getText()
                        );

                double expenses =
                        Double.parseDouble(
                        expenseField.getText()
                        );

                double balance =
                        opening + sales - expenses;

                result.setText(

                    "Final Daily Balance = "
                    + balance

                );

            }

            catch(Exception ex)
            {
                result.setText(
                    "Enter Valid Numbers!"
                );
            }

        });

        // CLEAR

        clearBtn.setOnAction(e -> {

            openingField.clear();
            salesField.clear();
            expenseField.clear();
            result.setText("");

        });

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

        // BUTTON BOX

        HBox buttonBox =
                new HBox(15);

        buttonBox.getChildren().addAll(

                calculateBtn,
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
                openingField,
                salesField,
                expenseField,
                buttonBox,
                result

        );

        root.setAlignment(Pos.CENTER);

        root.setPadding(
                new Insets(30)
        );

        // SCENE

        Scene scene =
                new Scene(root,900,700);

        scene.getStylesheets().add(

                getClass()
                .getResource("style.css")
                .toExternalForm()

        );

        // STAGE

        stage.setScene(scene);

        stage.setTitle(
                "Daily Balance"
        );

        stage.show();
    }
}
