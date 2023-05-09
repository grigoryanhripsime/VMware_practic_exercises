package VMware_practic_exercises.Java.Tictactoe.game;

import java.util.Scanner;

public class Player {
    protected char marker;
    public String name;

    //playing with computer
    public Player(String name) {
        this.marker = 'X';
        this.name = name;
    }

    //playing with friend
    public Player(char marker, String name) {
        this.marker = marker;
        this.name = name;
    }

    char getMarker() {
        return marker;
    }

    String getMove(Board board) throws Exception {
        //TODO: implement
        // Prints the board, asks from the player to make a move, returns the move
        Scanner scanner = new Scanner(System.in);
        System.out.print("Make a move: ");
        String move = scanner.nextLine();
        return move;
    }

    @Override
    public String toString() {
        return "Player's name = " + this.name + "\n" +
                "Player's mark = " + this.getMarker();

    }

    @Override
    public boolean equals(Object player) {
        if (! (player instanceof Player)) {
            return false;
        }
        if (this == player)
            return true;
        if (this.name == ((Player) player).name || this.getMarker() == ((Player) player).getMarker()) {
            return true;
        }
        return false;
    }
}

