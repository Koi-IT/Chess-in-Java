import java.util.HashMap;

/** Test Run for Chess.java
 * @author Andrew Johnson
 */

public class ChessRun {
    public static void main(String[] args) {

        // Instatiate ChessBoard and UserInput
        ChessBoard newBoard = new ChessBoard();
        UserInput userInput = new UserInput();

        // Initialize board
        HashMap<String, String> board = newBoard.initializeBoard();
        newBoard.printBoard(board);

        // Choose Black/White
        String message = "White or Black?";
        userInput.readInput(board, message); 
        
        while(true) {

            userInput.readInput(board, message);
        }


    }
}
