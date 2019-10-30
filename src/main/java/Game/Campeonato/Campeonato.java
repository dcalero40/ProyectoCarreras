package Game.Campeonato;

import Game.Jugador.Jugador;

import java.util.ArrayList;

public class Campeonato {
    String nombre, ubicacion;
    //arraylist de circuitos
    ArrayList<Circuito> circuitoArrayList = new ArrayList<Circuito>();

    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getResultados() {
        return this.toString();
    }
}
