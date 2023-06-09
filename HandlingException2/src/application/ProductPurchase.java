package application;

import java.math.BigDecimal;
import java.util.Scanner;

import entities.Product;
import exceptions.InsufficientStockException;
import exceptions.InvalidQuantityException;

public class ProductPurchase {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Product product = null;
		
		/*
		 * Solicita ao usuário que insira os dados do produto. Em seguida, cria o objeto da classe
		 * Product e verifica se houve alguma exceção na criação do objeto. Se houver alguma exceção,
		 * uma mensagem será exibida e o programa será encerrado.
		 */
		try {
			System.out.println("Insira os dados do produto");
			System.out.print("Nome: ");
			String name = scanner.nextLine();
			System.out.print("Descrição: ");
			String description = scanner.nextLine();
			System.out.print("Preço: ");
			BigDecimal price = scanner.nextBigDecimal();
			System.out.print("Quantidade em estoque: ");
			int stockQuantity = scanner.nextInt();
		
			product = new Product(name, description, price, stockQuantity);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			System.exit(1);
		}
		
		/*
		 * Solicita que o usuário informe a quantidade desejada do produto a ser comprado. Se houver
		 * estoque suficiente para a compra e o valor não for menor ou igual a zero, o preço total 
		 * da compra é calculado usando o método 'purchase()' e exibido junto com a nova quantidade
		 * em estoque. Caso contrário, uma exceção é lançada e exibida.
		 */
		try {
			System.out.printf("%nQuantos %s deseja comprar: ",product.getName());
			int purchaseQuantity = scanner.nextInt();
			
			BigDecimal totalPrice = product.purchase(purchaseQuantity);

			System.out.printf("%nPreço a pagar: %.2f", totalPrice);
			System.out.printf("%nNova quantidade em estoque: %d",product.getStockQuantity());
		} 
		catch (InsufficientStockException | InvalidQuantityException e) {
			System.out.println(e.getMessage());
		} 
		catch (NullPointerException e) {
			System.out.println("O produto não foi inicializado corretamente");
		}
		/*
		 * Garante que o objeto Scanner seja fechado corretamente, independente do resultado da operação
		 */
		finally {
			scanner.close();				
		}
		
	}
	
}
