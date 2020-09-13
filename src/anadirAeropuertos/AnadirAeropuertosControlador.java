package anadirAeropuertos;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import modelo.AlertaCustom;

public class AnadirAeropuertosControlador {

	@FXML
	private TextField TextFieldCodigo;

	@FXML
	private TextField TextFieldNombre;

	@FXML
	private TextField TextFieldCiudad;

	@FXML
	private CheckBox CheckBoxEstadoAeropuerto;

	@FXML
	private CheckBox CheckBoxEstadoCiudad;

	@FXML
	private Button ButtonAnadirAeropuerto;

	private Stage thisstage;

	public void initialize(Stage stage) {
		this.thisstage = stage;
		thisstage.centerOnScreen();
	}

	public void buttonAnadirAeropuerto() {
		if (!TextFieldCodigo.getText().isEmpty() && !TextFieldNombre.getText().isEmpty()
				&& !TextFieldCiudad.getText().isEmpty()) {

			// Codigo aqui.

			AlertaCustom alert = new AlertaCustom(AlertType.INFORMATION, "Informacion", "Aeropuerto añadido",
					"El aeropuerto ha sido añadido al sistema correctamente.");
			alert.showAndWait();

			thisstage.close();
		} else {
			AlertaCustom alert = new AlertaCustom(AlertType.ERROR, "Error", "Campo vacio",
					"Debe rellenar todos los campos.");
			alert.showAndWait();
		}
	}
}