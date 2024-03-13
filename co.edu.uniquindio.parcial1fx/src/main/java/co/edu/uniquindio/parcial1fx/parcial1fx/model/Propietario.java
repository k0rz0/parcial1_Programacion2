package co.edu.uniquindio.parcial1fx.parcial1fx.model;

public class Propietario {

    private String nombre;
    private String cedula;
    private String email;
    private String celular;

    public Propietario() {
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getEmail() {
        return email;
    }

    public String getCelular() {
        return celular;
    }

    @Override
    public String toString() {
        return "Propietario{" +
                "nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                ", email='" + email + '\'' +
                ", celular='" + celular + '\'' +
                '}';
    }
}
