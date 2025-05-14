package chess;

import boardgame.Board;
import boardgame.Piece;

public abstract class ChessPiece extends Piece{
	
	private Color color;

	// Metodo construtor
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}
	
	// Metodo Gets e Sets (Só possui o Get porque a cor não pode ser alterada)
	public Color getColor() {
		return color;
	}
	
}
