package application;

import tabuleirogame.Position;
import tabuleirogame.Tabuleiro;

public class Program {
    public static void main(String[] args) {

        Position position = new Position(3, 5);
        System.out.println(position.toString());

        Tabuleiro tabuleiro = new Tabuleiro(8, 8);
    }
}
