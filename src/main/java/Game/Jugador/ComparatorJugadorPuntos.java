package Game.Jugador;

import java.util.Comparator;

public class ComparatorJugadorPuntos implements Comparator<Jugador> {
    @Override
    public int compare(Jugador a, Jugador b) {
        if (a.getPuntos()<b.getPuntos())return 1;
        else if (a.getPuntos()>b.getPuntos())return -1;
        else return 0;
    }

}
