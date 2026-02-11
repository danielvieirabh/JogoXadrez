package application;

import chess.ChessPeca;

public class UI {
    public static void printTabuleiro(ChessPeca[][] pecas) {
        for (int i = 0; i < pecas.length; i++) {
            System.out.print(( 8 - i) + " ");
            for (int j = 0; j < pecas.length; j++) {
                printPeca(pecas[i][j]);
            }
            System.out.println();//Quebra de linha do tabuleiro
        }
        System.out.println("  a b c d e f g h");
    }

    private static void printPeca(ChessPeca peca) {
        if (peca == null) { //Nao tinha peca na posicao do tabuleiro
            System.out.print("-");
        }
        else {
            System.out.print(peca);
        }
        System.out.print(" ");//para que as pecas nao fiquem grudadas
    }
}
