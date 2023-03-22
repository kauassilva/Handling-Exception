package exceptions;

public class BusinessException extends Exception {

	// Não é necessário, fiz para remover o warning
	private static final long serialVersionUID = 1L;

	public BusinessException(String msg) {
		super(msg);
	}
	
}
