package day17;


public class Task2 {
    public static void main(String[] args) {

        ChessPiece[][] cb = new ChessPiece[8][8];
        cb[0][0] = ChessPiece.ROOK_BLACK;
        cb[0][5] = ChessPiece.ROOK_BLACK;
        cb[0][6] = ChessPiece.KING_BLACK;

        cb[1][1] = ChessPiece.ROOK_WHITE;
        cb[1][4] = ChessPiece.PAWN_BLACK;
        cb[1][5] = ChessPiece.PAWN_BLACK;
        cb[1][7] = ChessPiece.PAWN_BLACK;

        cb[2][0] = ChessPiece.PAWN_BLACK;
        cb[2][2] = ChessPiece.KNIGHT_BLACK;
        cb[2][6] = ChessPiece.PAWN_BLACK;

        cb[3][0] = ChessPiece.QUEEN_BLACK;
        cb[3][3] = ChessPiece.BISHOP_WHITE;

        cb[4][3] = ChessPiece.BISHOP_BLACK;
        cb[4][4] = ChessPiece.PAWN_WHITE;

        cb[5][4] = ChessPiece.BISHOP_WHITE;
        cb[5][5] = ChessPiece.PAWN_WHITE;

        cb[6][0] = ChessPiece.PAWN_WHITE;
        cb[6][3] = ChessPiece.QUEEN_WHITE;
        cb[6][5] = ChessPiece.PAWN_WHITE;
        cb[6][7] = ChessPiece.PAWN_WHITE;

        cb[7][5] = ChessPiece.ROOK_WHITE;
        cb[7][6] = ChessPiece.KING_WHITE;

        for (int i = 0; i < cb.length; i++) {
            for (int j = 0; j < cb.length; j++)
                if (cb[i][j] == null) {
                    cb[i][j] = ChessPiece.EMPTY;
                }
        }

        ChessBoard chessBoard = new ChessBoard(cb);
        chessBoard.print();
    }
}
