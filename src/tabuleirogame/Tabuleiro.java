package tabuleirogame;

public class Tabuleiro {
    private Integer rows;
    private Integer columns;
    private  Peca[][] pecas; //Matriz

    public Tabuleiro(Integer rows, Integer columns) {
        this.rows = rows;
        this.columns = columns;
        pecas = new Peca[rows][columns]; //quantidade de linhas e colunas que sera informada
    }

    public Integer getColumns() {
        return columns;
    }

    public void setColumns(Integer columns) {
        this.columns = columns;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public Peca peca(int row , int column) {
        return pecas[row][column];
    }

    public Peca peca(Position position) {
        return pecas[position.getRow()][position.getColumn()];
    }

    public void placePeca(Peca peca, Position position) {
        pecas[position.getRow()][position.getColumn()] = peca; //Atribuir a ela a peca
        peca.position = position;

    }

}
