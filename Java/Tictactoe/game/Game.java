package VMware_practic_exercises.Java.Tictactoe.game;
import java.util.Scanner;
public class Game {
    private final Player player1;
    private final Player player2;
    private final Board board;

    //when player choose to play with computer
    public Game(Player player, Bot.Strategy strategy) {
        System.out.println("You are playing with a bot, let's start!");
        this.player1 = player;
        this.player2 = new Bot(strategy);
        this.board = new Board();
    }

    //when player choose playing with friend
    public Game(Player player1, Player player2){
        System.out.println("Player1\n" + player1 + "\nPlayer2\n" + player2);
        this.player1 = player1;
        this.player2 = player2;
        this.board = new Board();
    }

    public String playGame() throws Exception {
        //TODO: implement
        // Plays the game:
        // 1. Prints the board
        // 2. Asks from a current player to make a move
        // 3. Submits the move, if the move was submitted then continues from point 1 the same thing for the other player,
        //    if the move was not submitted (invalid move) then prints appropriate message and asks to make a move again from the same player
        // Keeps doing the above steps until one of the players wins, or the board gets full and no one wins
        // At the end this method should print the final result of the board and return the marker of the winner or the word "Tie" if no one wins
        String move, res;
        do {
            if (player2 instanceof Bot) {
                //getting player's move
                while (true) {
                    board.printBoard();
                    System.out.println("Player " + player1.name);
                    move = player1.getMove(board);
                    try {
                        board.submitMove(move, player1.getMarker());
                        break;
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                res = getResult();
                if (res != null) {
                    return res;
                }
                //Bot
                board.printBoard();
                System.out.println("Bot");
                player2.getMove(board);
                res = getResult();
                if (res != null) {
                    return res;
                }
            }
            else {
                //getting player1's move
                while (true) {
                    board.printBoard();
                    System.out.println("Player " + player1.name);
                    move = player1.getMove(board);
                    try {
                        board.submitMove(move, player1.getMarker());
                        break;
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                res = getResult();
                if (res != null) {
                    return res;
                }

                //getting player2's move
                while (true) {
                    board.printBoard();
                    System.out.println("Player " + player2.name);
                    move = player2.getMove(board);
                    try {
                        board.submitMove(move, player2.getMarker());
                        break;
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                res = getResult();
                if (res != null) {
                    return res;
                }
            }
        } while(getResult() == null);

        return getResult();
    }

    private String getResult(){
        //TODO: implement
        // returns the result of the game: the marker of the winner or the word "Tie"
        if (board.isWinner(player1.getMarker())) {
            board.printBoard();
            return "Player " + player1.name + " won";
        }
        else if (board.isWinner(player2.getMarker())) {
            board.printBoard();
            return "Player " + player2.name + " won";
        }
        else if (board.isBoardFull()) {
            board.printBoard();
            return "Tie";
        }
        return null;
    }
}
