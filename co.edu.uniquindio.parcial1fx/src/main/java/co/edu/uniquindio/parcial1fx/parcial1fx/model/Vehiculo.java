package co.edu.uniquindio.parcial1fx.parcial1fx.model;

import co.edu.uniquindio.parcial1fx.parcial1fx.model.builder.VehiculoBuilder;
import co.edu.uniquindio.parcial1fx.parcial1fx.model.builder.VehiculoCargaBuilder;

public class Vehiculo {

    private String placa;
    private String modelo;
    private String marca;
    private String color;

    public Vehiculo(String placa, String modelo, String marca, String color) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
    }

    public static VehiculoBuilder builder(){
        return new VehiculoBuilder();
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }
}
