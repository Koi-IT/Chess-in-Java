/** Chess Board
 * @author Andrew Johnson
 */
import java.io.*;
import java.util.*;
public class ChessBoard {

    public HashMap<String, String> initializeBoard() {

        // Create board Array
        HashMap<String, Piece> board = new HashMap<>();

        // Create notation of the board
        String[] horizontalBoard = {"1", "2", "3", "4", "5", "6", "7", "8"};
        String[]   verticalBoard = {"a", "b", "c", "d", "e", "f", "g", "h"};

        // Positions for starting pieces
        String[]   pawnStartingPosition = {"a2", "a7", "b2", "b7", "c2", "c7", "d2", "d7", "e2", "e7", "f2", "f7", "g2", "g7", "h2", "h7"};
        String[] bishopStartingPosition = {"c1", "c8", "f1", "f8"};
        String[]  knightStartingPostion = {"b1", "b8", "g1", "g8"};
        String[]    rookStartingPostion = {"a1", "a8", "h1", "h8"};
        String[]    kingStartingPostion = {"d1", "d8"};
        String[]   queenStartingPostion = {"e1", "e8"};

        // Build map
        for (int i1 = 0; i1 < horizontalBoard.length; i1++) {

            for (int i2 = 0; i2 < verticalBoard.length; i2++) {

                String notation = verticalBoard[i2].concat(horizontalBoard[i1]);
                EmptyPlace empty = new EmptyPlace();

                board.put(notation, empty);
            }
        }

        for (int i = 0; i < pawnStartingPosition.length; i++){
            Pawn pawn = new Pawn();

            if ( ) {
                board.put(pawnStartingPosition[i], pawn);
            } else {

            }
        }

        for (int i = 0; i < bishopStartingPosition.length; i++){
            

            board.put(bishopStartingPosition[i], "B");
            board.put(knightStartingPostion[i], "N");
            board.put(rookStartingPostion[i], "R");
        }

        for (int i = 0; i < kingStartingPostion.length; i++) {
            board.put(kingStartingPostion[i], "K");
            board.put(queenStartingPostion[i], "Q");
        }

        return board;
    }

    public HashMap<String, Piece> printBoard(HashMap<String, Piece> board) {
        System.out.println(board.get("a8") + " " + board.get("b8") + " "  + board.get("c8") + " "  + board.get("d8") + " "  + board.get("e8") + " "  + board.get("g8") + " "  + board.get("h8"));
        System.out.println(board.get("a7") + " "  + board.get("b7") + " "  + board.get("c7") + " "  + board.get("d7") + " "  + board.get("e7") + " "  + board.get("g7") + " "  + board.get("h7"));
        System.out.println(board.get("a6") + " "  + board.get("b6") + " "  + board.get("c6") + " "  + board.get("d6") + " "  + board.get("e6") + " "  + board.get("g6") + " "  + board.get("h6"));
        System.out.println(board.get("a5") + " "  + board.get("b5") + " "  + board.get("c5") + " "  + board.get("d5") + " "  + board.get("e5") + " "  + board.get("g5") + " "  + board.get("h5"));
        System.out.println(board.get("a4") + " "  + board.get("b4") + " "  + board.get("c4") + " "  + board.get("d4") + " "  + board.get("e4") + " "  + board.get("g4") + " "  + board.get("h4"));
        System.out.println(board.get("a3") + " "  + board.get("b3") + " "  + board.get("c3") + " "  + board.get("d3") + " "  + board.get("e3") + " "  + board.get("g3") + " "  + board.get("h3"));
        System.out.println(board.get("a2") + " "  + board.get("b2") + " "  + board.get("c2") + " "  + board.get("d2") + " "  + board.get("e2") + " "  + board.get("g2") + " "  + board.get("h2"));
        System.out.println(board.get("a1") + " "  + board.get("b1") + " "  + board.get("c1") + " "  + board.get("d1") + " "  + board.get("e1") + " "  + board.get("g1") + " "  + board.get("h1") + "\n");

        return board;
    }

    public HashMap<String, String> movePiece(HashMap<String, String> board, String piecePosition, String pieceDestination, String movingPiece) {

        if (movingPiece == "p") {
            Pawn pawn = new Pawn();

            HashMap<String, String> updatedBoard = pawn.movePawn(board, pieceDestination, piecePosition);
        } if (movingPiece == "R") {
            Rook rook = new Rook();

            HashMap<String, String> updatedBoard = rook.moveRook(board, pieceDestination, piecePosition);
        } if (movingPiece == "N") {
            Knight knight = new Knight();
            
            HashMap<String, String> updatedBoard = knight.moveKnight(board, pieceDestination, piecePosition);
        } if (movingPiece == "B") {
            Bishop bishop = new Bishop();

            HashMap<String, String> updatedBoard = bishop.moveBishop(board, pieceDestination, piecePosition);
        } if (movingPiece == "K") {
            King king = new King();

            HashMap<String, String> updatedBoard = king.moveKing(board, pieceDestination, piecePosition);
        } if (movingPiece == "Q") {
            Queen queen = new Queen();

            HashMap<String, String> updatedBoard = queen.moveQueen(board, pieceDestination, piecePosition);
        } 

        return updatedBoard;
    }

    public void inCheck() {

    }

    public void checkmate() {

    }

    public void stalemate() {

    }
} 