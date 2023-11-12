package proyectofxlibreriatc.proyectofxlibreriatc;

import entities.Menu; // Asegúrate de tener la importación correcta
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class ControllersI implements Initializable {
    @FXML
    private Controllers Controller;
    @FXML
    private ListView<String> myListView;
    @FXML
    private Label myLabel;

    Menu menu = new Menu(); // Instancia de la clase Menu para acceder a sus métodos

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // Obtener la lista de todos los títulos de los libros
        List<String> titulosLibros = menu.obtenerTodosLosTitulos();

        // Llenar el ListView con los títulos de los libros
        myListView.getItems().addAll(titulosLibros);

        // Agregar un listener al ListView para manejar la selección del usuario
        myListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                String currentTitle = myListView.getSelectionModel().getSelectedItem();
                myLabel.setText(currentTitle);
            }
        });
    }
}
