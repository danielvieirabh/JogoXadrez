package chess.pecasXadrez;

import chess.ChessPeca;
import chess.Color;
import tabuleirogame.Tabuleiro;

public class Torre extends ChessPeca {

    public Torre(Tabuleiro tabuleiro, Color color) {
        super(tabuleiro,color);
    }

    @Override
    public String toString() {
        return "R";
    }
}
