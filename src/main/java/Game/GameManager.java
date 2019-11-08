package Game;

import Game.Campeonato.Campeonato;

@Deprecated
public class GameManager {
    GameMenu menu;
    Game game;

    public GameManager(){
        game = new Game();
        menu = new GameMenu();

    }


}


