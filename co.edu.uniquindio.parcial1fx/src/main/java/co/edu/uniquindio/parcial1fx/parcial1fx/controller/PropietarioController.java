package co.edu.uniquindio.parcial1fx.parcial1fx.controller;


import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import co.edu.uniquindio.parcial1fx.parcial1fx.factory.ModelFactory;
import co.edu.uniquindio.parcial1fx.parcial1fx.model.Propietario;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;

public class PropietarioController {
    ModelFactory modelFactory;

    @FXML
    private ResourceBundle resources;

    @FXML
    private Button btnFiltrar;

    @FXML
    private TextField txtFiltrar;
    @FXML
    private URL location;

    @FXML
    private Button btnActualizarPropietario;

    @FXML
    private Button btnAgregarPropietario;

    @FXML
    private Button btnEliminarPropietario;

    @FXML
    private TextField txtCedulaPropietario;

    @FXML
    private TextField txtCelularPropietario;

    @FXML
    private TextField txtEmailPropietario;

    @FXML
    private TextField txtNombrePropietario;


    @FXML
    private TableColumn<Propietario, String> colCedula;

    @FXML
    private TableColumn<Propietario, String> colCelular;

    @FXML
    private TableColumn<Propietario, String> colEmail;

    @FXML
    private TableColumn<Propietario, String> colNombre;


    @FXML
    private TableView<Propietario> tablePropietarios;
    @FXML
    void initialize() {
        modelFactory = ModelFactory.getInstance();

        // Configurar las celdas de las columnas para que muestren los valores de los atributos
        colNombre.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombre()));
        colEmail.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getEmail()));
        colCedula.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCedula()));
        colCelular.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCelular()));

        insertarDatos();
    }

    private void insertarDatos() {
        List<Propietario> propietariosList = modelFactory.ObtenerDatosPropietario();
        ObservableList<Propietario> propietariosObservableList = FXCollections.observableArrayList(propietariosList);
        tablePropietarios.setItems(propietariosObservableList);
    }

    @FXML
    void onActualizarPropietario(ActionEvent event) {
        modelFactory.actualizarPropietario(txtNombrePropietario.getText()
                ,txtEmailPropietario.getText()
                ,txtCedulaPropietario.getText()
                ,txtCelularPropietario.getText());

        insertarDatos();
    }

    @FXML
    void onAgregarPropietario(ActionEvent event) {

        modelFactory.crearPropietario(
                txtNombrePropietario.getText()
                ,txtEmailPropietario.getText()
                ,txtCedulaPropietario.getText()
                ,txtCelularPropietario.getText());

        insertarDatos();
    }

    @FXML
    void onEliminarPropietario(ActionEvent event) {
        modelFactory.eliminarPropietario(txtCedulaPropietario.getText());

        insertarDatos();

    }
    @FXML
    void onFiltrar(ActionEvent event) {
        List<Propietario> propietariosList = modelFactory.ObtenerDatosPropietario();
        ObservableList<Propietario> propietariosObservableList = FXCollections.observableArrayList(propietariosList);

        FilteredList<Propietario> filteredData = new FilteredList<>(propietariosObservableList, p -> true);

        // Configura el predicado del filtro siempre que el filtro cambie.
        filteredData.setPredicate(propietario -> {
            // Si el campo de filtro está vacío, muestra todos los propietarios.
            if (txtFiltrar.getText() == null || txtFiltrar.getText().isEmpty()) {
                return true;
            }

            // Compara la cédula del propietario con el texto del filtro.
            String lowerCaseFilter = txtFiltrar.getText().toLowerCase();

            if (propietario.getCedula().toLowerCase().contains(lowerCaseFilter)) {
                return true; // El filtro coincide con la cédula.
            }
            return false; // No hay coincidencia.
        });

        // Envuelve el FilteredList en un SortedList.
        SortedList<Propietario> sortedData = new SortedList<>(filteredData);

        // Vincula el comparador del SortedList al comparador de la TableView.
        // Esto es necesario para que el ordenamiento funcione.
        sortedData.comparatorProperty().bind(tablePropietarios.comparatorProperty());

        // Añade los datos filtrados (y ordenados) a la tabla.
        tablePropietarios.setItems(sortedData);
    }




}
