package Tictactoe;

import Tictactoe.game.Board;
import Tictactoe.game.Bot;
import Tictactoe.game.Game;
import Tictactoe.game.Player;

import java.util.Scanner;

public class GameDemo {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name1 = scanner.nextLine();
//        String name2;
//        while (true) {
//            name2 = scanner.nextLine();
//            if (name1 != name2) {
//                System.out.println("Invalid input");
//                break;
//            }
//        }
//        Game game = new Game(new Board(), new Player(name1), new Player(name2));
        System.out.print("Choose a strategy(Beginner/Intermediate): ");
        Bot.Strategy str = Bot.Strategy.valueOf(scanner.next());
        Game game = new Game(new Board(), new Player(name1), new Bot(str));

        //Game game = new Game();
        String result = game.playGame();
        System.out.println();
        System.out.println("-----------------------");
        System.out.println("Result: " + result);
        System.out.println();
    }
}
