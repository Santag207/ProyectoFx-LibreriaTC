package proyectofxlibreriatc.proyectofxlibreriatc;

import entities.Menu;
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

public class Controllers implements Initializable{
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
        Parent root = FXMLLoader.load(getClass().getResource("/proyectofxlibreriatc/proyectofxlibreriatc/TituloS.fxml"));
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

    protected void DatosLibroS(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/proyectofxlibreriatc/proyectofxlibreriatc/DatosLibroS.fxml"));
        stage = (Stage)((Button) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    //Lista Titulos
        @FXML
        private ListView<String> myListView;
        @FXML
        private Label myLabel;

        Menu menu = new Menu();

        @Override
        public void initialize(URL arg0, ResourceBundle arg1) {
            List<String> titulosLibros = menu.obtenerTodosLosTitulos();
            myListView.getItems().addAll(titulosLibros);
            myListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
                @Override
                public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                    String currentTitle = myListView.getSelectionModel().getSelectedItem();
                    myLabel.setText(currentTitle);
                }
            });
        }
    }

}