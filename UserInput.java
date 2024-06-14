import java.io.*;
import java.util.*;

public class UserInput {
    public void readInput(HashMap<String, String> board, String message) {
        try {
            // Creating BufferedReader Object
            BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));

            // Instantiate Chess Movement
            ChessBoard printBoard = new ChessBoard();
            printBoard.printBoard(board);

            // Reading String input
            System.out.print(message);

            // Instantiate Chess Movement
            String userInput = bfn.readLine();
            // processInput(board,userInput);

            // Printing String
            System.out.println("Entered String: " + userInput);

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input for an integer: " + e.getMessage());
        }
    }

    public String[] processInput(HashMap<String, String> board ,String userInput) {
        String[] userPieceAndDestination = userInput.split("");

        String movingPiece = userPieceAndDestination[0];

        String pieceDestination = userPieceAndDestination[1] + userPieceAndDestination[2];

        ChessBoard movePiece = new ChessBoard();

        movePiece.movePiece(board, , pieceDestination, movingPiece);

        return userPieceAndDestination;
    }
}
