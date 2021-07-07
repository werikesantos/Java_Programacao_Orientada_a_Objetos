package gui;

import java.net.URL;
import java.util.ResourceBundle;

import gui.util.Alerts;
import gui.util.Constraints;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ViewController implements Initializable {

	@FXML
	private TextField primeiroNumero;
	@FXML
	private TextField segundoNumero;
	@FXML
	private Button botaoSomar;
	
	@FXML
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

	@Override
	public void initialize(URL url, ResourceBundle rs) {
		//LIMITANDO O TAMANHO DO CAMPO "TextField".
		Constraints.setTextFieldMaxLength(primeiroNumero, 6);
		Constraints.setTextFieldMaxLength(segundoNumero, 6);
		
		//VALIDANDO OS CAMPOS "TextField" PARA ACEITAR SOMENTE NUMEROS.
		Constraints.setTextFieldInteger(primeiroNumero);
		Constraints.setTextFieldInteger(segundoNumero);
	}
}