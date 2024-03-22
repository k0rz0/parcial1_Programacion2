package co.edu.uniquindio.parcial1fx.parcial1fx.factory;

import co.edu.uniquindio.parcial1fx.parcial1fx.TransportadoraApp;
import co.edu.uniquindio.parcial1fx.parcial1fx.model.*;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;

public class ModelFactory {

    private static ModelFactory modelFactory;
    private  Transportadora transportadora = Transportadora.builder().nombre("La Carreta").build();


    private ModelFactory(){
        inicializarDatos();
    }

    public static  ModelFactory getInstance(){
        if (modelFactory == null){
            modelFactory = new ModelFactory();
        }
        return modelFactory;
    }

    private void inicializarDatos() {

        /*Creacion de Propietarios*/
        Propietario propietario1 = Propietario.builder()
                .nombre("Leonardo")
                .cedula("123")
                .email("leo@email")
                .celular("321")
                .edad(35)
                .build();

        Propietario propietario2 = Propietario.builder()
                .nombre("Carlos")
                .cedula("456")
                .email("carlos@email")
                .celular("654")
                .edad(84)
                .build();

        Propietario propietario3 = Propietario.builder()
                .nombre("Camilo")
                .cedula("789")
                .email("cami@email")
                .celular("987")
                .edad(105)
                .build();


        transportadora.getListaPropietarios().add(propietario1);
        transportadora.getListaPropietarios().add(propietario2);
        transportadora.getListaPropietarios().add(propietario3);

        /*Creacion de vehiculos de carga*/
        VehiculoCarga vehiculoCarga1 = VehiculoCarga.builder()
                .capacidadCarga(7855)
                .numEjes(3)
                .marca("Chevrolet")
                .color("Rojo")
                .modelo("98")
                .placa("BYK78N")
                .build();

        VehiculoCarga vehiculoCarga2 = VehiculoCarga.builder()
                .capacidadCarga(5000)
                .numEjes(3)
                .marca("Chevrolet")
                .color("Rojo")
                .modelo("98")
                .placa("BYK78N")
                .build();

        VehiculoCarga vehiculoCarga3 = VehiculoCarga.builder()
                .capacidadCarga(15000)
                .numEjes(3)
                .marca("Chevrolet")
                .color("Rojo")
                .modelo("98")
                .placa("BYK78N")
                .build();

        transportadora.getListaVehiculosCarga().add(vehiculoCarga1);
        transportadora.getListaVehiculosCarga().add(vehiculoCarga2);
        transportadora.getListaVehiculosCarga().add(vehiculoCarga3);

        /*Creación de vehiculo de transporte y asignación de usuarios*/
        VehiculoTransporte vehiculoTransporte1 = VehiculoTransporte.builder()
                .MaxPasajeros(4)
                .marca("Toyota")
                .color("Gris")
                .modelo("24")
                .placa("YUI78P")
                .build();



        VehiculoTransporte vehiculoTransporte2 = VehiculoTransporte.builder()
                .MaxPasajeros(1)
                .marca("Renault")
                .color("Azul")
                .modelo("12")
                .placa("TDJ12T")
                .build();

        transportadora.getListaVehiculosTransporte().add(vehiculoTransporte1);
        transportadora.getListaVehiculosTransporte().add(vehiculoTransporte2);


        /* Creacion de usuarios Asignación de el vehiculo de trasnporte a los usuarios*/

        Usuario usuario1 = Usuario.builder()
                .edad(40)
                .peso(75)
                .nombre("Rodri")
                .vehiculoTransporte(vehiculoTransporte1)
                .build();

        Usuario usuario2 = Usuario.builder()
                .edad(12)
                .peso(120)
                .nombre("Cristian")
                .vehiculoTransporte(vehiculoTransporte1)
                .build();

        Usuario usuario3 = Usuario.builder()
                .edad(18)
                .peso(58)
                .nombre("Pedrito")
                .vehiculoTransporte(vehiculoTransporte2)
                .build();

        transportadora.getListaUsuarios().add(usuario1);
        transportadora.getListaUsuarios().add(usuario2);
        transportadora.getListaUsuarios().add(usuario3);

        vehiculoTransporte1.getListaUsuariosAsociados().add(usuario1);
        vehiculoTransporte1.getListaUsuariosAsociados().add(usuario2);
        vehiculoTransporte2.getListaUsuariosAsociados().add(usuario3);

    }



    public void crearPropietario(String nombre, String email, String cedula, String celular) {
        Propietario propietario = Propietario.builder()
                .nombre(nombre)
                .email(email)
                .celular(celular)
                .cedula(cedula)
                .build();

        transportadora.getListaPropietarios().add(propietario);

    }

    public void crearVehiculoCarga(String placa, String modelo, String marca, String color, String capacidad, String numEjes) {
        VehiculoCarga vehiculoCarga = VehiculoCarga.builder()
                .placa(placa)
                .modelo(modelo)
                .marca(marca)
                .color(color)
                .capacidadCarga(Double.parseDouble(capacidad))
                .numEjes(Integer.parseInt(numEjes))
                .build();

       transportadora.getListaVehiculosCarga().add(vehiculoCarga);

        /* return transportadora.obtenerVehiculosCarga();*/
    }

    public void crearVehiculoTransporte(String placa, String modelo, String marca, String color, String numPasajeros) {
        VehiculoTransporte vehiculoTransporte = VehiculoTransporte.builder()
                .placa(placa)
                .modelo(modelo)
                .marca(marca)
                .color(color)
                .MaxPasajeros(Integer.parseInt(numPasajeros))
                .build();

        transportadora.getListaVehiculosTransporte().add(vehiculoTransporte);

    }
    public void crearUsuario(String edad) {

        Usuario usuario = Usuario.builder()
                .edad(Integer.parseInt(edad))
                .build();

        transportadora.getListaUsuarios().add(usuario);

    }

    public String obtenerPropietariosMayoresde40() {
        return transportadora.obtenerPropietariosMayoresde40();
    }
    public String obtenerUsuariosPorPeso( double peso) {
        return transportadora.obtenerUsuariosPorPeso(peso);
    }
    public String obtenerUsuariosPorPlaca( String placa) {
        return transportadora.obtenerUsuariosPorPlaca(placa);
    }

    public List<Propietario> ObtenerDatosPropietario() {
        List<Propietario> listPropietarios = new ArrayList<>();
        listPropietarios = transportadora.getListaPropietarios();
        return listPropietarios;
    }


    public void eliminarPropietario(String cedula) {
        transportadora.eliminarPropietario(cedula);
    }

    public void actualizarPropietario(String nombre, String email, String cedula, String celular) {

        transportadora.actualizarPropietario(nombre,email,cedula,celular);

        crearPropietario(nombre,email,cedula,celular);
    }
}
