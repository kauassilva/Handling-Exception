/*
 * Exercício 4
 * ----------------------------------------
 * Suponha que você está criando um sistema de uma biblioteca e precisa criar uma 
 * classe para representar um livro. A classe Livro terá um construtor que recebe 
 * como parâmetros o título, o autor e o número de páginas do livro. Porém, você
 * precisa garantir que o número de páginas seja um valor positivo, caso contrário,
 * uma exceção deve ser lançada.
 */

package application;

import java.util.Scanner;

import entities.Book;
import exceptions.NumberPageException;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cadastro de livro");
		System.out.print("Digite o título: ");
		String title = sc.nextLine();
		System.out.print("Digite o nome do(a) autor(a): ");
		String author = sc.nextLine();
		System.out.print("Digite a quantidade de páginas: ");
		int numberPage = sc.nextInt();
		
		try {
			Book b1 = new Book(title, author, numberPage);
			System.out.println("\nLivro cadastrado!");
		} catch (NumberPageException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
		
	}
	
}
