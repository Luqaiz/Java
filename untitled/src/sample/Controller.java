package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

import java.time.LocalDate;

public class Controller {

    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtApellido;
    @FXML
    private TextField txtDireccion;
    @FXML
    private ComboBox txtLocalidad;
    @FXML
    private DatePicker txtFecha;
    @FXML
    private CheckBox txtCierre;
    @FXML
    private Button txtBoton;
    @FXML
    private Button txtBotonDos;

    public void aceptar (MouseEvent args){
        if (txtNombre.getText().equals(""))
        {
            System.out.println("complete el nombre");
        }
    }

    public void initialize (){
        txtFecha.setValue(LocalDate.now());
        txtLocalidad.setValue("banfield");
        txtLocalidad.setItems(listaLoc);
    }

    ObservableList <String> listaLoc = FXCollections.observableArrayList("banfield","adrogue","avellaneda");
}
