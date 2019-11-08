package Game.Jugador;

import Game.Game;
import Game.Jugador.Vehiculo.Vehiculo;

public abstract class Jugador {
    String nombre;
    Vehiculo vehiculo;
    private int puntos;

    public abstract void setVehiculo();
    public abstract void setNombre();

    //devuelve un tiempo aleatorio
    public float correr(){
        return Game.getRandom();
    };

    public void sumarPuntos(){
        //sumar a puntos el resultado de una carrera
        setPuntos(puntos);
    }

    //setter y getters


    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
}
