package VMware_practic_exercises.Java.Tictactoe;

import VMware_practic_exercises.Java.Tictactoe.game.Board;
import VMware_practic_exercises.Java.Tictactoe.game.Bot;
import VMware_practic_exercises.Java.Tictactoe.game.Game;
import VMware_practic_exercises.Java.Tictactoe.game.Player;
import java.util.Scanner;
public class GameDemo {
    public static void main(String[] args) throws Exception {
        Game game;
        while (true) {
            try {
                game = game_type();
                break;
            }
            catch(Exception e) {
                System.out.println(e.getMessage());
            }
        }
        String result = game.playGame();
        System.out.println();
        System.out.println("-----------------------");
        System.out.println("Result: " + result);
        System.out.println();
    }
    static Game game_type () throws Exception {
        Scanner scanner = new Scanner(System.in);

        //how do you want to play(with friend, or with computer)?
        System.out.print("How do you want to play(with friend/with computer): ");
        String game_type = scanner.nextLine();

        if (game_type.equals("with friend")) {
            System.out.print("Enter first player's name: ");
            String name1 = scanner.nextLine();
            System.out.print("Enter first player's marker: ");
            char marker1 = scanner.nextLine().charAt(0);
            System.out.print("Enter second player's name: ");
            String name2 = scanner.nextLine();
            System.out.print("Enter second player's marker: ");
            char marker2 = scanner.nextLine().charAt(0);

            Player player1 = new Player(marker1, name1);
            Player player2 = new Player(marker2, name2);
            if (player2.equals(player1)) {
                throw new Exception("You entered the same name for both players");
            }
            return new Game(player1, player2);
        }
        else if (game_type.equals("with computer")) {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            if (name == "Bot") {
                throw new Exception("You entered the same name for both players");
            }
            System.out.print("Choose a strategy(Beginner/Intermediate/Advanced): ");
            Bot.Strategy str = Bot.Strategy.valueOf(scanner.next());
            return new Game(new Player(name), str);
        }
        else {
            throw new Exception("Invalid game type");
        }

    }

}
