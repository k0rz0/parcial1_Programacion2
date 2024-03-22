package co.edu.uniquindio.parcial1fx.parcial1fx.model;

import co.edu.uniquindio.parcial1fx.parcial1fx.model.builder.PropietarioBuilder;

public class Propietario {

    private String nombre;
    private String cedula;
    private String email;
    private int edad;
    private String celular;

    public Propietario(String nombre, String cedula, String email, int edad, String celular) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.email = email;
        this.edad = edad;
        this.celular = celular;
    }

    public static PropietarioBuilder builder(){
        return new PropietarioBuilder();
    }

    public int getEdad() {return edad;}

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
