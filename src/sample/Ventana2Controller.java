package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Ventana2Controller {

    int contador = 0;

    Ventana1Controller controller1 = null;

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

    @FXML
    public void onClickCheckBox(){
        if(checkBox.isSelected())
            controller1.botonApagado();
        else
            controller1.botonEncendido();
    }

    public void informacionEntreVentanas(Ventana1Controller ventana1Controller){
        controller1 = ventana1Controller;
    }

    public void sumarUno() {
        contador++;
        sumatorio.setText(String.valueOf(contador));

    }

    public void restarUno() {
        contador--;
        sumatorio.setText(String.valueOf(contador));
    }

}
