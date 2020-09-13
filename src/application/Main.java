package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import vista.PrincipalControlador;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("/vista/PrincipalPagina.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);
			PrincipalControlador manager = loader.getController();
			manager.initialize(primaryStage);
			primaryStage.setTitle("Gestion Aeroportuaria");
			primaryStage.getIcons().add(new Image("/icons/airplane.png"));
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
