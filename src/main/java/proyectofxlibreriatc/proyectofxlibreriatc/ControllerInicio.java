package proyectofxlibreriatc.proyectofxlibreriatc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.io.IOException;

public class ControllerInicio{
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private Button boton;

    //Cambio Escena
    @FXML
    protected void MenuS(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/proyectofxlibreriatc/proyectofxlibreriatc/Menu.fxml"));
        stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}