package entities;

import exceptions.InvalidPasswordException;

public class Account {
	
	private String email;
	private String password;

	public Account() {
	}
	
	public Account(String email, String password) throws InvalidPasswordException {
		setEmail(email);
		setPassword(password);
	}
	
	/*
	 * Getters / Setters
	 * ========================================
	 */
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) throws InvalidPasswordException {
		validatePassword(password);
		this.password = password;
	}
	
	/*
	 * Main methods
	 * ========================================
	 */
	public void validatePassword(String password) throws InvalidPasswordException {
		if (password.length() < 8) {
			throw new InvalidPasswordException("Erro de cadastro: A senha deve conter pelo menos 8 digitos");
		}
		
		boolean hasLetter = false;
		boolean hasNumber = false;
		for (char c : password.toCharArray()) {
			if (Character.isLetter(c)) {
				hasLetter = true;
			}
			if (Character.isDigit(c)) {
				hasNumber = true;
			}
			if (hasLetter & hasNumber) {
				return;
			}
		}
		throw new InvalidPasswordException("Erro de cadastro: A senha deve conter letras e números");
	}
	
}
