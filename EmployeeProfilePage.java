package petrolmanagementsystem;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EmployeeProfilePage {

    public void show(Stage stage) {

        // TITLE

        Label title =
                new Label("EMPLOYEE PROFILE");

        title.getStyleClass()
             .add("dashboard-title");

        // EMPLOYEE DETAILS

        Label name =
                new Label(
                "Name : Ahmed Atif"
                );

        Label email =
                new Label(
                "Email : employeeAhmed@gmail.com"
                );

        Label phone =
                new Label(
                "Phone : 03111234567"
                );

        Label role =
                new Label(
                "Role : Fuel Operator"
                );

        Label address =
                new Label(
                "Address : karachi Pakistan"
                );

        Label salary =
                new Label(
                "Salary : 100000 PKR"
                );

        Label shift =
                new Label(
                "Shift : Evening"
                );

        // BUTTONS

        Button backBtn =
                new Button("Back");

        Button logoutBtn =
                new Button("Logout");

        backBtn.setPrefWidth(200);
        logoutBtn.setPrefWidth(200);

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

        // ROOT

        VBox root =
                new VBox(20);

        root.getChildren().addAll(

                title,
                name,
                email,
                phone,
                role,
                address,
                salary,
                shift,
                backBtn,
                logoutBtn

        );

        root.setPadding(
                new Insets(30)
        );

        root.setAlignment(Pos.CENTER);

        // SCENE

        Scene scene =
                new Scene(root,850,650);

        scene.getStylesheets().add(

                getClass()
                .getResource("style.css")
                .toExternalForm()

        );

        // STAGE

        stage.setScene(scene);

        stage.setTitle(
                "Employee Profile"
        );

        stage.show();
    }
}