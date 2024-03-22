package co.edu.uniquindio.parcial1fx.parcial1fx.model.builder;

import co.edu.uniquindio.parcial1fx.parcial1fx.model.Usuario;
import co.edu.uniquindio.parcial1fx.parcial1fx.model.VehiculoTransporte;

import java.util.ArrayList;
import java.util.List;

public class VehiculoTransporteBuilder extends VehiculoBuilder<VehiculoTransporteBuilder> {
    private int MaxPasajeros;
    private List<Usuario> listaUsuariosAsociados = new ArrayList<>();

    /*public VehiculoTransporteBuilder placa(String placa) {
        this.placa = placa;
        return this;
    }
    public VehiculoTransporteBuilder modelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public VehiculoTransporteBuilder marca(String marca) {
        this.marca = marca;
        return this;
    }

    public VehiculoTransporteBuilder color(String color) {
        this.color = color;
        return this;
    }*/

    public VehiculoTransporteBuilder MaxPasajeros(int MaxPasajeros) {
        this.MaxPasajeros = MaxPasajeros;
        return this;
    }

    public VehiculoTransporteBuilder ListaUsuariosAsociados(List<Usuario> listaUsuariosAsociados) {
        this.listaUsuariosAsociados = listaUsuariosAsociados;
        return this;
    }

    @Override
    public VehiculoTransporte build() {
        return new VehiculoTransporte(placa, modelo, marca, color, MaxPasajeros, listaUsuariosAsociados);
    }

    @Override
    protected VehiculoTransporteBuilder self() {
        return this;
    }

}
