import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(getClass().getResource("View.fxml"));

        Scene scene = new Scene(loader.load());

        stage.setScene(scene);

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
    ///// This is the main class of the application. It is responsible for loading the FXML file and displaying the scene.
<<<<<<< HEAD
}
=======
}
>>>>>>> 760b6b3ef6be4f65e01e4ed3f568ca854d4dae53
