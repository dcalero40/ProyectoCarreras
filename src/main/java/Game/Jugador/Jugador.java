package Game.Jugador;

import Game.Game;
import Game.Jugador.Vehiculo.*;

//implements ordenar por tiempo igual que hicimos con lo del lapiz
public  class Jugador {
    //datos
    private String nombre;
    private Vehiculo vehiculo;
    private int puntos;
    private int tiempo;

    public Jugador(String nombre, Vehiculo vehiculo) {
        this.nombre = nombre;
        this.vehiculo = vehiculo;
        this.puntos = 0;
        this.tiempo = 0;
    }

    //setters
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTiempo() {
        this.tiempo = correr();
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    //getters
    public int getPuntos() {
        return puntos;
    }

    public int getTiempo() {
        return tiempo;
    }

    //otros metodos
    public void addPuntos(int puntos){
        //sumar a puntos el resultado de una carrera
        setPuntos(this.puntos+puntos);
    }

    //devuelve un tiempo aleatorio
    public int correr(){
        return Game.getRandom();
    }


    public boolean soyEste(String name) {
        if (this.nombre.equals(name)) return true;
        return false;
    }

    public String getNombre() {
        return nombre;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }
}

/*
para classificar ordenamos los jugadores por la puntuación y sumamos puntos segun donde queden clasificados */
