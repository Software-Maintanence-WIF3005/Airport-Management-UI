package anadirVuelos;

import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;
import modelo.AlertaCustom;

public class AnadirVuelosControlador {

	@FXML
	private ComboBox<String> ComboBoxAerolineas;

	@FXML
	private ComboBox<String> ComboBoxRutas;

	@FXML
	private ComboBox<String> ComboBoxHoras;

	@FXML
	private Button ButtonAnadirVuelo;

	private Stage thisstage;

	private String comboBoxAerolineasDefaultValue;
	private String comboBoxRutasDefaultValue;
	private String comboBoxHorasDefaultValue;

	public void initialize(Stage stage) {
		this.thisstage = stage;
		thisstage.centerOnScreen();

		//Insertar informacion de prueba.
		comboBoxAerolineasDefaultValue = ComboBoxAerolineas.getValue();
		comboBoxRutasDefaultValue = ComboBoxRutas.getValue();
		comboBoxHorasDefaultValue = ComboBoxHoras.getValue();

		ComboBoxAerolineas.getItems().addAll("Iberia", "Ryanair", "Air Europa");
		ComboBoxRutas.getItems().addAll("Madrid - Barajas / Milan - Linate", "Milan - Bergamo / Madrid - Barajas",
				"Barcelona - El Prat / Madrid - Barajas");
		ComboBoxHoras.getItems().addAll("00:00", "08:00", "16:00", "24:00");
	}

	public void buttonAnadirVuelo() {
		if (ComboBoxAerolineas.getValue() != comboBoxAerolineasDefaultValue
				&& ComboBoxRutas.getValue() != comboBoxRutasDefaultValue
				&& ComboBoxHoras.getValue() != comboBoxHorasDefaultValue) {

			// Codigo aqui.

			AlertaCustom alert = new AlertaCustom(AlertType.INFORMATION, "Informacion", "Vuelo añadido",
					"El vuelo ha sido añadido al sistema correctamente.");
			alert.showAndWait();

			thisstage.close();
		} else {
			AlertaCustom alert = new AlertaCustom(AlertType.ERROR, "Error", "Campo vacio",
					"Debe rellenar todos los campos.");
			alert.showAndWait();
		}
	}
}
