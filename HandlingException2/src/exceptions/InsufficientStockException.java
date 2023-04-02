package exceptions;

public class InsufficientStockException extends IllegalArgumentException {

	private static final long serialVersionUID = 1L;

	public InsufficientStockException(String message) {
		super(message);
	}
	
}
