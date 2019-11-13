package Game;

import Game.Campeonato.Campeonato;
import Game.Jugador.Vehiculo.Vehiculo;

class Configuration{
    private String nombreCampeonato;
    private String[] nombreCircuitos;
    private String nombreJugador;
    private int nCircuitos;
    private int nJugadores;
    private Vehiculo tipoVehiculo;

    public void setNombreCampeonato(String nombreCampeonato) {
        this.nombreCampeonato = nombreCampeonato;
    }

    public void setnCircuitos(int nCircuitos) {
        this.nCircuitos = nCircuitos;
    }




    public Campeonato Configuration(){
        return new Campeonato(nombreCampeonato, nCircuitos, nombreCircuitos, nJugadores, nombreJugador, tipoVehiculo);
    }

}
