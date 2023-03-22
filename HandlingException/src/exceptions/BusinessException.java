package exceptions;

public class BusinessException extends RuntimeException {

	// Não é necessário, fiz para remover o warning
	private static final long serialVersionUID = 1L; 

	/*
	 * O construtor recebe uma mensagem de erro como parâmetro e chama o construtor
	 * da classe pai 'RuntimeException' passando essa Mensagem de erro como argumento
	 * usando o método 'super(msg)'. Isso permite que a mensagem de erro seja armazenada
	 * na exceção e possa ser posteriormente recuperada e exibida ao usuário ou registrado
	 * em logs para fins de depuração.
	 */
	public BusinessException(String msg) {
		super(msg); // getMessage()
	}
	
}
