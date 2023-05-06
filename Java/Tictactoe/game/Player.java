package VMware_practic_exercises.Java.Tictactoe.game;

import java.util.Scanner;

public class Player {
    private char marker;

    public Player() {
        this.marker = 'X';
    }

    public Player(char marker) {
        this.marker = marker;
    }


    char getMarker() {
        return marker;
    }

    String getMove(Board board) {
        //TODO: implement
        // Prints the board, asks from the player to make a move, returns the move
        Scanner scanner = new Scanner(System.in);
        System.out.print("Make a move: ");
        String move = scanner.nextLine();
        return move;
    }
}
