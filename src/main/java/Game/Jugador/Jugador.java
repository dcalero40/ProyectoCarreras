package Game.Jugador;

import Game.Jugador.Vehiculo.Vehiculo;

public abstract class Jugador {
    String nombre;
    Vehiculo vehiculo;

    public abstract Vehiculo setVehiculo();
    public abstract String setNombre();
}
