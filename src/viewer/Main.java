package viewer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static final int IMAGE_WIDTH = 800;
    public static final int IMAGE_HEIGHT = 600;


    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("imageViewer.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, IMAGE_WIDTH, IMAGE_HEIGHT));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
