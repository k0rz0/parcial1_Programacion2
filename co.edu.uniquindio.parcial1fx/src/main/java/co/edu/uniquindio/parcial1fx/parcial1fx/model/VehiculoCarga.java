package co.edu.uniquindio.parcial1fx.parcial1fx.model;

import co.edu.uniquindio.parcial1fx.parcial1fx.model.builder.UsuarioBuilder;
import co.edu.uniquindio.parcial1fx.parcial1fx.model.builder.VehiculoCargaBuilder;

public class VehiculoCarga extends Vehiculo {
        private double capacidadCarga;
        private int numEjes;

        public VehiculoCarga(String placa, String modelo, String marca, String color, double capacidadCarga, int numEjes) {
            super(placa, modelo, marca, color);
            this.capacidadCarga = capacidadCarga;
            this.numEjes = numEjes;
        }

        public static VehiculoCargaBuilder builder(){
            return new VehiculoCargaBuilder();
        }

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
