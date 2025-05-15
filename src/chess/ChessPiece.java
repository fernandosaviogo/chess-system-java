package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

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
	
	public ChessPosition getChessPosition() {
		return ChessPosition.fromPosition(position);
	}
	
	// Metodo para verificar se a uma peça do oponente na posição
	protected boolean isThereOpponentPiece(Position position) {
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p != null && p.getColor() != color;
	}
	
}
