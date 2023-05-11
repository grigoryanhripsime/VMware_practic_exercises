package VMware_practic_exercises.Java.Tictactoe.game;
public interface Moveable {
    public String getMove(Board board) throws Exception;
    public static final char X_marker = 'X';
    public static final char O_marker = 'O';
    public  String getName();
    public char getMarker();
}
