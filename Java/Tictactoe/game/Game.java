package Tictactoe.game;
import java.util.Scanner;
public class Game {
    private final Player player1;
    private final Player player2;
    private final Bot bot;
    private final Board board;

    //when player choose to play with computer
    public Game(Player player, Bot.Strategy strategy) {
        System.out.println("You are playing with a bot, let's start!");
        this.player1 = player;
        this.bot = new Bot(strategy);
        this.board = new Board();
        System.out.println(player1);
        System.out.println(bot);
        player2 = null;
    }

    //when player choose playing with friend
    public Game(Player player1, Player player2){
        System.out.println("Player1\n" + player1 + "\nPlayer2\n" + player2);
        this.player1 = player1;
        this.player2 = player2;
        this.board = new Board();
        this.bot = null;
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
            if (bot != null) {
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
                bot.getMove(board);
                res = getResult();
                if (res != null) {
                    return res;
                }
            }
            else if (player2 != null){
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
                    System.out.println("Player " + player2.getName());
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
        if (player2 != null) {
            //TODO: implement
            // returns the result of the game: the marker of the winner or the word "Tie"
            if (board.isWinner(player1.getMarker())) {
                board.printBoard();
                return "Player " + player1.name + " won";
            }
            else if (board.isWinner(player2.getMarker())) {
                board.printBoard();
                return "Player " + player2.getName() + " won";
            }
        }
        else if (bot != null) {
            if (board.isWinner(player1.getMarker())) {
                board.printBoard();
                return "Player " + player1.name + " won";
            }
            else if (board.isWinner(bot.getMarker())) {
                board.printBoard();
                return "Player " + bot.getName() + " won";
            }
        }
        if (board.isBoardFull()) {
            board.printBoard();
            return "Tie";
        }
        return null;
    }
}