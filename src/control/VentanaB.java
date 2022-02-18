package control;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import model.EmailsData;
import model.Carro;

public class VentanaB implements Initializable {
	
	//recibir los datos de la ventanaA
	
	
	private String email;
	 @FXML
	 private TextArea textTA;
	
	    

	public VentanaB(String email) {
		this.email=email;
		
		
	}

  
    public void initialize (URL location, ResourceBundle resources) {
    	textTA.setText("Numero de carros: " +Carro.numCarros+ "\n");
    	fos (String email: EmailsData.emails){
    		textTA.appendText(email+ "\n\n");
    	}
    	
    }
    
    

	

    

}
