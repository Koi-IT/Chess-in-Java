/** Test Run for Chess.java
 * @author Andrew Johnson
 */

public class ChessRun {
    public static void main(String[] args) {
        ChessBoard board = new ChessBoard();
        Piece pieces = new Piece();
        UserInput userInput = new UserInput();

        board.initializeBoard();
        userInput.readInput(); // Call the method to read input

    }
}
