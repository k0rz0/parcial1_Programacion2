package co.edu.uniquindio.parcial1fx.parcial1fx.model.builder;

import co.edu.uniquindio.parcial1fx.parcial1fx.model.Propietario;

public class PropietarioBuilder {

    protected String nombre;
    protected String cedula;
    protected String email;
    protected int edad;
    protected String celular;

    public PropietarioBuilder nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public PropietarioBuilder cedula(String cedula) {
        this.cedula = cedula;
        return this;
    }

    public PropietarioBuilder email(String email) {
        this.email = email;
        return this;
    }
    public PropietarioBuilder edad(int edad) {
        this.edad = edad;
        return this;
    }

    public PropietarioBuilder celular(String celular) {
        this.celular = celular;
        return this;
    }

    public Propietario build() {
        return new Propietario(nombre, cedula, email, edad, celular);
    }
}
