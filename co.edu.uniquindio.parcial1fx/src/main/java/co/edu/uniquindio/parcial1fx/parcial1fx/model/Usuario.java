package co.edu.uniquindio.parcial1fx.parcial1fx.model;

public class Usuario {
    private int edad;
    private VehiculoTransporte vehiculoTransporte;
    public Usuario() {
    }

    public int getEdad() {
        return edad;
    }

    public VehiculoTransporte getVehiculoTransporte() {
        return vehiculoTransporte;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "edad=" + edad +
                ", vehiculoTransporte=" + vehiculoTransporte +
                '}';
    }
}
