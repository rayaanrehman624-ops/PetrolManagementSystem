
package petrolmanagementsystem;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AdminProfilePage {

    public void show(Stage stage) {

        Label title =
                new Label("ADMIN PROFILE");

        title.setStyle(
            "-fx-font-size:40px;"
          + "-fx-text-fill:white;"
          + "-fx-font-weight:bold;"
        );

        Label id =
                new Label("Admin ID : ADM-1001");

        Label name =
                new Label("Name : Muhammad Rayyan-ur-Rehman");

        Label email =
                new Label("Email : adminrayyan@gmail.com");

        Label phone =
                new Label("Phone : 03302959543");

        Label role =
                new Label("Role : Petrol Pump Administrator");

        Label address =
                new Label("Address : Karachi Pakistan");

        Label salary =
                new Label("Salary : 500000 PKR");

        Label shift =
                new Label("Shift : Morning");

        Label experience =
                new Label("Experience : 5 Years");

        Label status =
                new Label("Status : Active");

        // LABEL STYLE

        Label[] labels = {

                id,
                name,
                email,
                phone,
                role,
                address,
                salary,
                shift,
                experience,
                status
        };

        for(Label lbl : labels)
        {
            lbl.setStyle(
                "-fx-font-size:18px;"
              + "-fx-text-fill:white;"
            );
        }

        // BUTTONS

        Button backBtn =
                new Button("Back");

        Button logoutBtn =
                new Button("Logout");

        backBtn.setPrefWidth(200);
        logoutBtn.setPrefWidth(200);

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

        // ROOT

        VBox root =
                new VBox(18);

        root.getChildren().addAll(

                title,
                id,
                name,
                email,
                phone,
                role,
                address,
                salary,
                shift,
                experience,
                status,
                backBtn,
                logoutBtn

        );

        root.setAlignment(Pos.CENTER);

        root.setPadding(
                new Insets(30)
        );

        root.setStyle(
            "-fx-background-color:linear-gradient(to right,#141e30,#243b55);"
        );

        Scene scene =
                new Scene(root,1000,700);

        stage.setScene(scene);

        stage.setTitle("Admin Profile");

        stage.show();
    }
}