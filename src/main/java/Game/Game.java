package Game;

import Game.Campeonato.Campeonato;
import Game.Jugador.Jugador;
import Game.Jugador.Vehiculo.Vehiculo;

import java.util.ArrayList;

public class Game {
    ArrayList<Jugador> jugadorArrayList;
    Campeonato campeonato;
    Configuration configuration;

    public Game(){
        jugadorArrayList = new ArrayList<Jugador>();
        configuration = new Configuration();
    }

    public Configuration configure(){
        return configuration;
    }

    public static float getRandom(float n1, float n2) {
        return 5f;
    }
    public static String getRandomString() {
        return "nombre";
    }
    public static float getRandom() {
        return 5f;
    }

    class Configuration{
        private int nJugadores;
        private int nCircuitos;
        private Vehiculo tipoVehiculo;

        public int getnJugadores() {
            return nJugadores;
        }

        public void setnJugadores(int nJugadores) {
            this.nJugadores = nJugadores;
        }

        public int getnCircuitos() {
            return nCircuitos;
        }

        public void setnCircuitos(int nCircuitos) {
            this.nCircuitos = nCircuitos;
        }

        public Vehiculo getTipoVehiculo() {
            return tipoVehiculo;
        }

        public void setTipoVehiculo(Vehiculo tipoVehiculo) {
            this.tipoVehiculo = tipoVehiculo;
        }
    }

}

/*
* 1 configuracion
*
*
*
*
*
* */





























