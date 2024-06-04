/** Chess Board
 * @author Andrew Johnson
 */
import java.io.*;
import java.util.*;
public class ChessBoard {

        public void placePieces() {
        System.out.println("\nR " + "N " + "B " + "K " + "Q " + "B " + "N " +  "R ");
        System.out.println("p " + "p " + "p " + "p " + "p " + "p " + "p " + "p ");
        System.out.println("+ " + "_ " + "+ " + "_ " + "+ " + "_ " + "+ " + "_ ");
        System.out.println("_ " + "+ " + "_ " + "+ " + "_ " + "+ " + "_ " + "+ ");
        System.out.println("+ " + "_ " + "+ " + "_ " + "+ " + "_ " + "+ " + "_ ");
        System.out.println("_ " + "+ " + "_ " + "+ " + "_ " + "+ " + "_ " + "+ ");
        System.out.println("p " + "p " + "p " + "p " + "p " + "p " + "p " + "p ");
        System.out.println("R " + "N " + "B " + "K " + "Q " + "B " + "N " +  "R "+ "\n");

    }

    public void initializeBoard() {
        // Map<String, String> map = new HashMap<>();

        // map.put("a1", "1");
        // map.put("a1", "1");
        // map.put("a1", "1");
        // map.put("a1", "1");
        // map.put("a1", "1");
        // map.put("a1", "1");
        // map.put("a1", "1");
        // map.put("b2", "2");
        // map.put("c3", "3");
        // map.put("d4", "4");
        // map.put("e5", "5");
        // map.put("f6", "6");
        // map.put("g7", "7");
        // map.put("h8", "8");

        ArrayList<String> board = new ArrayList<String>();
        ArrayList<String> boardColor = new ArrayList<String>();
        String[] horizontalBoard = {"1", "2", "3", "4", "5", "6", "7", "8"};
        String[]  verticalBoard = {"a", "b", "c", "d", "e", "f", "g", "h"};

        for (int i1 = 0; i1 < horizontalBoard.length; i1++) {
            for (int i2 = 0; i2 < verticalBoard.length; i2++){
                board.add(verticalBoard[i1].concat(horizontalBoard[i2]));
            }
        }

        for (int i = 0; i < board.size(); i++) {
            int size = boardColor.size();
            if (size % 2 == 0 ) {
                boardColor.add("b");
            } else {
                boardColor.add("w");
            }
        }

        System.out.println(board);
        System.out.println(boardColor);
    }

    public void printBoard() {

    }

    public void movePiece(x, y) {

    }

    public void inCheck() {

    }

    public void checkmate() {

    }

    public void stalemate() {

    }
} 