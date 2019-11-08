package Game.Jugador;

import Game.Jugador.Vehiculo.Vehiculo;

public class JugadorMaquina extends Jugador{
    //datos por defecto:
    @Override
    public void setVehiculo() {

    }

    @Override
    public void setNombre() {

    }
    //si el jugador implementa sus datos personalizados
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo=vehiculo;
    }

    public void setNombre(String nombre) {
        this.nombre=nombre;
    }


}
