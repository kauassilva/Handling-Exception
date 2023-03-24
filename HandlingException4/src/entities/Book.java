package entities;

import exceptions.NumberPageException;

public class Book {

	String title;
	String author;
	Integer numberPage;
	
	public Book() {
		
	}
	
	public Book(String title, String author, int numberPage) throws NumberPageException {
		setTitle(title);
		setAuthor(author);
		setNumberPage(numberPage);
	}
	
	/*
	 * Getters / Setters
	 * ========================================
	 */
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public Integer getNumberPage() {
		return numberPage;
	}
	public void setNumberPage(Integer numberPage) throws NumberPageException {
		validateNumberPage(numberPage);
		this.numberPage = numberPage;
	}
	
	/*
	 * Main methods
	 * ========================================
	 */
	private void validateNumberPage(Integer numberPage) throws NumberPageException {
		if (numberPage <= 0) {
			throw new NumberPageException("Erro de cadastro: O livro deve ter pelo menos 1 (uma) página");
		}
	}
	
}
