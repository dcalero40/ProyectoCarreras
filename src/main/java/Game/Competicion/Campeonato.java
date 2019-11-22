package Game.Competicion;

import Game.Game;
import Game.Jugador.Jugador;
import Game.Jugador.Vehiculo.Vehiculo;
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
    private final Game game;


    public void setNcircuitos(int ncircuitos) {
        this.ncircuitos = ncircuitos;
    }

    public Campeonato(Game game) {
        this.game = game;
        this.nombre = this.game.getConfiguration().getNombreCampeonato();
        this.ncircuitos = this.game.getConfiguration().getnCircuitos();
        this.numJugadores = this.game.getConfiguration().getnJugadores();
        this.tipoVehiculo = this.game.getConfiguration().getTipoVehiculo();
        this.jugadorArrayList=new ArrayList<>();
    }

    public void createCircuitos(int ncircuitos, String[] nombreCircuitos){
        circuitoArrayList = new ArrayList<>();
        for (String nombreCircuito : nombreCircuitos) {
            circuitoArrayList.add(new Circuito(nombreCircuito));
        }
    }

    //metodos jugadores array
    public Jugador obtenerJugadorUsuario() {
        for (Jugador jugador : jugadorArrayList) {
            if (jugador.soyEste(game.getConfiguration().getNombreJugador())) {
                return jugador;
            }
        }
        return null;
    }

    public void iniciarJugadores() {
        //JUGADORES AUTOMATICOS
        for (int i = 0; i < game.getConfiguration().getnJugadores(); i++) {
            //rellenar con datos de la configuración
            Jugador jugador = new Jugador(("J" + i), game.getConfiguration().getTipoVehiculo());
            jugadorArrayList.add(jugador);
        }
        //JUGADOR USUARIO
        Jugador jugador = new Jugador(game.getConfiguration().getNombreJugador(),game.getConfiguration().getTipoVehiculo());
        jugadorArrayList.add(jugador);
    }

    public ArrayList<Jugador> getJugadorArrayList() {
        return jugadorArrayList;
    }

    public ArrayList<Circuito> getCircuitoArrayList() {
        return circuitoArrayList;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
