package proyectofxlibreriatc.proyectofxlibreriatc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.io.IOException;

public class Controllers {
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private Label welcomeText;
    @FXML
    private Button boton;

    //Basicos
    @FXML
    void entradaMouseI(){
        boton.setStyle("-fx-background-color: #000000; -fx-text-fill: #ffffff;");
    }

    @FXML
    void salidaMouseI(){
        boton.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #000000;");
    }

    @FXML
    void entraraMouseS(){
        boton.setStyle("-fx-background-color: # #4a7d4a; -fx-text-fill: #ffffff;");
    }

    @FXML
    void salidaMouseS(){
        boton.setStyle("-fx-background-color: #1b2922; -fx-text-fill: #ffffff;");
    }


    //Cambio Escena
    @FXML
    protected void InicioS(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Inicio.fxml"));
        stage = (Stage)((Button) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void MenuS(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/proyectofxlibreriatc/proyectofxlibreriatc/Menu.fxml"));
        stage = (Stage)((Button) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void busquedaTituloS(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("proyectofxlibreriatc/proyectofxlibreriatc/TituloS.fxml"));
        stage = (Stage)((Button) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void busquedaAutorS(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/proyectofxlibreriatc/proyectofxlibreriatc/AutorS.fxml"));
        stage = (Stage)((Button) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void busquedaClasificacionS(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/proyectofxlibreriatc/proyectofxlibreriatc/ClasificacionS.fxml"));
        stage = (Stage)((Button) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void busquedaManualS(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Menu.fxml"));
        stage = (Stage)((Button) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void agregarLibroS(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/proyectofxlibreriatc/proyectofxlibreriatc/AgregarLibroS.fxml"));
        stage = (Stage)((Button) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}