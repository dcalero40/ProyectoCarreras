package Game;

import com.sun.codemodel.internal.JCase;

public class GameMenu {
    // OPCIONES...
    int opcion;
    public GameMenu(){

    }

    public void MostrarMenu(){
        //sout
        //1- Configuració de la competició
        //2- Resultats/Palmarès/ClassificacióGeneral
        //3- Jugar
        //4- Acabar
    }
    public void StartMenu(){
        this.MostrarMenu();
        //swithis.getOpcion()
    }

    public int getOpcion(){
        return opcion;
    }


}
