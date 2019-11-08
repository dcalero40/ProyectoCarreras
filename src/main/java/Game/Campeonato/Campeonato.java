package Game.Campeonato;

import Game.Jugador.Jugador;
import Game.Jugador.JugadorUsuario;
import Game.Jugador.Vehiculo.Coche;
import Game.Jugador.Vehiculo.Vehiculo;

import java.util.ArrayList;

public class Campeonato {
    public Campeonato() {
        this.jugadorArrayList = new ArrayList<Jugador>();

    }

    private String nombre;

    public void setNcircuitos(int ncircuitos) {
        this.ncircuitos = ncircuitos;
    }

    private String ubicacion;
    private int ncircuitos;

    //arraylist de circuitos
    private ArrayList<Circuito> circuitoArrayList = new ArrayList<Circuito>();
    private ArrayList<Jugador> jugadorArrayList;
    private Jugador jugador1;
    private Vehiculo tipoVehiculo;
    private int numJugadores;
    public ArrayList<Circuito> getCircuitoArrayList() {
        return circuitoArrayList;
    }

    public String getNombre() {
        return nombre;
    }
    public String getUbicacion() {
        return ubicacion;
    }
    public String getResultados() {
        return this.toString();
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setNumJugadores() {
        if(jugadorArrayList.size()>this.numJugadores){
            //elimino jugadores random que sobren
        }
        else if(jugadorArrayList.size()<this.numJugadores){
            //añado //bucle añadir jugadores
        }
    }

    public void setTipoVehiculo(Vehiculo vehiculo){
        this.tipoVehiculo = vehiculo;
    }

    public Vehiculo getTipoVehiculo(){
        return this.tipoVehiculo;
    }

    public void setNumJugadores(int numJugadores) {
        this.numJugadores=numJugadores;
    }

    public Jugador getMiJugador() {
        // Buscar en la array de jugadores nuestro jugador.
        return new JugadorUsuario();
    }
}
