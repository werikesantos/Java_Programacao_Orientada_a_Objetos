package gui;

import gui.util.Alerts;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ViewController {

	@FXML
	private TextField primeiroNumero;
	@FXML
	private TextField segundoNumero;
	@FXML
	private Button botaoSomar;
	
	public void somarBotao(ActionEvent evento){
		try{
			int primeiro = Integer.parseInt(primeiroNumero.getText());
			int segundo = Integer.parseInt(segundoNumero.getText());
			
			String result = Integer.toString(primeiro + segundo);
			
			Alerts.showAlert("Somar", null, "Resultado: "+result, AlertType.INFORMATION);
		
		}catch(NumberFormatException e) {
			Alerts.showAlert("Erro", null, e.getMessage(), AlertType.ERROR);
		}
	}
}