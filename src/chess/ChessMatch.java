package chess;

import chess.pecasXadrez.King;
import chess.pecasXadrez.Torre;
import tabuleirogame.Position;
import tabuleirogame.Tabuleiro;

public class ChessMatch {
    private Tabuleiro tabuleiro;

    public ChessMatch() {
        tabuleiro = new Tabuleiro(8,8);
        initialSetup(); //CHamar o initialSetup
    }

    public ChessPeca[][] getPecas() {
     ChessPeca[][] matriz = new ChessPeca[tabuleiro.getRows()][tabuleiro.getColumns()];
     for (int i =0 ; i < tabuleiro.getRows(); i++) {
         for (int j = 0; j < tabuleiro.getColumns(); j++) {
             matriz[i][j] = (ChessPeca) tabuleiro.peca(i,j);
         }
     }
     return matriz;
    }

    private void initialSetup() {
        tabuleiro.placePeca(new Torre(tabuleiro, Color.WHITE), new Position(2,1)); // Linha 2 da matriz , contando apartir do 0 e coluna 1
        tabuleiro.placePeca(new King(tabuleiro, Color.BLACK), new Position(0,4)); //criando rei
        tabuleiro.placePeca(new King(tabuleiro, Color.WHITE), new Position(7,4)); //criando rei
    }

}
