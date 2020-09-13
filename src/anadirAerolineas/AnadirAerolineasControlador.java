package anadirAerolineas;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import modelo.AlertaCustom;

public class AnadirAerolineasControlador {

	@FXML
	private TextField TextFieldCodigo;

	@FXML
	private TextField TextFieldNombre;

	@FXML
	private CheckBox CheckBoxEstado;

	@FXML
	private Button ButtonAnadirAerolinea;

	private Stage thisstage;

	public void initialize(Stage stage) {
		this.thisstage = stage;
		thisstage.centerOnScreen();
	}

	public void buttonAnadirAerolinea() {
		if (!TextFieldCodigo.getText().isEmpty() && !TextFieldNombre.getText().isEmpty()) {

			// Codigo aqui.

			AlertaCustom alert = new AlertaCustom(AlertType.INFORMATION, "Informacion", "Aerolinea añadida",
					"La aerolinea ha sido añadido al sistema correctamente.");
			alert.showAndWait();

			thisstage.close();
		} else {
			AlertaCustom alert = new AlertaCustom(AlertType.ERROR, "Error", "Campo vacio",
					"Debe rellenar todos los campos.");
			alert.showAndWait();
		}
	}
}
