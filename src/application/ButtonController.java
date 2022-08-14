package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class ButtonController {
	
	Stage sceneConditions;

    @FXML
    void OpenSlide2(ActionEvent event) {
    	Scene sceneC = new Scene((new Label("placeholfd")));
    	 sceneConditions.setScene(sceneC);
 
    }

}
