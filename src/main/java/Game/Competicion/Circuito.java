package Game.Competicion;

import Game.Game;
import Game.Jugador.ComparatorJugadorTiempo;
import Game.Jugador.Jugador;

public class Circuito {
    String nombre;

    public Circuito(String nombreCircuito) {
        this.nombre = nombreCircuito;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void correrCircuito(Game game){
        /*
        recorrer jugadores-- asignar tiempo randpom
        ordenar jugadores por tiempo
        sumar puntos
        mostrar*/
        for (Jugador jugador: game.getCampeonato().getJugadorArrayList()) {
            jugador.setTiempo();
        }
        game.getCampeonato().getJugadorArrayList().sort(new ComparatorJugadorTiempo());

        int puntuacion = game.getCampeonato().getJugadorArrayList().size();
        for (Jugador jugador: game.getCampeonato().getJugadorArrayList()) {
            jugador.addPuntos(puntuacion);
            puntuacion--;
        }

        for (Jugador jugador: game.getCampeonato().getJugadorArrayList()) {
            System.out.println(jugador.getNombre() + ":" + jugador.getPuntos() + ":" + jugador.getTiempo());
        }


    }
    public void mostrarResultados(){
        //souts...
    }

}
