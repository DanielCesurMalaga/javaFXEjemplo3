import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage ventana) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("vista.fxml"));

        ventana.setScene(new Scene(root,800,600));
        ventana.show();
    }
}
