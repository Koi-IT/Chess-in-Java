import java.util.HashMap;

public class Pawn extends Piece {

    public HashMap<String, Piece> movePawn(HashMap<String, Piece> board, String pieceDestination, String piecePosition) {

        String[] postion = piecePosition.split("");

        int number = Integer.parseInt(postion[1]);

        String space1 = postion[0] + (number + 1);
        String space2 = postion[0] + (number + 2);

        // if spaces in front == e then allow movement to spaces in front
        if (board.get(space1) == "e" && board.get(space2) == "e"  && pieceDestination == "e") {
            board.put(piecePosition, "e");
            board.put(pieceDestination, "p");
        } else if (board.get(space1) == "e" && pieceDestination == "e") {
            board.put(piecePosition, "e");
            board.put(pieceDestination, "p");
        } else {
            System.out.println("Please try again.");
        }

        return board;
    }
    
}
