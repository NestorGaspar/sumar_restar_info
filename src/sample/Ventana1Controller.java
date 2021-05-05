package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;



public class Ventana1Controller {

    Ventana2Controller controller = null;

    @FXML
    private void onButtonAbrirClicked() {
        try {
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Ventana2.fxml"));
            BorderPane root = (BorderPane) loader.load();
            Scene scene = new Scene(root, 450, 410);
            stage.setScene(scene);

            controller = loader.getController();
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void sumarUno() {
        if (controller != null)
            controller.sumarUno();
    }

    @FXML
    public void restarUno() {
        if (controller != null)
            controller.restarUno();
    }

}