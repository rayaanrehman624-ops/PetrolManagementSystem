package petrolmanagementsystem;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class EmployeePage {

    public void show(Stage stage) {

        // TITLE

        Label title =
                new Label("EMPLOYEE MANAGEMENT");

        title.getStyleClass()
             .add("dashboard-title");

        // INPUT FIELDS

        TextField nameField =
                new TextField();

        nameField.setPromptText(
                "Employee Name"
        );

        TextField idField =
                new TextField();

        idField.setPromptText(
                "Employee ID"
        );

        TextField roleField =
                new TextField();

        roleField.setPromptText(
                "Employee Role"
        );

        TextField salaryField =
                new TextField();

        salaryField.setPromptText(
                "Employee Salary"
        );

        TextField shiftField =
                new TextField();

        shiftField.setPromptText(
                "Shift Timing"
        );

        // TEXT AREA

        TextArea employeeArea =
                new TextArea();

        employeeArea.setPrefHeight(220);

        employeeArea.setEditable(false);

        // MESSAGE LABEL

        Label message =
                new Label();

        // BUTTONS

        Button addBtn =
                new Button("Add Employee");

        Button clearBtn =
                new Button("Clear");

        Button backBtn =
                new Button("Back");

        Button logoutBtn =
                new Button("Logout");

        // BUTTON SIZE

        Button[] buttons = {

                addBtn,
                clearBtn,
                backBtn,
                logoutBtn
        };

        for(Button btn : buttons)
        {
            btn.setPrefWidth(180);
            btn.setPrefHeight(45);
        }

        // ADD BUTTON ACTION

        addBtn.setOnAction(e -> {

            // STORE DATA

            String data =

                    "Employee Name : "
                    + nameField.getText()

                    + "\nEmployee ID : "
                    + idField.getText()

                    + "\nRole : "
                    + roleField.getText()

                    + "\n-----------------\n";

            // SHOW DATA IN TEXTAREA

            employeeArea.appendText(data);

            // SAVE DATA INTO FILE

            FileStorage.saveData(

                "admin",
                "employees.txt",
                data

            );

        });


        // CLEAR BUTTON

        clearBtn.setOnAction(e -> {

            nameField.clear();
            idField.clear();
            roleField.clear();
            salaryField.clear();
            shiftField.clear();

            message.setText("");

        });

        // BACK BUTTON

        backBtn.setOnAction(e -> {

            AdminDashboard admin =
                    new AdminDashboard();

            admin.show(stage);

        });
        
        
        employeeArea.setText(

        	    FileStorage.readData(

        	        "admin",
        	        "employees.txt"

        	    )

        	);

        // LOGOUT BUTTON

        logoutBtn.setOnAction(e -> {

            LoginPage login =
                    new LoginPage();

            login.show(stage);

        });

        // BUTTON BOX

        HBox buttonBox =
                new HBox(15);

        buttonBox.getChildren().addAll(

                addBtn,
                clearBtn,
                backBtn,
                logoutBtn

        );

        buttonBox.setAlignment(Pos.CENTER);

        // ROOT LAYOUT

        VBox root =
                new VBox(20);

        root.getChildren().addAll(

                title,
                nameField,
                idField,
                roleField,
                salaryField,
                shiftField,
                buttonBox,
                employeeArea,
                message

        );

        root.setAlignment(Pos.CENTER);

        root.setPadding(
                new Insets(30)
        );
        

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
                "Employee Management"
        );

        stage.show();
    }
}
