package boardgame;

public class Piece {
	
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
	
}
