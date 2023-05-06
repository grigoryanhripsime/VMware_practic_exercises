package VMware_practic_exercises.Java.Tictactoe.game;
public class Bot extends Player {
    private int round = 0;
    public Bot(char o, boolean b) {
        this.marker = o;
    }

    boolean makeMove(String move, Board board) {
        try {
            board.submitMove(move, getMarker());
            round++;
            return true;
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
    String getMove(Board board) {
        String move;
        int counter = 0;

        //Emergency
            char[][] game_board = board.getBoard();
            if (game_board[1][1] == 'X') {
                if (game_board[0][0] == 'X') {
                    if (makeMove("22", board)) return "22";
                }
                if (game_board[0][1] == 'X') {
                    if (makeMove("21", board)) return "21";
                }
                if (game_board[0][2] == 'X') {
                    if (makeMove("20", board)) return "20";
                }
                if (game_board[1][0] == 'X') {
                    if (makeMove("12", board)) return "12";
                }
                if (game_board[1][2] == 'X') {
                    if (makeMove("10", board)) return "10";
                }
                if (game_board[2][0] == 'X') {
                    if (makeMove("02", board)) return "02";
                }
                if (game_board[2][1] == 'X') {
                    if (makeMove("01", board)) return "01";
                }
                if (game_board[2][2] == 'X') {
                    if (makeMove("00", board)) return "00";
                }
            }
            if (game_board[1][0] == 'X') {
                if (game_board[0][0] == 'X') {
                    if (makeMove("20", board)) return "20";
                }
                if (game_board[2][0] == 'X') {
                    if (makeMove("00", board)) return "00";
                }
            }
            if (game_board[0][1] == 'X') {
                if (game_board[0][0] == 'X') {
                    if (makeMove("02", board)) return "02";
                }
                if (game_board[0][2] == 'X') {
                    if (makeMove("00", board)) return "00";
                }
            }
            if (game_board[1][2] == 'X') {
                if (game_board[0][2] == 'X') {
                    if (makeMove("22", board)) return "22";
                }
                if (game_board[2][2] == 'X') {
                    if (makeMove("02", board)) return "02";
                }
            }
            if (game_board[2][1] == 'X') {
                if (game_board[2][0] == 'X') {
                    if (makeMove("22", board)) return "22";
                }
                if (game_board[2][2] == 'X') {
                    if (makeMove("20", board)) return "20";
                }
            }


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                move = "" + i + j;
                System.out.println(move);
                if (makeMove(move, board)) return move;
            }
        }
        return null;
    }
}











/*


 */