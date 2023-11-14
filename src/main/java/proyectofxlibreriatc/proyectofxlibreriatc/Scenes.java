package proyectofxlibreriatc.proyectofxlibreriatc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Scenes extends Application {
    @Override
    public void start(Stage Stage) throws Exception {
        Scene scene1 = null;
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Inicio.fxml"));
            scene1 = new Scene(root);
            Stage.setScene(scene1);
            Stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }

        Stage.setResizable(false);
        /*Stage.setTitle("Libreria VirtualBooks");
        Image icon = new Image("/logo.png");
        Stage.getIcons().add(icon);*/

        Stage.setTitle("Libreria VirtualBooks"); //Nombre aplicacion
        Stage.setScene(scene1);
        Stage.show();


        /*Stage.setFullScreen(true);//Pantalla Completa

        Image image = new Image("C:\\Users\\santi\\IdeaProjects\\Proyecto Fx - Libreria TC\\src\\fondo1.png");
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(300);
        imageView.setFitWidth(300);
        imageView.setX(440);
        imageView.setY(235);
        root.getChildren().add(imageView);*/
    }

    public static void main(String[] args) {
        launch();
    }
}
