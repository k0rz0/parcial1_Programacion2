package co.edu.uniquindio.parcial1fx.parcial1fx.model.builder;

import co.edu.uniquindio.parcial1fx.parcial1fx.model.VehiculoCarga;

public class VehiculoCargaBuilder extends VehiculoBuilder<VehiculoCargaBuilder> {
    protected double capacidadCarga;
    protected int numEjes;

    /*public VehiculoCargaBuilder placa(String placa) {
        this.placa = placa;
        return this;
    }
    public VehiculoCargaBuilder modelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public VehiculoCargaBuilder marca(String marca) {
        this.marca = marca;
        return this;
    }

    public VehiculoCargaBuilder color(String color) {
        this.color = color;
        return this;
    }*/

    public VehiculoCargaBuilder numEjes(int numEjes) {
        this.numEjes = numEjes;
        return this;
    }

    public VehiculoCargaBuilder capacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
        return this;
    }

    @Override
    public VehiculoCarga build() {
        return new VehiculoCarga(placa, modelo, marca, color, capacidadCarga, numEjes);
    }

    @Override
    protected VehiculoCargaBuilder self() {
        return this;
    }

}
