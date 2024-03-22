package co.edu.uniquindio.parcial1fx.parcial1fx.model;

import co.edu.uniquindio.parcial1fx.parcial1fx.model.builder.VehiculoCargaBuilder;
import co.edu.uniquindio.parcial1fx.parcial1fx.model.builder.VehiculoTransporteBuilder;

import java.util.ArrayList;
import java.util.List;

public class VehiculoTransporte extends Vehiculo{
    private int MaxPasajeros;
    private List<Usuario> listaUsuariosAsociados = new ArrayList<>();

    public VehiculoTransporte(String placa, String modelo, String marca, String color, int maxPasajeros, List<Usuario> listaUsuariosAsociados) {
        super(placa, modelo, marca, color);
        MaxPasajeros = maxPasajeros;
        this.listaUsuariosAsociados = listaUsuariosAsociados;
    }
    public static VehiculoTransporteBuilder builder(){
        return new VehiculoTransporteBuilder();
    }

    public int getNumMaxPasajeros() {
        return MaxPasajeros;
    }

    public List<Usuario> getListaUsuariosAsociados() {
        return listaUsuariosAsociados;
    }

    @Override
    public String toString() {
        return "VehiculoTransporte{" +
                "MaxPasajeros=" + MaxPasajeros +
                /*", listaUsuariosAsociados=" + listaUsuariosAsociados +*/
                '}';
    }
}
