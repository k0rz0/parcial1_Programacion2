package co.edu.uniquindio.parcial1fx.parcial1fx.model;

import co.edu.uniquindio.parcial1fx.parcial1fx.model.builder.UsuarioBuilder;

public class Usuario {
    private String nombre;
    private int edad;
    private double peso;
    private VehiculoTransporte vehiculoTransporte;

    public Usuario(String nombre, int edad, double peso, VehiculoTransporte vehiculoTransporte) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.vehiculoTransporte = vehiculoTransporte;
    }

    public static UsuarioBuilder builder(){
        return new UsuarioBuilder();
    }

    public int getEdad() {
        return edad;
    }

    public VehiculoTransporte getVehiculoTransporte() {
        return vehiculoTransporte;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", vehiculoTransporte=" + vehiculoTransporte.toString() +
                '}';
    }
}
