/*
 * Exercício 3
 * ----------------------------------------
 * Crie um sistema que receba um email e uma senha para o cadastro de um usuário,
 * mas a senha deve conter pelo menos 8 caracteres, entre letras e números.
 */

package application;

import java.util.Scanner;

import entities.Account;
import exceptions.InvalidPasswordException;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira um email: ");
		String email = sc.nextLine();
		System.out.print("Insira uma senha: ");
		String password = sc.nextLine();
		
		try {
			Account acc = new Account(email, password);
			System.out.println("Cadastro efetuado");
		} catch (InvalidPasswordException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
		
	}

}
