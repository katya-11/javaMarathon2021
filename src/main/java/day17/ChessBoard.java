package day17;

public class ChessBoard {

    private ChessPiece[][] chessBoard;

    ChessBoard(ChessPiece[][] chessBoard) {
        this.chessBoard = chessBoard;
    }


    public ChessPiece[][] getChessBoard() {
        return chessBoard;
    }

    public void print() {
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard.length; j++) {
                System.out.print(chessBoard[i][j].getIcon());
            }
            System.out.println();
        }
    }

}
