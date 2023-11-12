package proyectofxlibreriatc.proyectofxlibreriatc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Scenes extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root  = new Group();
        Scene scene = new Scene(root, Color.DARKSLATEGRAY);

        Image icon = new Image("C:\\Users\\santi\\IdeaProjects\\Proyecto Fx - Libreria TC\\src\\logo.png");//Logo aplicacion
        primaryStage.getIcons().add(icon);
        primaryStage.setWidth(1200);//Ancho
        primaryStage.setHeight(700);//Alto
        primaryStage.setX(380);
        primaryStage.setY(170);

        primaryStage.setResizable(false);
        //stage.setFullScreen(true);//Pantalla Completa

        Text text1 = new Text();
        text1.setText("Bienvenido");
        text1.setX(450);
        text1.setY(100);
        text1.setText("History Book");
        text1.setX(430);
        text1.setY(150);
        text1.setFont(Font.font("Verdana", 50));
        text1.setFill(Color.WHITE);

        Text text2 = new Text();
        text2.setText("History Book");
        text2.setX(430);
        text2.setY(150);
        text2.setFont(Font.font("Verdana", 50));
        text2.setFill(Color.WHITE);

        Image image = new Image("C:\\Users\\santi\\IdeaProjects\\Proyecto Fx - Libreria TC\\src\\fondo1.png");
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(300);
        imageView.setFitWidth(300);
        imageView.setX(450);
        imageView.setY(200);

        root.getChildren().add(text1);
        root.getChildren().add(text2);
        root.getChildren().add(imageView);

        primaryStage.setTitle("Libreria"); //Nombre aplicacion
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void Menu (Stage secondStage) throws  Exception{
        try {
            Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
            Scene scene = new Scene(root);
            secondStage.setScene(scene);
            secondStage.show();

        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
        launch();
    }
}
