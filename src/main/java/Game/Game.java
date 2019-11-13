package Game;

import Game.Campeonato.Campeonato;
import Game.Jugador.Jugador;
import Game.Jugador.Vehiculo.Camion;
import Game.Jugador.Vehiculo.Vehiculo;

import java.util.ArrayList;

public class Game {

    private Campeonato campeonato;
    private Configuration configuration;
    private GameMenu gameMenu;
    private boolean finish;

    public Game(){
        configuration = new Configuration();
        gameMenu = new GameMenu();
        while (!finish){
            gameMenu.startMenu(this);
        }
    }

    public Campeonato getCampeonato() {
        return campeonato;
    }

    public Configuration configure(){
        return configuration;
    }

    void finish(){
        finish = true;
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

    public void jugar() {

    }
    //metodos jugadores array
    public Jugador obtenerJugadorUsuario(ArrayList<Jugador> jugadores, String name){
        for (Jugador jugador: jugadores) {
            if (jugador.soyEste(name)){
                return jugador;
            }
        }
        return null;
    }

    public void iniciarJugadoresAutomaticos(int numJugadores, ArrayList<Jugador> jugadores){
        for (int i = 0; i <numJugadores ; i++) {
            //rellenar con datos de la configuración
            Jugador jugador=new Jugador(("J"+i),Configuration.vehiculo);
            jugadores.add(jugador);
        }
    }




@Deprecated
    class Configuration{


        public int getnJugadores() {
            return this.getnJugadores();
        }

        public void setnJugadores(int nJugadores) {
            this.setnJugadores(nJugadores);
        }

        public int getnCircuitos() {
            return this.getnJugadores();
        }

        public void setnCircuitos(int nCircuitos) { this.setnCircuitos(nCircuitos); }

        public Vehiculo getTipoVehiculo() { return this.getTipoVehiculo(); }

        public void setTipoVehiculo(Vehiculo tipoVehiculo) {
            this.setTipoVehiculo(tipoVehiculo);
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





























