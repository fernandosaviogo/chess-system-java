package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece{
	
	// Construtor passa os dados para o construtor da super classe
	public King(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString( ) {
		return "K";
	}

	@Override
	public boolean[][] possibleMovies() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		return null;
	}
}
