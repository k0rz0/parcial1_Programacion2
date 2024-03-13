package co.edu.uniquindio.parcial1fx.parcial1fx.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class TransportadoraController {
    @FXML
    private ToggleGroup nivel;

    @FXML
    private RadioButton rbEstandar;

    @FXML
    private RadioButton rbPremiun;

    @FXML
    private RadioButton rbVip;

    @FXML
    private TextField txtAccesorio;

    @FXML
    private TextField txtEdad;

    @FXML
    private TextField txtGenero;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtRaza;

    @FXML
    private TextArea txtResultado;

    @FXML
    private TextField txtTipoPeinado;

    @FXML
    void onAgregarPersonaje(ActionEvent event) {
        agregarPersonaje();
    }


    private void agregarPersonaje() {

        /*if(rbEstandar.isSelected()){
            Personaje personaje = Personaje.builder()
                    .nombre(txtNombre.getText())
                    .raza(txtRaza.getText())
                    .build();
            txtResultado.setText(personaje.toString());

        } else if (rbPremiun.isSelected()) {
            Personaje personaje = Personaje.builder()
                    .nombre(txtNombre.getText())
                    .raza(txtRaza.getText())
                    .edad(txtEdad.getText())
                    .genero(txtGenero.getText())
                    .build();
            txtResultado.setText(personaje.toString());
        }
        else{
            Personaje personaje = Personaje.builder()
                    .nombre(txtNombre.getText())
                    .raza(txtRaza.getText())
                    .edad(txtEdad.getText())
                    .genero(txtGenero.getText())
                    .tipoPeinado(txtTipoPeinado.getText())
                    .accesorio(txtAccesorio.getText())
                    .build();
            txtResultado.setText(personaje.toString());
        }*/
    }
}