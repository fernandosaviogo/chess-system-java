package boardgame;

public class Board {
	
	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	// Metodo construtor
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}
	
	// Metodos Gets e Sets
	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	// Metodo retorna a matrix na linha e coluna digitadas 
	public Piece piece(int row, int column) {
		return pieces[row][column];
	}
	
	// Metodo de sobrecarga para retornar a posição da peça
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}
	
	// Metodo para colocar uma peça na posição
	public void placePiece(Piece piece, Position position) {
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;  // Tira a peça da posição nula
	}
}
