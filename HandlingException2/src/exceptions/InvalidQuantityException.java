package exceptions;

public class InvalidQuantityException extends IllegalArgumentException {
	
	private static final long serialVersionUID = 1L;

	public InvalidQuantityException(String message) {
		super(message);
	}
	
}
