package co.edu.uniquindio.parcial1fx.parcial1fx.model.builder;

import co.edu.uniquindio.parcial1fx.parcial1fx.model.*;

import java.util.ArrayList;
import java.util.List;

public class TransportadoraBuilder {
    protected String nombre;
    protected List<Propietario> listaPropietarios = new ArrayList<>();
    protected  List<Vehiculo> listavehiculos = new ArrayList<>();
    protected  List<VehiculoCarga> listaVehiculosCarga = new ArrayList<>();
    protected  List<VehiculoTransporte> listaVehiculosTransporte = new ArrayList<>();
    protected  List<Usuario> listaUsuarios = new ArrayList<>();

    public TransportadoraBuilder nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public TransportadoraBuilder listaPropietarios(List<Propietario> listaPropietarios) {
        this.listaPropietarios = listaPropietarios;
        return this;
    }

    public TransportadoraBuilder listavehiculos(List<Vehiculo> listavehiculos) {
        this.listavehiculos = listavehiculos;
        return this;
    }

    public TransportadoraBuilder listaVehiculosCarga(List<VehiculoCarga> listaVehiculosCarga) {
        this.listaVehiculosCarga = listaVehiculosCarga;
        return this;
    }

    public TransportadoraBuilder listaVehiculosTransporte(List<VehiculoTransporte> listaVehiculosTransporte) {
        this.listaVehiculosTransporte = listaVehiculosTransporte;
        return this;
    }

    public TransportadoraBuilder listaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
        return this;
    }

    public Transportadora build() {
        return new Transportadora(nombre, listaPropietarios, listavehiculos, listaVehiculosCarga, listaVehiculosTransporte, listaUsuarios);
    }

}
