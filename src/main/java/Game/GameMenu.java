package Game;

import com.sun.codemodel.internal.JCase;

import java.sql.SQLOutput;
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

    public void StartMenu(Game game){
        while(!isAcabar()) {
            this.MostrarMenu();
            setOpcion(in.nextInt());
            switch (opcion) {
                case 1:
                    //llamar a configuración
                    break;
                case 2:
                    //mostrar resultados
                    break;
                case 3:
                    //Jugar
                    break;
                case 4:
                    //acabar
                    setAcabar(true);
                    break;
                default:
                    // code block
                    System.out.println("Por favor introduce una opción.");
                    break;
            }
        }
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
