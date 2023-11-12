package proyectofxlibreriatc.proyectofxlibreriatc;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controllers {
    @FXML
    private Label welcomeText;

    @FXML
    protected void busquedaTitulo() {
        welcomeText.setText("Busqueda por Titulo");
    }

    @FXML
    protected void busquedaAutor() {
        welcomeText.setText("Busqueda por Autor");
    }

    @FXML
    protected void busquedaClasificacion() {
        welcomeText.setText("Busqueda por Clasificacion");
    }

    @FXML
    protected void busquedaManual() {
        welcomeText.setText("Busqueda de manera Manual");
    }

}