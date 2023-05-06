package Tictactoe.game;

public class Bot extends Player {
    public Bot(char o, boolean b) {
        this.marker = o;
    }
    String getMove(Board board) {
        String move;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                move = "" + i + j;
                System.out.println(move);
                try {
                    board.submitMove(move, getMarker());
                    return move;
                }
                catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }




        return null;
    }
}
