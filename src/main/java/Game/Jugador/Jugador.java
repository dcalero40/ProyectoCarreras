package Game.Jugador;

import Game.Game;
import Game.Jugador.Vehiculo.Vehiculo;
//implements ordenar por tiempo igual que hicimos con lo del lapiz
public abstract class Jugador {
    String nombre;
    Vehiculo vehiculo;
    private int puntos;
    private float tiempo;

<<<<<<< HEAD
    public abstract void setVehiculo();
    public abstract void setNombre();
=======
    public abstract Vehiculo setVehiculo();

    // El metodo de maquina
    public abstract void setNombre(String nombre);
>>>>>>> 948d6357f31a7644c1ef67363ba9955cee1ce42a

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
