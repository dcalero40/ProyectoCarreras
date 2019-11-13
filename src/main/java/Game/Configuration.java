package Game;

import Game.Campeonato.Campeonato;
import Game.Jugador.Vehiculo.Vehiculo;

public class Configuration{
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

    public String getNombreCampeonato() {
        return nombreCampeonato;
    }

    public String[] getNombreCircuitos() {
        return nombreCircuitos;
    }

    public void setNombreCircuitos(String[] nombreCircuitos) {
        this.nombreCircuitos = nombreCircuitos;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public int getnCircuitos() {
        return nCircuitos;
    }

    public int getnJugadores() {
        return nJugadores;
    }

    public void setnJugadores(int nJugadores) {
        this.nJugadores = nJugadores;
    }

    public Vehiculo getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(Vehiculo tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public void setNumJugadores(int nJugadores) {
        this.nJugadores = nJugadores;
    }
}
