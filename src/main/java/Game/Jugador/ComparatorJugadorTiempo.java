package Game.Jugador;

import java.util.Comparator;

public class ComparatorJugadorTiempo implements Comparator<Jugador> {
    @Override
    public int compare(Jugador a, Jugador b) {
        if (a.getTiempo()<b.getTiempo())return -1;
        else if (a.getTiempo()>b.getTiempo())return 1;
        else return 0;
    }
}
