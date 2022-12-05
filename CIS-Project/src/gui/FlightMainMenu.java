package gui;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;

public class FlightMainMenu extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = (Parent) FXMLLoader.load(getClass().getResource("WelcomePage.fxml"));
			Scene scene = new Scene(root);
			Stage stage = null;
			stage.setScene(scene);
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}






