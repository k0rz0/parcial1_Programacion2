package co.edu.uniquindio.parcial1fx.parcial1fx.model;

import co.edu.uniquindio.parcial1fx.parcial1fx.model.builder.TransportadoraBuilder;
import co.edu.uniquindio.parcial1fx.parcial1fx.model.builder.VehiculoTransporteBuilder;

import java.util.ArrayList;
import java.util.List;

public class Transportadora {

    private String nombre;
    private List<Propietario> listaPropietarios = new ArrayList<>();
    private  List<Vehiculo> listavehiculos = new ArrayList<>();
    private  List<VehiculoCarga> listaVehiculosCarga = new ArrayList<>();
    private  List<VehiculoTransporte> listaVehiculosTransporte = new ArrayList<>();
    private  List<Usuario> listaUsuarios = new ArrayList<>();

    public Transportadora(String nombre, List<Propietario> listaPropietarios, List<Vehiculo> listavehiculos,
                          List<VehiculoCarga> listaVehiculosCarga, List<VehiculoTransporte> listaVehiculosTransporte,
                          List<Usuario> listaUsuarios) {
        this.nombre = nombre;
        this.listaPropietarios = listaPropietarios;
        this.listavehiculos = listavehiculos;
        this.listaVehiculosCarga = listaVehiculosCarga;
        this.listaVehiculosTransporte = listaVehiculosTransporte;
        this.listaUsuarios = listaUsuarios;
    }

    public static TransportadoraBuilder builder(){
        return new TransportadoraBuilder();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Propietario> getListaPropietarios() {
        return listaPropietarios;
    }

    public List<Vehiculo> getListavehiculos() {
        return listavehiculos;
    }

    public List<VehiculoCarga> getListaVehiculosCarga() {
        return listaVehiculosCarga;
    }

    public List<VehiculoTransporte> getListaVehiculosTransporte() {
        return listaVehiculosTransporte;
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    @Override
    public String toString() {
        return "Transportadora{" +
                "nombre='" + nombre + '\'' +
                ", listaPropietarios=" + listaPropietarios +
                ", listavehiculos=" + listavehiculos +
                ", listaVehiculosCarga=" + listaVehiculosCarga +
                ", listaVehiculosTransporte=" + listaVehiculosTransporte +
                ", listaUsuarios=" + listaUsuarios +
                '}';
    }

    public String obtenerPropietariosMayoresde40() {
        String NombresPropietarios = "";

        for (Propietario propietario: getListaPropietarios()) {
            if (propietario.getEdad()>40){
                NombresPropietarios += "Nombre: " + propietario.getNombre()+ ", Edad: " + propietario.getEdad() + "\n";
            }
        }

        return NombresPropietarios;
    }

    public String obtenerUsuariosPorPeso(double peso) {
        String usuariosPorPeso = "";

        for (Usuario usuario: getListaUsuarios()) {
            if(usuario.getPeso() > peso){
                usuariosPorPeso += "Nombre: " + usuario.getNombre()+ ", Edad: " + usuario.getPeso() + "\n";
            }
        }

        return usuariosPorPeso;
    }

    public String obtenerUsuariosPorPlaca(String placa) {
        int usuariosPorPlaca = 0;

        for (VehiculoTransporte vehiculoTransporte: getListaVehiculosTransporte()) {
            if(vehiculoTransporte.getPlaca().equalsIgnoreCase(placa)){
                usuariosPorPlaca = vehiculoTransporte.getListaUsuariosAsociados().size();
            }
        }

        return String.valueOf(usuariosPorPlaca);
    }


    public void eliminarPropietario(String cedula){
        for(Propietario propietario: getListaPropietarios()){
            if(propietario.getCedula().equals(cedula) ){
                getListaPropietarios().remove(propietario);
                break;
            }
        }
    }


    public void actualizarPropietario(String nombre, String email, String cedula, String celular) {
        eliminarPropietario(cedula);

    }
}
