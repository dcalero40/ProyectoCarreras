package Game;

import Game.Competicion.Campeonato;
import Game.Jugador.Vehiculo.*;

import java.lang.reflect.Field;
import java.util.Scanner;

public class Configuration{
    private String nombreCampeonato;
    private String[] nombreCircuitos;
    private String nombreJugador;
    private int nCircuitos;
    private int nJugadores;
    private Vehiculo tipoVehiculo;

    public void setNombreCampeonato(String nombreCampeonato) {
        this.nombreCampeonato = nombreCampeonato;
        nCircuitos = 0;
        nJugadores = 0;
    }

    public void setnCircuitos(int nCircuitos) {
        if (nCircuitos <= 0) {
            System.err.println("Introduce un numero mayor a 0.");
            return;
        }
        this.nCircuitos = nCircuitos;
    }

    public String getNombreCampeonato() {
        return nombreCampeonato;
    }

    public String[] getNombreCircuitos() {
        return nombreCircuitos;
    }

    public void setNombreCircuitos() {
        if (nCircuitos <= 0) {
            System.out.println("Configura el numero de circuitos.\n");
            return;
        }

        System.out.println("Introduce los nombre de cada uno de los circuitos:");
        Scanner in = new Scanner(System.in);
        nombreCircuitos = new String[nCircuitos];

        for (int i = 0; i < nCircuitos; i++) {
            System.out.print("Nombre del circuito N"+ i + ": ");
            nombreCircuitos[i] = in.nextLine();
        }
    }

    public void setNombreCircuitos(String[] nombreCircuitos){
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
        if (tipoVehiculo instanceof Coche){
            return new Coche();
        }
        else if (tipoVehiculo instanceof Bicicleta){
            return new Bicicleta();
        }
        else if (tipoVehiculo instanceof Camion){
            return new Camion();
        }
        else if (tipoVehiculo instanceof Moto){
            return new Moto();
        }

        return null;
    }

    public void setTipoVehiculo(Vehiculo tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public void setNumJugadores(int nJugadores) {
        this.nJugadores = nJugadores;
    }


    public boolean exists() {
        // Faltan comprobaciones de los strings si es "" o null
        if(
                !nombreCampeonato.equals("") &&
                nCircuitos>0 &&
                nombreCircuitos!=null &&
                nJugadores>0 &&
                !nombreJugador.equals("") &&
                tipoVehiculo!=null &&
                nCircuitos == nombreCircuitos.length
        ) return true;
        return false;
    }

}
