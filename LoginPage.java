package petrolmanagementsystem;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LoginPage {

    public void show(Stage stage) {

        Label title =
                new Label("PETROL MANAGEMENT SYSTEM");

        title.getStyleClass().add("title");

        Label subtitle =
                new Label("Admin & Employee Login");

        subtitle.getStyleClass().add("subtitle");

        TextField usernameField =
                new TextField();

        usernameField.setPromptText(
                "Enter Username"
        );

        PasswordField passwordField =
                new PasswordField();

        passwordField.setPromptText(
                "Enter Password"
        );

        ComboBox<String> roleBox =
                new ComboBox<>();

        roleBox.getItems().addAll(
                "Admin",
                "Employee"
        );

        roleBox.setPromptText("Select Role");

        Label message = new Label();

        Button loginBtn =
                new Button("LOGIN");

        loginBtn.setPrefWidth(250);
        loginBtn.setPrefHeight(45);

        loginBtn.setOnAction(e -> {

            String username =
                    usernameField.getText();

            String password =
                    passwordField.getText();

            String role =
                    roleBox.getValue();

            if(role == null)
            {
                message.setText(
                        "Please Select Role"
                );

                return;
            }

            // ADMIN LOGIN
            if(role.equals("Admin") &&
               username.equals("rayyan") &&
               password.equals("12345"))
            {
                AdminDashboard admin =
                        new AdminDashboard();

                admin.show(stage);
            }

            // EMPLOYEE LOGIN
            else if(role.equals("Employee") &&
                    username.equals("employee") &&
                    password.equals("123"))
            {
                EmployeeDashboard employee =
                        new EmployeeDashboard();

                employee.show(stage);
            }

            else
            {
                message.setText(
                    "Invalid Username or Password"
                );
            }
        });

        VBox root = new VBox(20);

        root.getChildren().addAll(
                title,
                subtitle,
                usernameField,
                passwordField,
                roleBox,
                loginBtn,
                message
        );

        root.setAlignment(Pos.CENTER);

        Scene scene =
                new Scene(root,700,550);

        scene.getStylesheets().add(
                getClass()
                .getResource("style.css")
                .toExternalForm()
        );

        stage.setTitle(
                "Petrol Management System"
        );

        stage.setScene(scene);

        stage.show();
    }
}