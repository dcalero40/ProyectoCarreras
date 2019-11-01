package Game;


import java.util.Scanner;

public class GameMenu {
    //scanner
    Scanner in = new Scanner(System.in);
    // OPCIONES...
    private int opcion;
    private boolean acabar;

    public GameMenu(){
        this.setOpcion(0);
    }

    public void MostrarMenu(){
        //sout
        System.out.println("ESCOGE UNA OPCIÓN.\n" +
                "1. CONFIGURAR LA COMPETICION.\n" +
                "2. MOSTRAR RESULTADOS.\n" +
                "3. JUGAR.\n" +
                "4. ACABAR");
    }

    public void startMenu(Game game){
            this.MostrarMenu();
            setOpcion(in.nextInt());
            switch (opcion) {
                case 1:
                    configurarMenu(game);
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

    private void configurarMenu(Game game){

    }
    private void mostrarMenuConfigurar(){
        System.out.println("");
    }

    //getter y setter
    //opcion
    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }
    public int getOpcion() {
        return opcion;
    }
    //boolean acabar
    public boolean isAcabar() {
        return acabar;
    }
    public void setAcabar(boolean acabar) {
        this.acabar = acabar;
    }
}
