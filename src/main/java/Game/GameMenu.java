package Game;


import Game.Campeonato.Circuito;

import java.util.Scanner;

public class GameMenu {
    //scanner
    Scanner in = new Scanner(System.in);
    // OPCIONES...
    private boolean acabar;

    public GameMenu(){

    }

    public void MostrarMenuStart(){
        //sout
        System.out.println("ESCOGE UNA OPCIÓN.\n" +
                "1. CONFIGURAR LA COMPETICION.\n" +
                "2. MOSTRAR RESULTADOS.\n" +
                "3. JUGAR.\n" +
                "4. ACABAR");
    }

    public void MostrarMenuConfiguracion(){
        //sout
        System.out.println("ESCOGE UNA OPCIÓN A CONFIGURAR:\n" +
                "1. NOMBRE CAMPEONATO.\n" +
                "2. NUMERO DE CIRCUITOS.\n" +
                "3. NOMBRE DE CIRCUITOS\n" +
                "4. NUMERO DE JUGADORES\n" +
                "5. NOMBRE DE TU JUGADOR\n" +
                "6. TIPO DE VEHICULOS");
    }

    public void startMenu(Game game){
            this.MostrarMenuStart();

            // Pedir identifcador de la opcion:
            switch (in.nextInt()) {
                case 1:
                    menuConfiguracion(game);
                    break;
                case 2:
                    if (game.getCampeonato() != null) {
                        System.out.println(game.getCampeonato().getResultados());
                    } else System.out.println("No hay resultados");

                    break;
                case 3:
                    game.jugar();
                    break;
                case 4:
                    //acabar
                    game.finish();
                    break;
                default:
                    // code block
                    System.out.println("Por favor introduce una opción.");
                    break;
            }
    }

    private void menuConfiguracion(Game game){
        //que quieres configurar?
        //njum jugadores

        /*

         */
        mostrarMenuConfigurar();
        switch (in.nextInt()) {
            case 1:
                //funcion que pertenece campeonato
                System.out.print("Introduce el nombre del campeonato: ");
                game.configure().setNombreCampeonato(in.nextLine());
                break;
            case 2:
                System.out.print("Introduce el numero de circuitos: ");
                game.getConfiguracion().setnCircuitos(in.nextInt());
                break;
            case 3:
                int count = 1;

                break;
            case 4:
                System.out.print("Introduce el numero de jugadores que participaran: ");
                game.getCampeonato().setNumJugadores(in.nextInt());
                break;
            case 5:
                System.out.print("Introduce el nombre de tu jugador: ");
                game.getCampeonato().getMiJugador().setNombre();
                break;
            default:
                // code block
                System.out.println("Por favor introduce una opción.");
                break;
        }


    }
    private void mostrarMenuConfigurar(){
        System.out.println("ESCOGE UNA OPCIÓN A CONFIGURAR:\n" +
                "1. NOMBRE CAMPEONATO.\n" +
                "2. NUMERO DE CIRCUITOS.\n" +
                "3. NOMBRE DE CIRCUITOS\n" +
                "4. NUMERO DE JUGADORES\n" +
                "5. NOMBRE DE TU JUGADOR\n" +
                "6. TIPO DE VEHICULOS");
    }

    //getter y setter
    //boolean acabar
    public boolean isAcabar() {
        return acabar;
    }
    public void setAcabar(boolean acabar) {
        this.acabar = acabar;
    }
}
