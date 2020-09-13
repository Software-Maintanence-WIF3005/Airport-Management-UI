package modelo;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DialogPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class AlertaCustom extends Alert {
	
	private static final String STYLESHEET = AlertaCustom.class.getResource("/application/bootstrap3.css").toExternalForm();

	public AlertaCustom(AlertType alertType, String title, String header, String content) {
		super(alertType);
		
		DialogPane dialogPane = super.getDialogPane();
		Stage stage = (Stage) dialogPane.getScene().getWindow();
		
		dialogPane.getStylesheets().add(STYLESHEET);
		
		super.setTitle(title);
    	super.setHeaderText(header);
    	super.setContentText(content);
		
        if (alertType == AlertType.NONE) {
            return;
        }
        
        switch (alertType) {
            case CONFIRMATION:
            	//Warning amarillo
        		stage.getIcons().add(new Image("/icons/alert-outline.png"));
        		super.setGraphic(new ImageView(new Image("/icons/alert-outline-white.png")));
        		
        		dialogPane.getStyleClass().add("warning");
        		dialogPane.lookupButton(ButtonType.OK).getStyleClass().add("success");
        		dialogPane.lookupButton(ButtonType.CANCEL).getStyleClass().add("danger");
        		
                break;
            case ERROR:
            	//Error rojo
    			stage.getIcons().add(new Image("/icons/close-box-outline.png"));
    			super.setGraphic(new ImageView(new Image("/icons/close-box-outline-white.png")));
    			
    			dialogPane.getStyleClass().add("error");
    			dialogPane.lookupButton(ButtonType.OK).getStyleClass().add("success");
            	
                break;
            case INFORMATION:
            	//Correcto verde
    			stage.getIcons().add(new Image("/icons/check-circle-outline.png"));
    			super.setGraphic(new ImageView(new Image("/icons/check-circle-outline-white.png")));
    			
    			dialogPane.getStyleClass().add("correcto");
    			dialogPane.lookupButton(ButtonType.OK).getStyleClass().add("success");
            	
                break;
            case WARNING:
    			stage.getIcons().add(new Image(""));
    			dialogPane.lookupButton(ButtonType.OK).getStyleClass().add("success");
        		
                break;
            default:
                // Never happens.
        }

	}

}
