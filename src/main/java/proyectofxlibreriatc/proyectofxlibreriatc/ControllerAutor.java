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
import java.util.List;
import java.util.ResourceBundle;

public class ControllerAutor implements Initializable {
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
    protected void busquedaClasificacionS(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/proyectofxlibreriatc/proyectofxlibreriatc/ClasificacionS.fxml"));
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

    String currentAuthor;
    Menu menu = new Menu();
    Biblioteca biblioteca = new Biblioteca();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            List<String> autores = menu.obtenerTodosLosAutores();
            myListView.getItems().addAll(autores);

            myListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
                @Override
                public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                    currentAuthor = myListView.getSelectionModel().getSelectedItem();
                    label.setText(currentAuthor);

                    List<String> titulosAutor = biblioteca.obtenerTitulosPorAutor(currentAuthor);
                    String titulos = String.join(", ", titulosAutor);
                    label1.setText(titulos);

                    int cantidadTotal = biblioteca.obtenerCantidadTotalLibrosPorAutor(currentAuthor);
                    label3.setText(String.valueOf(cantidadTotal));

                    List<String> cantidadTotalC = biblioteca.obtenerClasificacionesPorAutor(currentAuthor);
                    label2.setText(String.valueOf(cantidadTotalC));
                }
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}