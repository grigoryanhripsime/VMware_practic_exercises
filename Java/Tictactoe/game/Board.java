package VMware_practic_exercises.Java.Tictactoe.game;

public class Board {

    private final char[][] gameBoard;

    //default Board size
    public Board() {
        gameBoard = new char[3][3];
    }

    //copy constructor
    public Board(Board board) {
        this.gameBoard = board.gameBoard;
    }

    public char[][] getBoard() {
        return gameBoard;
    }

    void printBoard() {
        System.out.println(this);
    }

    void submitMove(String move, char player) throws Exception {
        //TODO: implement
        // Puts the player marker on the board if move is valid
        // move consists of 2 digits representing the row and column, like "12" (first row, second column)
        // if it is an invalid move then false is returned
        int x = move.charAt(0) - '0';
        int y = move.charAt(1) - '0';
        if (x < 0 || x > 2 || y < 0 || y > 2)
            throw new Exception("Invalid input");
        if (gameBoard[x][y] == '\u0000') {
            gameBoard[x][y] = player;
        }
        else {
            throw new Exception("There is a symbol");
        }
    }

    boolean isBoardFull() {
        //TODO: implement
        // Checks whether the board is full
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (gameBoard[i][j] == '\u0000')
                    return false;
        return true;
    }

    boolean isWinner(char player) {
        //TODO: implement
        // Checks whether 'X' or 'O' is a winner
        for (int i = 0; i < 3; i++)
            if (gameBoard[i][0] == player && gameBoard[i][1] == player && gameBoard[i][2] == player)
                return true;
            else if (gameBoard[0][i] == player && gameBoard[1][i] == player && gameBoard[2][i] == player)
                return true;
        if (gameBoard[0][0] == player && gameBoard[1][1] == player && gameBoard[2][2] == player) {
            return true;
        }
        else return gameBoard[0][2] == player && gameBoard[1][1] == player && gameBoard[2][0] == player;
    }

    @Override
    public String toString(){
//        //coverts the board to string like:
//        /*      X | O | X
//                -----------
//                O | X | O
//                -----------
//                O | X | X
//              */
        return " " +
                gameBoard[0][0] + " | " +
                gameBoard[0][1] + " | " +
                gameBoard[0][2] +
                "\n-----------\n" +
                " " +
                gameBoard[1][0] + " | " +
                gameBoard[1][1] + " | " +
                gameBoard[1][2] +
                "\n-----------\n" +
                " " +
                gameBoard[2][0] + " | " +
                gameBoard[2][1] + " | " +
                gameBoard[2][2];
    }

}
*/