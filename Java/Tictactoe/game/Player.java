package VMware_practic_exercises.Java.Tictactoe.game;

import java.util.Scanner;

public class Player implements Moveable {
    protected static int count = 0;
    protected static int getPlayerCount() {
        return count;
    }

    protected static void setPlayerCount(){
        Player.count++;
    }
    protected char marker;
    public String name;

    //playing with computer
    public Player(String name) {
        this.marker = 'X';
        this.name = name;
        //System.out.println(count + "LIne 17 Player");
    }

    //playing with friend
    public Player(char marker, String name) {
        this.marker = marker;
        this.name = name;
        //System.out.println(count + "LIne 25 Player");
    }

    public char getMarker() {
        return marker;
    }

    public String getMove(Board board) throws Exception {
        //TODO: implement
        // Prints the board, asks from the player to make a move, returns the move
        Scanner scanner = new Scanner(System.in);
        System.out.print("Make a move: ");
        String move = scanner.nextLine();
        return move;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Player's name = " + this.name + "\n" +
                "Player's mark = " + this.getMarker() + "\n" +
                "Count of players: " + Player.getPlayerCount();

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