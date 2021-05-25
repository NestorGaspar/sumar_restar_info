package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.awt.*;


public class Ventana1Controller {


    Ventana2Controller controller2 = null;

    @FXML
    Button suma, resta;

    @FXML
    private void onButtonAbrirClicked() {
        try {
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Ventana2.fxml"));
            BorderPane root = (BorderPane) loader.load();
            Scene scene = new Scene(root, 450, 410);
            stage.setScene(scene);

            controller2 = loader.getController();

            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void sumarUno() {
        if (controller2 != null)
            controller2.sumarUno();
    }

    @FXML
    public void restarUno() {
        if (controller2 != null)
            controller2.restarUno();
    }

    public void  setButtonDisable(){
        suma.setEnabled(false);
        resta.setEnabled(false);
    }
    public void setButtonEnable(){
        suma.setEnabled(true);
        resta.setEnabled(true);
    }

}