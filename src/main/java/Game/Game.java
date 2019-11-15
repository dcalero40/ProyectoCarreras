package Game;

import Game.Competicion.Campeonato;
import Game.Jugador.Jugador;

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
        gameMenu = new GameMenu(this);
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
            System.err.println("Error en la configuracion.");
            return;
        }
        System.out.println("Work!");
        // Crear el campeonato
        campeonato = new Campeonato(this);
        // Inicializar los circuitos (Crear nombres...)
        campeonato.createCircuitos(configuration.getnCircuitos(), configuration.getNombreCircuitos());
        // Inicializar los jugadores
        campeonato.iniciarJugadores();

        //Sout con la informacion de la configuracion (Nombre del jugador, nombre de las maquinas..., ncircuitos y si quieres empezar)
        System.out.println(
                "Nombre de tu jugador: " + configuration.getNombreJugador() + "\n" +
                "Nombre de las maquinas: " + configuration.
        );

        // For de circuitos
            //nombre circuito
            //iniciar esa carrera
            //bucle que haga correr a todos los jugadores
            //ordenar array jugadores por tiempo
            //asignar puntos
            //mostras los jugadores metodo to string (Resultados) posicion: nombre jugador: tiempo: puntos:
        //cerra bucle
        //ordenar por puntos
        //resultados del campeonato jugadores ordenados
        //Volver al menu?
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



    public Configuration getConfiguration() {
        return configuration;
    }

}





























