package VMware_practic_exercises.Java.Tictactoe;

import VMware_practic_exercises.Java.Tictactoe.game.*;
public class GameDemo {
    public static void main(String[] args) {

        Game game = new Game(new Board(), new Player(), new Bot('O', false));

        //Game game = new Game();
        String result = game.playGame();
        System.out.println();
        System.out.println("-----------------------");
        System.out.println("Result: " + result);
        System.out.println();
    }
}
