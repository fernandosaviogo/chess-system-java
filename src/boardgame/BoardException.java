package boardgame;

public class BoardException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	// Construtor recebe a mensagem e repassa para o construtor da super classe
	public BoardException(String msg) {
		super(msg);
	}
}
