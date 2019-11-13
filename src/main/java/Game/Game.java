package Game;

import Game.Campeonato.Campeonato;
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

    public Configuration getConfiguracion() {
        return this.configuration;
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





























