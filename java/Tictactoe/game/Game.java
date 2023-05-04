package Tictactoe.game;

public class Game {
    private Player player1;
    private Player player2;
    private Board board;

    public Game() {
        this.player1 = new Player();
        this.player2 = new Player('O');
        this.board = new Board();
    }

    public Game(Board board){
        this.player1 = new Player();
        this.player2 = new Player('O');
        this.board = board;
    }

    public Game(Board board, Player player1, Player player2){
        this.player1 = player1;
        this.player2 = player2;
        this.board = board;
    }

    public String playGame() {
        //TODO: implement
        // Plays the game:
        // 1. Prints the board
        // 2. Asks from a current player to make a move
        // 3. Submits the move, if the move was submitted then continues from point 1 the same thing for the other player,
        //    if the move was not submitted (invalid move) then prints appropriate message and asks to make a move again from the same player
        // Keeps doing the above steps until one of the players wins, or the board gets full and no one wins
        // At the end this method should print the final result of the board and return the marker of the winner or the word "Tie" if no one wins
        String move;
        do {
            do {
                board.printBoard();
                System.out.println("Player1");
                move = player1.getMove(board);
            } while (board.submitMove(move, player1.getMarker()) == false);
            do {
                board.printBoard();
                System.out.println("Player2");
                move = player2.getMove(board);
            } while (board.submitMove(move, player2.getMarker()) == false);
        } while(getResult() == null);

        return getResult();
    }

    private String getResult(){
        //TODO: implement
        // returns the result of the game: the marker of the winner or the word "Tie"
        if (board.isWinner(player1.getMarker())) {
            return "" + player1.getMarker();
        }
        else if (board.isWinner(player2.getMarker())) {
            return "" + player2.getMarker();
        }
        else if (board.isBoardFull()) {
            return "Tie";
        }
        return null;
    }
}
