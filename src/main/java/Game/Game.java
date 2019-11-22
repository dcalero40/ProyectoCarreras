package Game;

import Game.Competicion.Campeonato;
import Game.Competicion.Circuito;
import Game.Jugador.ComparatorJugadorPuntos;
import Game.Jugador.ComparatorJugadorTiempo;
import Game.Jugador.Jugador;

import java.util.ArrayList;
import java.util.Random;

public class Game {

    //datos
    private Campeonato campeonato;
    private Configuration configuration;
    private GameMenu gameMenu;
    private boolean finish;
    public static final String RESET = "\033[0m";  // Text Reset
    public static final String RED = "\033[0;31m";     // RED


    //constructor
    public Game() {
        configuration = new Configuration();
        gameMenu = new GameMenu(this);
        System.err.println(
                "CARRERA 666\n"+
                "   __ \n" +
                        " _/--\\__\n" +
                        "|O-----O\\"
        );
    }

    public void init(){
        while (!finish) {
            gameMenu.startMenu();
        }
    }

    //METODO JUGAR
    public void jugar() {
        // Verificar que la configuracion exista y sea logica.
        if (!configuration.exists()) {
            System.err.println("ERROR EN LA CONFIGURACION.");
            return;
        }
        System.out.println("COMIENZA LA COMPETICION!!!\n");
        // Crear el campeonato
        campeonato = new Campeonato(this);
        // Inicializar los circuitos (Crear nombres...)
        campeonato.setNombre(configuration.getNombreCampeonato());
        campeonato.createCircuitos(configuration.getnCircuitos(), configuration.getNombreCircuitos());
        // Inicializar los jugadores
        campeonato.iniciarJugadores();

        //Sout con la informacion de la configuracion (Nombre del jugador, nombre de las maquinas..., ncircuitos y si quieres empezar)
        System.out.println("NOMBRE DE TU JUGADOR: " + configuration.getNombreJugador());

        System.out.println("LISTADO DE LOS JUGADORES QUE PARTICIPAN EN EL CAMPEONATO:");

        for (Jugador jugador : campeonato.getJugadorArrayList()){
            System.out.print(jugador.getNombre() + " ");
        }
        System.out.println();

        for (Circuito circuito: campeonato.getCircuitoArrayList()) {
            System.out.println(circuito.getNombre());
            circuito.correrCircuito(this);
        }

        campeonato.getJugadorArrayList().sort(new ComparatorJugadorPuntos());

        resultados();
    }

    protected void resultados(){
        if (getCampeonato() != null) {
            System.out.println("RESULTADOS FINALES DE LA COPA " + campeonato.getNombre());
            
            System.out.println("POSICION:JUGADOR:VEHICULO:PUNTOS");
            int posicion = 1;
            for (Jugador jugador : campeonato.getJugadorArrayList()){
                if (jugador.soyEste(getConfiguration().getNombreJugador())){
                    System.out.println(Game.RED + "     "+posicion + "  :  "+jugador.getNombre()+"  :  "+ jugador.getVehiculo().getClass().getSimpleName()+"  :  "+jugador.getPuntos() + Game.RESET);
                }
                else {
                    System.out.println("     "+posicion + "  :  "+jugador.getNombre()+"  :  "+ jugador.getVehiculo().getClass().getSimpleName()+"  :  "+jugador.getPuntos());
                }
                posicion++;
            }

        } else System.out.println("No hay resultados");
    }

    //metodos varios
    public Campeonato getCampeonato() {
        return campeonato;
    }

    void finish() {
        finish = true;
    }

    public static int getRandom() {
        return (int) (Math.random()*60 + 1);

    }

    public Configuration getConfiguration() {
        return configuration;
    }

}





























