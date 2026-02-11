package chess.pecasXadrez;

import chess.ChessPeca;
import chess.Color;
import tabuleirogame.Tabuleiro;

public class King extends ChessPeca {
    public King(Tabuleiro tabuleiro, Color color) {
        super(tabuleiro,color);
    }

    @Override
    public String toString() {
        return "K";
    }
}
