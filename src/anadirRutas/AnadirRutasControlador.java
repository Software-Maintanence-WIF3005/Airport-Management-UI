package anadirRutas;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import modelo.AlertaCustom;

public class AnadirRutasControlador {

	@FXML
	private TextField TextFieldCodigo;

	@FXML
	private ComboBox<String> ComboBoxAeropuertosOrigen;

	@FXML
	private ComboBox<String> ComboBoxAeropuertosDestino;

	@FXML
	private CheckBox CheckBoxEstado;

	@FXML
	private Button ButtonAnadirRuta;

	private Stage thisstage;

	private String textFieldCodigoDefaultValue;
	private String comboBoxAeropuertosOrigenDefaultValue;
	private String comboBoxAeropuertosDestinoDefaultValue;

	public void initialize(Stage stage) {
		this.thisstage = stage;
		thisstage.centerOnScreen();

		//Insertar informacion de prueba.
		textFieldCodigoDefaultValue = TextFieldCodigo.getText();
		comboBoxAeropuertosOrigenDefaultValue = ComboBoxAeropuertosOrigen.getValue();
		comboBoxAeropuertosDestinoDefaultValue = ComboBoxAeropuertosDestino.getValue();

		ComboBoxAeropuertosOrigen.getItems().addAll("Barajas - Madrid", "Linate - Milan", "Malpensa - Mialn",
				"Bergamo - Milan", "El Prat - Barcelona");
		ComboBoxAeropuertosDestino.getItems().addAll("Barajas - Madrid", "Linate - Milan", "Malpensa - Mialn",
				"Bergamo - Milan", "El Prat - Barcelona");
	}

	public void buttonAnadirRuta() {
		if (TextFieldCodigo.getText() != textFieldCodigoDefaultValue
				&& ComboBoxAeropuertosOrigen.getValue() != comboBoxAeropuertosOrigenDefaultValue
				&& ComboBoxAeropuertosDestino.getValue() != comboBoxAeropuertosDestinoDefaultValue) {

			// Codigo aqui.

			AlertaCustom alert = new AlertaCustom(AlertType.INFORMATION, "Informacion", "Ruta añadida",
					"La ruta ha sido añadida al sistema correctamente.");
			alert.showAndWait();

			thisstage.close();
		} else {
			AlertaCustom alert = new AlertaCustom(AlertType.ERROR, "Error", "Campo vacio",
					"Debe rellenar todos los campos.");
			alert.showAndWait();
		}
	}
}