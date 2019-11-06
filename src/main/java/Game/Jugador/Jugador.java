package Game.Jugador;

import Game.Game;
import Game.Jugador.Vehiculo.Vehiculo;
//implements ordenar por tiempo igual que hicimos con lo del lapiz
public abstract class Jugador {
    String nombre;
    Vehiculo vehiculo;
    private int puntos;
    private float tiempo;

    public abstract Vehiculo setVehiculo();

    // El metodo de maquina
    public abstract void setNombre(String nombre);

    //devuelve un tiempo aleatorio
    public float correr(){
        return Game.getRandom();
    };

    public void sumarPuntos(int puntos){
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
