package co.edu.uniquindio.parcial1fx.parcial1fx.controller;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.parcial1fx.parcial1fx.factory.ModelFactory;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class TransportadoraController {

    ModelFactory modelFactory;

    @FXML
    void initialize() {
        modelFactory = ModelFactory.getInstance();
    }

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btAgregarVehiculoTransporte;

    @FXML
    private Button btnAgregarPropietario;

    @FXML
    private Button btnAgregarUsuario;

    @FXML
    private Button btnAgregarVehiculoCarga;

    @FXML
    private Button btnObtenerPropietariosMayor40;

    @FXML
    private Button btnObtenerUsuariosPorPeso;

    @FXML
    private Button btnObtenerUsuariosPorPlaca;

    @FXML
    private TextField txtCapacidadCarga;

    @FXML
    private TextField txtCedulaPropietario;

    @FXML
    private TextField txtCelularPropietario;

    @FXML
    private TextField txtColorCarga;

    @FXML
    private TextField txtColorTransporte;

    @FXML
    private TextField txtEdadUsuario;

    @FXML
    private TextField txtEmailPropietario;

    @FXML
    private TextField txtMarcaCarga;

    @FXML
    private TextField txtMarcaTransporte;

    @FXML
    private TextField txtModeloCarga;

    @FXML
    private TextField txtModeloTransporte;

    @FXML
    private TextField txtNombrePropietario;

    @FXML
    private TextField txtNumEjesCarga;

    @FXML
    private TextField txtNumMaxPasajerosTransporte;

    @FXML
    private TextField txtPlacaCarga;

    @FXML
    private TextField txtPlacaTransporte;

    @FXML
    private TextField txtPlacaVehiculoBusqueda;

    @FXML
    private TextArea txtResultadoBusquedas;

    @FXML
    private TextField txtUsuariosPesoBusqueda;

    @FXML
    void onAgregarPropietario(ActionEvent event) {
        crearPropietario();
    }
    @FXML
    void onAgregarVehiculoCarga(ActionEvent event) {crearVehiculoCarga();}
    @FXML
    void onAgregarVehiculoTransporte(ActionEvent event) {crearVehiculoTransporte();}
    @FXML
    void onAgregarUsuario(ActionEvent event) {crearUsuario();}

    @FXML
    void onMayores40(ActionEvent event) {
        obtenerPropietariosMayoresde40();
    }

    @FXML
    void onUsuariosPorPeso(ActionEvent event) {
        obtenerUsuariosPorPeso(Double.parseDouble(txtUsuariosPesoBusqueda.getText()));
    }

    @FXML
    void onUsuariosPorPlaca(ActionEvent event) {
        obtenerUsuariosPorPlaca(txtPlacaVehiculoBusqueda.getText());
    }

    private void obtenerPropietariosMayoresde40() {
        String resultado = modelFactory.obtenerPropietariosMayoresde40();
        txtResultadoBusquedas.setText(resultado);
    }

    private void obtenerUsuariosPorPeso(Double peso) {
        String resultado = modelFactory.obtenerUsuariosPorPeso(peso);
        txtResultadoBusquedas.setText(resultado);
    }

    private void obtenerUsuariosPorPlaca(String placa) {
        String resultado = modelFactory.obtenerUsuariosPorPlaca(placa);
        txtResultadoBusquedas.setText(resultado);
    }

    private void crearPropietario() {
        modelFactory.crearPropietario(
                txtNombrePropietario.getText()
                ,txtEmailPropietario.getText()
                ,txtCedulaPropietario.getText()
                ,txtCelularPropietario.getText());

        /*txtResultadoBusquedas.setText(propietarios);*/
    }
    private void crearVehiculoCarga() {

        /*if(!txtNumEjesCarga.getText().isEmpty())*/

        modelFactory.crearVehiculoCarga(
                txtPlacaCarga.getText(),
                txtModeloCarga.getText(),
                txtMarcaCarga.getText(),
                txtColorCarga.getText(),
                txtCapacidadCarga.getText(),
                txtNumEjesCarga.getText());

        /*txtResultadoBusquedas.setText(vehiculos);*/
    }

    private void crearVehiculoTransporte() {
        modelFactory.crearVehiculoTransporte(
                txtPlacaTransporte.getText(),
                txtModeloTransporte.getText(),
                txtMarcaTransporte.getText(),
                txtColorTransporte.getText(),
                txtNumMaxPasajerosTransporte.getText()
        );

    }

    private void crearUsuario() {
        modelFactory.crearUsuario(
                txtEdadUsuario.getText()
        );
    }


}
