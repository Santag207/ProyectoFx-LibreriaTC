package proyectofxlibreriatc.proyectofxlibreriatc;

import entities.Libro;
import entities.Biblioteca;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerAgregarLibroS {
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private Button boton;

    @FXML
    private TextField tituloField;

    @FXML
    private TextField autorField;

    @FXML
    private TextField clasificacionField;

    @FXML
    private TextField cantidadField;

    @FXML
    private Label resultadoLabel;

    private Biblioteca biblioteca;

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
    protected void busquedaClasificacionS(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/proyectofxlibreriatc/proyectofxlibreriatc/ClasificacionS.fxml"));
        stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void initialize() {
        biblioteca = new Biblioteca();
    }

    @FXML
    private void agregarLibroManualmente(ActionEvent event) throws IOException {
        String titulo = tituloField.getText();
        String autor = autorField.getText();
        String clasificacion = clasificacionField.getText();

        try {
            int cantidad = Integer.parseInt(cantidadField.getText());
            Libro libro = new Libro(titulo, autor, clasificacion, cantidad);
            biblioteca.agregarLibro(libro);
            mostrarMensaje("Libro agregado con éxito");
        } catch (NumberFormatException e) {
            mostrarMensaje("Error: La cantidad debe ser un número entero.");
            return;  // Salir del método si la cantidad no es un número válido.
        }

        //Cambio Escena
        Parent root = FXMLLoader.load(getClass().getResource("/proyectofxlibreriatc/proyectofxlibreriatc/Menu.fxml"));
        stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    private void mostrarMensaje(String mensaje) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Información");
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }
}
