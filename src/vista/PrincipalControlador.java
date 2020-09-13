package vista;

import java.util.Optional;

import anadirAerolineas.AnadirAerolineasControlador;
import anadirAeropuertos.AnadirAeropuertosControlador;
import anadirRutas.AnadirRutasControlador;
import anadirVuelos.AnadirVuelosControlador;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import modelo.Aerolinea;
import modelo.Aeropuerto;
import modelo.AlertaCustom;
import modelo.Ruta;
import modelo.Vuelo;

public class PrincipalControlador {

	@FXML
	private Button ButtonBuscarVuelos;

	@FXML
	private Button ButtonBuscarRutas;

	@FXML
	private Button ButtonBuscarAeropuertos;

	@FXML
	private Button ButtonBuscarAerolineas;

	@FXML
	private Button ButtonAnadirVuelos;

	@FXML
	private Button ButtonAnadirRutas;

	@FXML
	private Button ButtonAnadirAeropuertos;

	@FXML
	private Button ButtonAnadirAerolineas;

	@FXML
	private Button ButtonEliminarVuelos;

	@FXML
	private Button ButtonEliminarRutas;

	@FXML
	private Button ButtonEliminarAeropuertos;

	@FXML
	private Button ButtonEliminarAerolineas;

	@FXML
	private ComboBox<String> ComboBoxVuelos;

	@FXML
	private ComboBox<String> ComboBoxRutas;

	@FXML
	private ComboBox<String> ComboBoxAeropuertos;

	@FXML
	private ComboBox<String> ComboBoxAerolineas;

	@FXML
	private TextField TextFieldVuelos;

	@FXML
	private TextField TextFieldRutas;

	@FXML
	private TextField TextFieldAeropuertos;

	@FXML
	private TextField TextFieldAerolineas;

	@FXML
	private TableView<Vuelo> TableVuelos;

	@FXML
	private TableView<Ruta> TableRutas;

	@FXML
	private TableView<Aeropuerto> TableAeropuertos;

	@FXML
	private TableView<Aerolinea> TableAerolineas;

	private Stage thisstage;

	private String comboBoxVuelosDefaultValue;
	private String comboBoxRutasDefaultValue;
	private String comboBoxAeropuertosDefaultValue;
	private String comboBoxAerolineasDefaultValue;

	public void initialize(Stage stage) {
		this.thisstage = stage;
		thisstage.centerOnScreen();

		//Insertar informacion de prueba.
		comboBoxVuelosDefaultValue = ComboBoxVuelos.getValue();
		comboBoxRutasDefaultValue = ComboBoxRutas.getValue();
		comboBoxAeropuertosDefaultValue = ComboBoxAeropuertos.getValue();
		comboBoxAerolineasDefaultValue = ComboBoxAerolineas.getValue();

		ComboBoxVuelos.getItems().addAll("Aerolinea", "Aeropuerto de Origen", "Aeropuerto de Destino",
				"Hora de Salida");
		ComboBoxRutas.getItems().addAll("Codigo Ruta", "Aeropuerto de Origen", "Aeropuerto de Destino", "Estado");
		ComboBoxAeropuertos.getItems().addAll("Codigo Aeropuerto", "Nombre", "Ciudad", "Estado Aeropuerto",
				"Estado Ciudad");
		ComboBoxAerolineas.getItems().addAll("Codigo Aerolinea", "Nombre", "Estado");
		
		TableVuelos.getItems().add(null);
		TableRutas.getItems().add(null);
		TableAeropuertos.getItems().add(null);
		TableAerolineas.getItems().add(null);
	}

	public void buttonAnadirVuelos() {
		displayAnadirVuelosPage();
	}

	public void buttonAnadirRutas() {
		displayAnadirRutasPage();
	}

	public void buttonAnadirAeropuertos() {
		displayAnadirAeropuertosPage();
	}

	public void buttonAnadirAerolineas() {
		displayAnadirAerolineasPage();
	}

	public void buttonEliminarVuelos() {
		AlertaCustom alert = new AlertaCustom(AlertType.CONFIRMATION, "Confirmacion", "Eliminar vuelo",
				"¿Esta seguro de que desea eliminar este vuelo?");
		Optional<ButtonType> result = alert.showAndWait();
		if (result.get() == ButtonType.OK) {

			// Codigo aqui.

			alert.close();
		} else {
			alert.close();
		}
	}

	public void buttonEliminarRutas() {
		AlertaCustom alert = new AlertaCustom(AlertType.CONFIRMATION, "Confirmacion", "Eliminar ruta",
				"¿Esta seguro de que desea eliminar esta ruta?");
		Optional<ButtonType> result = alert.showAndWait();
		if (result.get() == ButtonType.OK) {

			// Codigo aqui.

			alert.close();
		} else {
			alert.close();
		}
	}

	public void buttonEliminarAeropuertos() {
		AlertaCustom alert = new AlertaCustom(AlertType.CONFIRMATION, "Confirmacion", "Eliminar aeropuerto",
				"¿Esta seguro de que desea eliminar este aeropuerto?");
		Optional<ButtonType> result = alert.showAndWait();
		if (result.get() == ButtonType.OK) {

			// Codigo aqui.

			alert.close();
		} else {
			alert.close();
		}
	}

	public void buttonEliminarAerolineas() {
		AlertaCustom alert = new AlertaCustom(AlertType.CONFIRMATION, "Confirmacion", "Eliminar aerolinea",
				"¿Esta seguro de que desea eliminar esta aerolinea?");
		Optional<ButtonType> result = alert.showAndWait();
		if (result.get() == ButtonType.OK) {

			// Codigo aqui.

			alert.close();
		} else {
			alert.close();
		}
	}

	public void buttonBuscarVuelos() {
		if (ComboBoxVuelos.getValue() != comboBoxVuelosDefaultValue && !TextFieldVuelos.getText().isEmpty()) {

			// Codigo aqui.

		} else {
			AlertaCustom alert = new AlertaCustom(AlertType.ERROR, "Error", "Campo vacio",
					"Debe rellenar los campos de busqueda.");
			alert.showAndWait();
		}
	}

	public void buttonBuscarRutas() {
		if (ComboBoxRutas.getValue() != comboBoxRutasDefaultValue && !TextFieldRutas.getText().isEmpty()) {

			// Codigo aqui.

		} else {
			AlertaCustom alert = new AlertaCustom(AlertType.ERROR, "Error", "Campo vacio",
					"Debe rellenar los campos de busqueda.");
			alert.showAndWait();
		}
	}

	public void buttonBuscarAeropuertos() {
		if (ComboBoxAeropuertos.getValue() != comboBoxAeropuertosDefaultValue
				&& !TextFieldAeropuertos.getText().isEmpty()) {

			// Codigo aqui.

		} else {
			AlertaCustom alert = new AlertaCustom(AlertType.ERROR, "Error", "Campo vacio",
					"Debe rellenar los campos de busqueda.");
			alert.showAndWait();
		}
	}

	public void buttonBuscarAerolineas() {
		if (ComboBoxAerolineas.getValue() != comboBoxAerolineasDefaultValue
				&& !TextFieldAerolineas.getText().isEmpty()) {

			// Codigo aqui.

		} else {
			AlertaCustom alert = new AlertaCustom(AlertType.ERROR, "Error", "Campo vacio",
					"Debe rellenar los campos de busqueda.");
			alert.showAndWait();
		}
	}

	private void displayAnadirVuelosPage() {
		Stage stage = new Stage();
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("/anadirVuelos/AnadirVuelosPagina.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);
			AnadirVuelosControlador manager = loader.getController();
			manager.initialize(stage);
			stage.setTitle("Anadir Vuelo");
			stage.getIcons().add(new Image("/icons/airplane.png"));
			stage.setScene(scene);
			stage.initModality(Modality.APPLICATION_MODAL);
			stage.showAndWait();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void displayAnadirRutasPage() {
		Stage stage = new Stage();
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("/anadirRutas/AnadirRutasPagina.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);
			AnadirRutasControlador manager = loader.getController();
			manager.initialize(stage);
			stage.setTitle("Anadir Ruta");
			stage.getIcons().add(new Image("/icons/airplane.png"));
			stage.setScene(scene);
			stage.initModality(Modality.APPLICATION_MODAL);
			stage.showAndWait();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void displayAnadirAeropuertosPage() {
		Stage stage = new Stage();
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("/anadirAeropuertos/AnadirAeropuertosPagina.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);
			AnadirAeropuertosControlador manager = loader.getController();
			manager.initialize(stage);
			stage.setTitle("Anadir Aeropuerto");
			stage.getIcons().add(new Image("/icons/airplane.png"));
			stage.setScene(scene);
			stage.initModality(Modality.APPLICATION_MODAL);
			stage.showAndWait();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void displayAnadirAerolineasPage() {
		Stage stage = new Stage();
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("/anadirAerolineas/AnadirAerolineasPagina.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);
			AnadirAerolineasControlador manager = loader.getController();
			manager.initialize(stage);
			stage.setTitle("Anadir Aerolinea");
			stage.getIcons().add(new Image("/icons/airplane.png"));
			stage.setScene(scene);
			stage.initModality(Modality.APPLICATION_MODAL);
			stage.showAndWait();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
