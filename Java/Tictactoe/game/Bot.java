package VMware_practic_exercises.Java.Tictactoe.game;
import java.lang.Math;
public class Bot extends Player {
    public enum Strategy {
        Beginner ,
        Intermediate,
        Advanced
    };
    private Strategy str;

    public Bot(Strategy strategy) {
        super('O', "Bot");
        str = strategy;
    }

    boolean makeMove(String move, Board board, char marker) {
        try {
            board.submitMove(move, marker);
            return true;
        }
        catch (Exception e) {
        }
        return false;
    }

    String getMove(Board board) {
        String move;
        if (str.equals(Strategy.Beginner)) {
            while (true) {
                int numx = (int) (Math.random() * 3);
                int numy = (int) (Math.random() * 3);
                move = "" + numx + numy;
                System.out.println(move);
                if (makeMove(move, board, this.getMarker())) {
                    System.out.println(move);
                    return move;
                }
            }
        }
        if (str.equals(Strategy.Intermediate)) {
            //Emergency
            char[][] game_board = board.getBoard();
            if (game_board[1][1] == 'X') {
                if (game_board[0][0] == 'X') {
                    if (makeMove("22", board, this.getMarker())) return "22";
                }
                if (game_board[0][1] == 'X') {
                    if (makeMove("21", board, this.getMarker())) return "21";
                }
                if (game_board[0][2] == 'X') {
                    if (makeMove("20", board, this.getMarker())) return "20";
                }
                if (game_board[1][0] == 'X') {
                    if (makeMove("12", board, this.getMarker())) return "12";
                }
                if (game_board[1][2] == 'X') {
                    if (makeMove("10", board, this.getMarker())) return "10";
                }
                if (game_board[2][0] == 'X') {
                    if (makeMove("02", board, this.getMarker())) return "02";
                }
                if (game_board[2][1] == 'X') {
                    if (makeMove("01", board, this.getMarker())) return "01";
                }
                if (game_board[2][2] == 'X') {
                    if (makeMove("00", board, this.getMarker())) return "00";
                }
            }
            if (game_board[1][0] == 'X') {
                if (game_board[0][0] == 'X') {
                    if (makeMove("20", board, this.getMarker())) return "20";
                }
                if (game_board[2][0] == 'X') {
                    if (makeMove("00", board, this.getMarker())) return "00";
                }
            }
            if (game_board[0][1] == 'X') {
                if (game_board[0][0] == 'X') {
                    if (makeMove("02", board, this.getMarker())) return "02";
                }
                if (game_board[0][2] == 'X') {
                    if (makeMove("00", board, this.getMarker())) return "00";
                }
            }
            if (game_board[1][2] == 'X') {
                if (game_board[0][2] == 'X') {
                    if (makeMove("22", board, this.getMarker())) return "22";
                }
                if (game_board[2][2] == 'X') {
                    if (makeMove("02", board, this.getMarker())) return "02";
                }
            }
            if (game_board[1][0] == 'X') {
                if (game_board[0][0] == 'X') {
                    if (makeMove("20", board, this.getMarker())) return "20";
                }
                if (game_board[2][0] == 'X') {
                    if (makeMove("00", board, this.getMarker())) return "00";
                }
            }

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    move = "" + i + j;
                    System.out.println(move);
                    if (makeMove(move, board, this.getMarker())) return move;
                }
            }
        }
        if (str.equals(Strategy.Advanced)) {
            char[][] game_board = board.getBoard();
            //checking for bot's winning position
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    move = "" + i + j;
                    if (makeMove(move, board, 'O')) {
                        if (board.isWinner('O')) {
                            return move;
                        }
                        else {
                            game_board[i][j] = 0;
                        }
                    }
                }
            }

            //checking for another players winning position
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    move = "" + i + j;
                    if (makeMove(move, board, 'X')) {
                        if (board.isWinner('X')) {
                            game_board[i][j] = 0;
                            makeMove(move, board, 'O');
                            return move;
                        }
                        else {
                            game_board[i][j] = 0;
                        }
                    }
                }
            }

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    move = "" + i + j;
                    if (makeMove(move, board, 'O')) {
                        for (int k = 0; k < 3; k++) {
                            for (int l = 0; l < 3; l++) {
                                move = "" + k + l;
                                if (makeMove(move, board, 'O')) {
                                    if (board.isWinner('O')) {
                                        game_board[i][j] = 0;
                                        return move;
                                    } else {
                                        game_board[k][l] = 0;
                                    }
                                }
                                if (k == 2 && l == 2) {
                                    game_board[i][j] = 0;
                                }
                            }
                        }
                    }
                }
            }


            while (true) {
                int numx = (int) (Math.random() * 3);
                int numy = (int) (Math.random() * 3);
                move = "" + numx + numy;
                System.out.println(move);
                if (makeMove(move, board, 'O')) {
                    return move;
                }
            }
        }
        return null;
    }
}


package Tictactoe.game;
import java.lang.Math;
public class Bot implements Moveable {
    static int count = 0;
    private String name;

    private char marker;


    protected static int getPlayerCount() {
        return Bot.count;
    }
    public enum Strategy {
        Beginner ,
        Intermediate,
        Advanced
    };
    private Strategy str;

    protected static void setPlayerCount() {
        Bot.count++;
    }
    public Bot(Strategy strategy) {
        this.name = "Bot";
        this.marker = 'O';
        str = strategy;
        //System.out.println(count + "LIne 18 Bot");
        this.setPlayerCount();
    }

    boolean makeMove(String move, Board board, char marker) {
        try {
            board.submitMove(move, marker);
            return true;
        }
        catch (Exception e) {
        }
        return false;
    }

    @Override
    public String getMove(Board board) throws Exception {
        String move;
        if (str.equals(Strategy.Beginner)) {
            while (true) {
                int numx = (int) (Math.random() * 3);
                int numy = (int) (Math.random() * 3);
                move = "" + numx + numy;
                System.out.println(move);
                if (makeMove(move, board, this.getMarker())) {
                    System.out.println(move);
                    return move;
                }
            }
        }
        if (str.equals(Strategy.Intermediate)) {
            //Emergency
            char[][] game_board = board.getBoard();
            if (game_board[1][1] == 'X') {
                if (game_board[0][0] == 'X') {
                    if (makeMove("22", board, this.getMarker())) return "22";
                }
                if (game_board[0][1] == 'X') {
                    if (makeMove("21", board, this.getMarker())) return "21";
                }
                if (game_board[0][2] == 'X') {
                    if (makeMove("20", board, this.getMarker())) return "20";
                }
                if (game_board[1][0] == 'X') {
                    if (makeMove("12", board, this.getMarker())) return "12";
                }
                if (game_board[1][2] == 'X') {
                    if (makeMove("10", board, this.getMarker())) return "10";
                }
                if (game_board[2][0] == 'X') {
                    if (makeMove("02", board, this.getMarker())) return "02";
                }
                if (game_board[2][1] == 'X') {
                    if (makeMove("01", board, this.getMarker())) return "01";
                }
                if (game_board[2][2] == 'X') {
                    if (makeMove("00", board, this.getMarker())) return "00";
                }
            }
            if (game_board[1][0] == 'X') {
                if (game_board[0][0] == 'X') {
                    if (makeMove("20", board, this.getMarker())) return "20";
                }
                if (game_board[2][0] == 'X') {
                    if (makeMove("00", board, this.getMarker())) return "00";
                }
            }
            if (game_board[0][1] == 'X') {
                if (game_board[0][0] == 'X') {
                    if (makeMove("02", board, this.getMarker())) return "02";
                }
                if (game_board[0][2] == 'X') {
                    if (makeMove("00", board, this.getMarker())) return "00";
                }
            }
            if (game_board[1][2] == 'X') {
                if (game_board[0][2] == 'X') {
                    if (makeMove("22", board, this.getMarker())) return "22";
                }
                if (game_board[2][2] == 'X') {
                    if (makeMove("02", board, this.getMarker())) return "02";
                }
            }
            if (game_board[1][0] == 'X') {
                if (game_board[0][0] == 'X') {
                    if (makeMove("20", board, this.getMarker())) return "20";
                }
                if (game_board[2][0] == 'X') {
                    if (makeMove("00", board, this.getMarker())) return "00";
                }
            }

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    move = "" + i + j;
                    System.out.println(move);
                    if (makeMove(move, board, this.getMarker())) return move;
                }
            }
        }
        if (str.equals(Strategy.Advanced)) {
            char[][] game_board = board.getBoard();
            //checking for bot's winning position
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    move = "" + i + j;
                    if (makeMove(move, board, 'O')) {
                        if (board.isWinner('O')) {
                            return move;
                        }
                        else {
                            game_board[i][j] = 0;
                        }
                    }
                }
            }

            //checking for another players winning position
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    move = "" + i + j;
                    if (makeMove(move, board, 'X')) {
                        if (board.isWinner('X')) {
                            game_board[i][j] = 0;
                            makeMove(move, board, 'O');
                            return move;
                        }
                        else {
                            game_board[i][j] = 0;
                        }
                    }
                }
            }

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    move = "" + i + j;
                    if (makeMove(move, board, 'O')) {
                        for (int k = 0; k < 3; k++) {
                            for (int l = 0; l < 3; l++) {
                                move = "" + k + l;
                                if (makeMove(move, board, 'O')) {
                                    if (board.isWinner('O')) {
                                        game_board[i][j] = 0;
                                        return move;
                                    } else {
                                        game_board[k][l] = 0;
                                    }
                                }
                                if (k == 2 && l == 2) {
                                    game_board[i][j] = 0;
                                }
                            }
                        }
                    }
                }
            }
            if (makeMove("11", board, 'O'))
                return "11";


            while (true) {
                int numx = (int) (Math.random() * 3);
                int numy = (int) (Math.random() * 3);
                move = "" + numx + numy;
                if (makeMove(move, board, 'O')) {
                    return move;
                }
            }
        }
        return null;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public char getMarker() {
        return this.marker;
    }

    @Override
    public String toString() {
        return "Bot's name = " + this.name + "\n" +
                "Bot's mark = " + this.getMarker() + "\n" +
                "Count of bots: " + Bot.getPlayerCount();
    }
}
