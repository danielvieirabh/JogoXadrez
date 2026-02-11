package chess;

import tabuleirogame.Peca;
import tabuleirogame.Tabuleiro;

public class ChessPeca extends Peca { //PecaXadrez
    private Color color;


    public ChessPeca(Tabuleiro tabuleiro, Color color) {
        super(tabuleiro);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

}
