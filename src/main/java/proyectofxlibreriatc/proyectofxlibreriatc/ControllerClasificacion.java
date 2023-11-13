package proyectofxlibreriatc.proyectofxlibreriatc;

import entities.Menu;
import entities.Biblioteca;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Set;

public class ControllerClasificacion implements Initializable {
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private Button boton;

    //Cambio Escena
    @FXML
    protected void InicioS(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Inicio.fxml"));
        stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void MenuS(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/proyectofxlibreriatc/proyectofxlibreriatc/Menu.fxml"));
        stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void busquedaTituloS(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/proyectofxlibreriatc/proyectofxlibreriatc/TituloS.fxml"));
        stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void busquedaAutorS(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/proyectofxlibreriatc/proyectofxlibreriatc/AutorS.fxml"));
        stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void agregarLibroS(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/proyectofxlibreriatc/proyectofxlibreriatc/AgregarLibroS.fxml"));
        stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    //Lista Titulos
    @FXML
    private ListView<String> myListView;
    @FXML
    private Label label;
    @FXML
    private Label label1;
    @FXML
    private Label label2;
    @FXML
    private Label label3;

    String currentBook;
    Menu menu = new Menu();
    Biblioteca biblioteca = new Biblioteca();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            Set<String> obtenerTodasLasClasificaciones = biblioteca.obtenerTodasLasClasificaciones(currentBook);
            myListView.getItems().addAll(obtenerTodasLasClasificaciones);

            myListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
                @Override
                public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                    Set<String> autoresPorClasificacion = biblioteca.obtenerAutoresUnicosPorClasificacion(t1);

                    Set<String> titulosPorClasificacion = biblioteca.obtenerTitulosUnicosPorClasificacion(t1);

                    int cantidadTotalLibros = biblioteca.obtenerCantidadTotalLibrosPorClasificacion(t1);

                    label.setText(currentBook);
                    label1.setText(String.join(", ", autoresPorClasificacion));
                    label2.setText(String.join(", ", titulosPorClasificacion));
                    label3.setText(String.valueOf(cantidadTotalLibros));
                }
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}