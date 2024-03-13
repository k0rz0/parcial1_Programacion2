package co.edu.uniquindio.parcial1fx.parcial1fx.model;

public class VehiculoCarga extends Vehiculo {
    private double capacidadCarga;
    private int numEjes;
    public VehiculoCarga(){}

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public int getNumEjes() {
        return numEjes;
    }

    @Override
    public String toString() {
        return "VehiculoCarga{" +
                "capacidadCarga=" + capacidadCarga +
                ", numEjes=" + numEjes +
                '}';
    }
}
