package gui;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======

>>>>>>> branch 'master' of https://github.com/jaffersaeed/CIS-Project.git
=======

>>>>>>> branch 'master' of https://github.com/jaffersaeed/CIS-Project.git
=======

>>>>>>> branch 'master' of https://github.com/jaffersaeed/CIS-Project.git
import javafx.application.Application;
import javafx.stage.Stage;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
import javafx.scene.Group;
>>>>>>> branch 'master' of https://github.com/jaffersaeed/CIS-Project.git
=======
import javafx.scene.Group;
>>>>>>> branch 'master' of https://github.com/jaffersaeed/CIS-Project.git
=======
import javafx.scene.Group;
>>>>>>> branch 'master' of https://github.com/jaffersaeed/CIS-Project.git
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;


public class Main extends Application {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
	
	public void start(Stage primaryStage) {
		
		Stage stage = null;
		
		try {
			Parent root = (Parent) FXMLLoader.load(getClass().getResource("WelcomePage.fxml"));
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
=======
	Stage window;

>>>>>>> branch 'master' of https://github.com/jaffersaeed/CIS-Project.git
=======
	Stage window;

>>>>>>> branch 'master' of https://github.com/jaffersaeed/CIS-Project.git
=======
	Stage window;

>>>>>>> branch 'master' of https://github.com/jaffersaeed/CIS-Project.git
	public static void main(String[] args) {
		launch(args);
	}
@Override
	public void start(Stage primaryStage)  {
		window = primaryStage;
		window.setTitle("Flight Login Page");
		ForgotPassword passwordScene = new ForgotPassword();
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(10, 10, 10, 10));
		grid.setVgap(8);
		grid.setHgap(10);
		grid.setAlignment(Pos.CENTER);
		Label welcome1 = new Label("Welcome to Aria's Airplane Reservation");
		GridPane.setConstraints(welcome1, 0, 0);
		
		// Created a Username label
		Label newLabel = new Label("Username:");
		GridPane.setConstraints(newLabel, 0, 1);
		// Created a Username text field
		TextField nameInput = new TextField("");
		nameInput.setPromptText("Username");

		GridPane.setConstraints(nameInput, 1, 1);
		// Created a password label
		Label password = new Label("Password");
		GridPane.setConstraints(password, 0, 2);
		// Create password input field
		PasswordField passInput = new PasswordField();
		passInput.setPromptText("Password");
		GridPane.setConstraints(passInput, 1, 2);
		// Create a login button
		Button loginB = new Button("Login");
		GridPane.setConstraints(loginB, 1, 3);
		WelcomePage welcome = new WelcomePage();
		Label forgotPass = new Label("Forgot your password? ");
		GridPane.setConstraints(forgotPass, 1, 4);
		// Create a forgot button
		Button forgotB = new Button("Forgot");

		grid.getChildren().addAll(welcome1, password, nameInput, passInput,newLabel, loginB, forgotPass);
		grid.setAlignment(Pos.CENTER);
		Scene scene = new Scene(grid, 800, 400);
		window.setScene(scene);
		window.show();
	}
}