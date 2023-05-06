package VMware_practic_exercises.Java.Tictactoe.game;

public class Game {
    private final Player player1;
    private final Player player2; //Bot
    private final Board board;

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
            //getting player's move
            while (true) {
                board.printBoard();
                System.out.println("Player1");
                move = player1.getMove(board);
                try {
                    board.submitMove(move, player1.getMarker());
                    break;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            if (getResult() != null) {
                return getResult();
            }


            //Bot
            board.printBoard();
            System.out.println("Bot");
            player2.getMove(board);
            if (getResult() != null) {
                return getResult();
            }
            //Player2
            /*
            while (true) {
                board.printBoard();
                System.out.println("Player2");
                move = player2.getMove(board);
                try {
                    board.submitMove(move, player2.getMarker());
                    break;
                }
                catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                finally {
                    if (getResult() != null) {
                        return getResult();
                    }
                }
            }
             */
        } while(getResult() == null);

        return getResult();
    }

    private String getResult(){
        //TODO: implement
        // returns the result of the game: the marker of the winner or the word "Tie"
        if (board.isWinner(player1.getMarker())) {
            board.printBoard();
            return "Player " + player1.getMarker() + " won";
        }
        else if (board.isWinner(player2.getMarker())) {
            board.printBoard();
            return "Player " + player2.getMarker() + " won";
        }
        else if (board.isBoardFull()) {
            board.printBoard();
            return "Tie";
        }
        return null;
    }
}
