package Game;

import Game.Campeonato.Campeonato;
import Game.Jugador.Jugador;
import Game.Jugador.Vehiculo.*;

import java.util.ArrayList;

public class Game {

    //datos
    private Campeonato campeonato;
    private Configuration configuration;
    private GameMenu gameMenu;
    private boolean finish;

    //constructor
    public Game() {
        configuration = new Configuration();
        gameMenu = new GameMenu();
        while (!finish) {
            gameMenu.startMenu(this);
        }
    }

    //METODO JUGAR
    public void jugar() {
        //HARA CORRER A TODOS LOS JUAGODRES POR TODAS LAS CARRERAS
    }


    //metodos varios
    public Campeonato getCampeonato() {
        return campeonato;
    }

    void finish() {
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

    //metodos jugadores array
    public Jugador obtenerJugadorUsuario(ArrayList<Jugador> jugadores, String name) {
        for (Jugador jugador : jugadores) {
            if (jugador.soyEste(name)) {
                return jugador;
            }
        }
        return null;
    }

    public void iniciarJugadores(ArrayList<Jugador> jugadores) {
        //JUGADORES AUTOMATICOS
        for (int i = 0; i < configuration.getnJugadores(); i++) {
            //rellenar con datos de la configuración
            Jugador jugador = new Jugador(("J" + i), configuration.getTipoVehiculo());
            jugadores.add(jugador);
        }
        //JUGADOR USUARIO
        Jugador jugador = new Jugador(configuration.getNombreJugador(),configuration.getTipoVehiculo());
    }

    public Configuration getConfiguration() {
        return configuration;
    }

}





























