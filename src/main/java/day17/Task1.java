package day17;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {

        ArrayList<ChessPiece> chessPieces = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            chessPieces.add(ChessPiece.PAWN_WHITE);
        }

        for (int i = 0; i < 4; i++) {
            chessPieces.add(ChessPiece.ROOK_BLACK);
        }

        for (ChessPiece chessPiece : chessPieces) {
            System.out.print(chessPiece.getIcon() + " ");
        }
    }
}