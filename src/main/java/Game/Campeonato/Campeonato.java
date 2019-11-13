package Game.Campeonato;

import Game.Jugador.Jugador;
import Game.Jugador.JugadorUsuario;
import Game.Jugador.Vehiculo.Coche;
import Game.Jugador.Vehiculo.Vehiculo;

import java.lang.module.Configuration;
import java.util.ArrayList;

public class Campeonato {
   private String nombre;
    private String ubicacion;
    private int ncircuitos;
    private ArrayList<Circuito> circuitoArrayList = new ArrayList<Circuito>();
    private ArrayList<Jugador> jugadorArrayList;
    private Jugador jugador1;
    private Vehiculo tipoVehiculo;
    private int numJugadores;


    public Campeonato(String nombreCampeonato, int nCircuitos, String[] nombreCircuitos, int nJugadores, String nombreJugador, Vehiculo vehiculo) {
        this.nombre = nombreCampeonato;
        this.ncircuitos = nCircuitos;
        createCircuitos(nCircuitos, nombreCircuitos);
        this.numJugadores = nJugadores;
        this.jugador1 = new JugadorUsuario(nombreJugador);
        this.tipoVehiculo = vehiculo;
    }

    public void createCircuitos(int ncircuitos, String[] nombreCircuitos){
        circuitoArrayList = new ArrayList<>();
        for (String nombreCircuito : nombreCircuitos) {
            circuitoArrayList.add(new Circuito(nombreCircuito));
        }
    }

    public int getNumJugadores() {
        return numJugadores;
    }
}
