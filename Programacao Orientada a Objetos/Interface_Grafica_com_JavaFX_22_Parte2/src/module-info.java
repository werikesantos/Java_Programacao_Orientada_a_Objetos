module Interface_Grafica_com_JavaFX_22_Parte01 {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires jdk.compiler;
	
	opens application to javafx.graphics, javafx.fxml;
	opens gui to javafx.graphics, javafx.fxml;
}