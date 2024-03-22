package co.edu.uniquindio.parcial1fx.parcial1fx.model.builder;

import co.edu.uniquindio.parcial1fx.parcial1fx.model.Vehiculo;

public class VehiculoBuilder <T extends VehiculoBuilder<T>> {
    protected String placa;
    protected String modelo;
    protected String marca;
    protected String color;

    public T placa(String placa) {
        this.placa = placa;
        return self();
    }
    public T modelo(String modelo) {
        this.modelo = modelo;
        return self();
    }
    public T marca(String marca) {
        this.marca = marca;
        return self();
    }
    public T color(String color) {
        this.color = color;
        return self();
    }

    @SuppressWarnings("unchecked")
    protected T self() {
        return (T) this;
    }

    public Vehiculo build() {
        return new Vehiculo(placa, modelo, marca, color);
    }

}
