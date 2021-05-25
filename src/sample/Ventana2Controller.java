package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Ventana2Controller {

    int contador = 0;

    private Ventana1Controller controller1;

    @FXML
    CheckBox checkBox;

    @FXML
    Label sumatorio;

    @FXML
    private Button buttonCerrarVentana;

    @FXML
    private void onButtonCerrarVentanaClicked() {
        Stage stage = (Stage) buttonCerrarVentana.getScene().getWindow();
        stage.close();
    }

    public void sumarUno() {
        contador++;
        sumatorio.setText(String.valueOf(contador));

    }

    public void restarUno() {
        contador--;
        sumatorio.setText(String.valueOf(contador));
    }

    @FXML
    public void onClickCheckBox(){
        if(checkBox.isSelected())
            controller1.setButtonDisable();
        else
            controller1.setButtonEnable();
    }

}
