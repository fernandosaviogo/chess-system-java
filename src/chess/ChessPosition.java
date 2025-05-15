package chess;

import boardgame.Position;

public class ChessPosition {
	
	private char column;
	private int row;
	
	// Metodo construtor
	public ChessPosition(char column, int row) {
		if (column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException("Error instantiating ChessPosition. Valid values are from a1 to h8.");
		}
		this.column = column;
		this.row = row;
	}
	
	// Metodos Gets e Sets (Não possuem metodos set para não haver mudança de valores nas linhas e colunas do tabuleiro
	public char getColumn() {
		return column;
	}

	public int getRow() {
		return row;
	}
	
	// Metodo para posição numera da matriz
	protected Position toPosition() {
		return new Position(8 - row, column - 'a');
	}
	
	// Metodo para retornar a posição conforme descrito no tabuleiro
	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char)('a' + position.getColumn()), 8 - position.getRow());
	}
	
	@Override
	public String toString() {
		return "" + column + row;
	}

}
