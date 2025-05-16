package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Bishop extends ChessPiece {

	// Construtor passa os dados para o construtor da super classe
	public Bishop(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "B";
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

		Position p = new Position(0, 0);

		// Verifica a posição que a peça vai movimentar para Noroeste
		p.setValues(position.getRow() - 1, position.getColumn() - 1); // O -1 esta verificando a casa noroeste da peça
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true; // indica que a casa esta vazia e a peça pode ser movida
			p.setValues(p.getRow() - 1, p.getColumn() - 1); // Realiza o movimento da peça para casa vazia 
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) { // Verifica se a casa tem uma peça do adversario
			mat[p.getRow()][p.getColumn()] = true; // indica que a peça pode ser movida
		}

		// Verifica a posição que a peça vai movimentar para Nordeste
		p.setValues(position.getRow() - 1, position.getColumn() + 1); // O -1 esta verificando a casa a esquerda da peça
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true; // indica que a casa esta vazia e a peça pode ser movida
			p.setValues(p.getRow() - 1, p.getColumn() + 1); // Realiza o movimento da peça para casa vazia a esquerda
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) { // Verifica se a casa final do movimento tem uma peça do adversario
			mat[p.getRow()][p.getColumn()] = true; // indica que a peça pode ser movida
		}

		// Verifica a posição que a peça vai movimentar para Sudeste
		p.setValues(position.getRow() + 1, position.getColumn() + 1); // O +1 esta verificando a casa a direita da peça
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true; // indica que a casa esta vazia e a peça pode ser movida
			p.setValues(p.getRow() + 1, p.getColumn() + 1); // Realiza o movimento da peça para casa vazia a direita
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) { // Verifica se a casa final do movimento tem uma peça do adversario
			mat[p.getRow()][p.getColumn()] = true; // indica que a peça pode ser movida
		}

		// Verifica a posição que a peça vai movimentar para Sudoeste
		p.setValues(position.getRow() + 1, position.getColumn() - 1); // O +1 esta verificando a casa abaixo da peça
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true; // indica que a casa esta vazia e a peça pode ser movida
			p.setValues(p.getRow() + 1, p.getColumn() - 1); // Realiza o movimento da peça para casa vazia abaixo
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) { // Verifica se a casa tem uma peça do adversario
			mat[p.getRow()][p.getColumn()] = true; // indica que a peça pode ser movida
		}

		return mat;
	}

}
