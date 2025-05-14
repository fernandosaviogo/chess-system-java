package boardgame;

public abstract class Piece {
	
	protected Position position;
	
	private Board board;

	// Metodo construtor
	public Piece(Board board) {
		this.board = board;
	}
	
	// Metodos Gets e Sets
	protected Board getBoard() {
		return board;
	}
	
	// Metodo de possiveis movimentações de uma peça
	public abstract boolean[][] possibleMoves();
	
	// Metodo para possivel mevimentação de uma peça
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	// Metodo para verificar se a peça tem um movimento possivel
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if (mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
}
