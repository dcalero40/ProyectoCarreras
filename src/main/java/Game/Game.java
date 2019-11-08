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

class Configuration{
    private String nombreCampeonato;
    private String[] nombreCircuitos;
    private String nombreJugador;
    private int nCircuitos;
    private int nJugadores;
    private Vehiculo tipoVehiculo;

    public String getNombreCampeonato() {
        return nombreCampeonato;
    }

    public void setNombreCampeonato(String nombreCampeonato) {
        this.nombreCampeonato = nombreCampeonato;
    }

    public String[] getNombreCircuitos() {
        return nombreCircuitos;
    }

    public boolean setNombreCircuitos() {
        String nombres;
        if (nCircuitos < 0) {
            System.err.println("Falta definir el numero de circuitos");
            return false;
        }
        for (int i = 0; i < nCircuitos; i++) {

        }
        return true;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public int getnCircuitos() {
        return nCircuitos;
    }

    public void setnCircuitos(int nCircuitos) {
        this.nCircuitos = nCircuitos;
    }

    public int getnJugadores() {
        return nJugadores;
    }

    public void setnJugadores(int nJugadores) {
        this.nJugadores = nJugadores;
    }

    public Configuration getConfiguration(){
        return this;
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





























