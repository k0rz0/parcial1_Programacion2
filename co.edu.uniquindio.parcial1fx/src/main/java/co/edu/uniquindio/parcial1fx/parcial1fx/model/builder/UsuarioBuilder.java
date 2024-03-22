package co.edu.uniquindio.parcial1fx.parcial1fx.model.builder;

import co.edu.uniquindio.parcial1fx.parcial1fx.model.Usuario;
import co.edu.uniquindio.parcial1fx.parcial1fx.model.VehiculoTransporte;

public class UsuarioBuilder {

    protected String nombre;
    protected int edad;
    protected double peso;
    protected VehiculoTransporte vehiculoTransporte;

    public UsuarioBuilder edad(int edad) {
        this.edad = edad;
        return this;
    }
    public UsuarioBuilder nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }
    public UsuarioBuilder peso(double peso) {
        this.peso = peso;
        return this;
    }
    public UsuarioBuilder vehiculoTransporte(VehiculoTransporte vehiculoTransporte) {
        this.vehiculoTransporte = vehiculoTransporte;
        return this;
    }

    public Usuario build() {
        return new Usuario(nombre, edad, peso, vehiculoTransporte);
    }

}


