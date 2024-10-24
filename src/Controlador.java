import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Controlador {

    boolean pulsar = true;
    @FXML
    Pane principal;

    @FXML
    Circle bola;

    @FXML
    public void direccion(MouseEvent evento) {
        if (pulsar){
            bola.setFill(Color.PINK);
            pulsar = false;
        } else {
            bola.setFill(Color.GREEN);
            pulsar = true;
        }
    }
}
