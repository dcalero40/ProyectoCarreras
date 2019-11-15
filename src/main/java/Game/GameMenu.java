package Game;


import Game.Jugador.Vehiculo.*;

import java.util.Scanner;

public class GameMenu {
    private final Game game;
    //scanner
    Scanner in = new Scanner(System.in);
    // OPCIONES...
    private boolean acabar;


    public GameMenu(Game game){
        this.game = game;
    }

    public void mostrarMenuStart(){
        //sout
        System.out.println("ESCOGE UNA OPCIÓN.\n" +
                "1. CONFIGURAR LA COMPETICION.\n" +
                "2. MOSTRAR RESULTADOS.\n" +
                "3. JUGAR.\n" +
                "4. ACABAR");
    }

    public void startMenu(){
            mostrarMenuStart();

            // Pedir identifcador de la opcion:
        int opcion = in.nextInt();
        in.nextLine();
            switch (opcion) {
                case 1:
                    menuConfiguracion();
                    break;
                case 2:
                    if (game.getCampeonato() != null) {
                        System.out.println("RESULTADOS");

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

    private void menuConfiguracion(){
        int opcionConfigurar=0;
        do{
            mostrarMenuConfigurar();
            opcionConfigurar = in.nextInt();
            in.nextLine();
            switch (opcionConfigurar) {
                case 1:
                    //funcion que pertenece campeonato
                    System.out.print("Introduce el nombre del campeonato: ");
                    game.getConfiguration().setNombreCampeonato(in.nextLine());
                    break;
                case 2:
                    System.out.print("Introduce el numero de circuitos: ");
                    game.getConfiguration().setnCircuitos(in.nextInt());
                    break;
                case 3:
                    game.getConfiguration().setNombreCircuitos();
                    break;
                case 4:
                    System.out.print("Introduce el numero de jugadores con los que competiras.: ");
                    game.getConfiguration().setNumJugadores(in.nextInt());
                    break;
                case 5:
                    System.out.print("Introduce el nombre de tu jugador: ");
                    game.getConfiguration().setNombreJugador(in.nextLine());
                    break;
                case 6:
                    System.out.println("Seleciona el vehiculo: \n" +
                            "1. Coche\n" +
                            "2. Moto\n" +
                            "3. Camion\n" +
                            "4. Bicicleta\n" +
                            "Default. Salir");
                    int idvehiculo = in.nextInt();
                    Vehiculo vehiculo = null;
                    in.nextLine();

                    switch (idvehiculo){
                        case 1: vehiculo = new Coche(); break;
                        case 2: vehiculo = new Moto(); break;
                        case 3: vehiculo = new Camion(); break;
                        case 4: vehiculo = new Bicicleta(); break;
                        default:
                            System.out.println("No has introducido ningun coche, saliendo..."); continue;
                    }
                    System.out.println("Vehiculo selecionado correctamente.");
                    game.getConfiguration().setTipoVehiculo(vehiculo);

                    break;
                case 7:
                    break;
                case 666:
                    game.getConfiguration().setNombreCampeonato("Bowser");
                    game.getConfiguration().setnCircuitos(1);
                    game.getConfiguration().setNombreCircuitos(new String[]{"Copa champiñon"});
                    game.getConfiguration().setNumJugadores(3);
                    game.getConfiguration().setNombreJugador("Mario");
                    game.getConfiguration().setTipoVehiculo(new Coche());
                    System.out.println("READY?!");

                default:
                    // code block
                    System.out.println("Por favor introduce una opción.");
                    break;
            }

        }while(opcionConfigurar!=7);






    }

    private void mostrarMenuConfigurar(){
        System.out.println("ESCOGE UNA OPCIÓN A CONFIGURAR:\n" +
                "1. NOMBRE CAMPEONATO.\n" +
                "2. NUMERO DE CIRCUITOS.\n" +
                "3. NOMBRE DE CIRCUITOS\n" +
                "4. NUMERO DE JUGADORES\n" +
                "5. NOMBRE DE TU JUGADOR\n" +
                "6. TIPO DE VEHICULOS\n" +
                "7. SALIR DE CONFIGURACIÓN");
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
