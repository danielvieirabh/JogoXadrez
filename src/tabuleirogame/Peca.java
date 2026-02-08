package tabuleirogame;

public class Peca {
    protected Position position; //Para nao ser visicel no xadrez
    private Tabuleiro tabuleiro;

    public Peca(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
        position = null;
    }
    protected Tabuleiro getTabuleiro() { //Não pode ter set , porque nao quero que ele seja alterado
        return tabuleiro;
    }

}
