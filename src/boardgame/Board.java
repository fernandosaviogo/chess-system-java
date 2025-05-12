package boardgame;

public class Board {
	
	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	// Metodo construtor
	public Board(int rows, int columns) {
		if (rows < 1 ||  columns < 1) {  // Progamação defensiva para falhas
			throw new BoardException("Error creating board: There must be at least 1 row and 1 column");
		}
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}
	
	// Metodos Gets e Sets  (Não possui o setRows e nem o setColumns para não ter alterações nas peças)
	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}

	// Metodo retorna a matrix na linha e coluna digitadas 
	public Piece piece(int row, int column) {
		if (!positionExists(row, column)) {  // Progamação defensiva para falhas
			throw new BoardException("Position not on the board");
		}
		return pieces[row][column];
	}
	
	// Metodo de sobrecarga para retornar a posição da peça
	public Piece piece(Position position) {
		if (!positionExists(position)) {  // Progamação defensiva para falhas
			throw new BoardException("Position not on the board");
		}
		return pieces[position.getRow()][position.getColumn()];
	}
	
	// Metodo para colocar uma peça na posição
	public void placePiece(Piece piece, Position position) {
		if (thereIsAPiece(position)) {  // Progamação defensiva para falhas
			throw new BoardException("There is already a piece on position " + position);
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;  // Tira a peça da posição nula
	}
	
	// Metodo para remover uma peça em uma posição do tabuleiro
	public Piece removePiece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Position not on the board");
		}
		if (piece(position) == null) {
			return null;
		}
		Piece aux = piece(position);
		aux.position = null;
		pieces[position.getRow()][position.getColumn()] = null;
		return aux;
	}
	
	// MEtodo testa se a posição existe 
	private boolean positionExists(int row, int column) {
		return row >= 0 && row < rows && column >= 0 && column < columns;
	}
	
	// Retorna a posilçao existente de acordo com o metodo acima
	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());
	}
	
	// Metodo verifica se a uma peça na posição
	public boolean thereIsAPiece(Position position) {
		if (!positionExists(position)) {  // Progamação defensiva para falhas
			throw new BoardException("Position not on the board");
		}
		return piece(position) != null;
	}
}
