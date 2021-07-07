package gui;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;
import model.entities.Pessoa;

public class ViewController implements Initializable {

	@FXML
	private ComboBox<Pessoa> comboBoxPessoas;
	
	//COMANDO ABAIXO É UM COMANDO DO JAVAFX PARA TRABALHAR COM LISTA
	@FXML
	private ObservableList<Pessoa> obsPessoaLista;
	
	//PERCORRENDO A LISTA
	@FXML
	private Button botaoLista;
	
	//PERCORRENDO A LISTA
	@FXML
	public void onBotaoListaAction(){
		for(Pessoa pessoas : comboBoxPessoas.getItems()) {
			System.out.println(pessoas.getNome());
		}
	}
	
	@FXML
	public void onComboBoxAction(){
		//PEFANDO O ITEM SELECIONADO NO COMBOBOX
		Pessoa pessoa = comboBoxPessoas.getSelectionModel().getSelectedItem();
		System.out.println(pessoa.getNome());
	}

	@Override
	public void initialize(URL url, ResourceBundle rs) {
		List<Pessoa> pessoasLista = new ArrayList<Pessoa>();
		pessoasLista.add(new Pessoa(1, "Werike", "werike@gmail.com"));
		pessoasLista.add(new Pessoa(2, "Carlos", "carlos@gmail.com"));
		pessoasLista.add(new Pessoa(3, "Lucas", "lucas@gmail.com"));
		
		//AQUI É ADICIONADO A LISTA QUE SERÁ ADICIONADA AO "ObservableList" QUE SERÁ RESPONSÁVEL
		//PELACONVERSA ENTRE A MINHA LISTA E O COMBOBOX COMO MOSTRA A PRÓXIMA LINHA NO MÉDOTO "setItems"
		obsPessoaLista = FXCollections.observableArrayList(pessoasLista);
		comboBoxPessoas.setItems(obsPessoaLista);
		
		//O COMANDO ABAIXO SERVE PARA TROCAR O REGISTRO PARA PEGAR SOMENTE O NOME NO COMBOBOX
		Callback<ListView<Pessoa>, ListCell<Pessoa>> factory = lv -> new ListCell<Pessoa>() {
			@Override
			protected void updateItem(Pessoa item, boolean empty) {
				super.updateItem(item, empty);
				setText(empty ? "" : item.getNome());
			}
		};
		
		comboBoxPessoas.setCellFactory(factory);
		comboBoxPessoas.setButtonCell(factory.call(null));
	}
}