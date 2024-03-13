package co.edu.uniquindio.parcial1fx.parcial1fx.model;

import java.util.ArrayList;
import java.util.List;

public class VehiculoTransporte extends Vehiculo{
    private int MaxPasajeros;
    private List<Usuario> listaUsuariosAsociados = new ArrayList<>();

    public VehiculoTransporte(){}

    public int getNumMaxPasajeros() {
        return MaxPasajeros;
    }

    public List<Usuario> getListaUsuariosAsociados() {
        return listaUsuariosAsociados;
    }

    @Override
    public String toString() {
        return "VehiculoTransporte{" +
                "numMaxPasajeros=" + MaxPasajeros +
                ", listaUsuariosAsociados=" + listaUsuariosAsociados +
                '}';
    }
}
