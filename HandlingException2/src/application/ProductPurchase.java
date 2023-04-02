/*
 * Exercício 2
 * ----------------------------------------
 * Suponha que você esteja desenvolvendo um sistema para uma empresa que fabrica
 * produtos eletrônicos. Você precisa criar uma classe Produto com atributos como
 * nome, descrição, preço, quantidade em estoque, etc. Além disso, você precisa
 * implementar um método que permita que o usuário compre um produto, que deve diminuir
 * a quantidade em estoque do produto.
 * 
 * Para fazer isso, você pode criar um método "comprar()" na classe Produto que
 * recebe um parâmetro inteiro (a quantidade de produtos a serem comprados) e diminui
 * a quantidade em estoque do produto em relação à quantidade comprada. No entanto,
 * o método deve verificar se a quantidade a ser comprada é maior do que a quantidade
 * em estoque e, nesse caso, lançar uma exceção indicando que não há estoque suficiente.
 * 
 * Portanto, é necessário que o desenvolvedor faça o tratamento de exceções adequado 
 * ao implementar o método comprar().
 */

package application;

import java.util.Scanner;

import entities.Product;
import exceptions.BusinessException;

public class ProductPurchase {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Product product = null;
		
		System.out.println("Insira os dados do produto");
		System.out.print("Nome: ");
		String name = scanner.nextLine();
		System.out.print("Descrição: ");
		String description = scanner.nextLine();
		System.out.print("Preço: ");
		double price = scanner.nextDouble();
		System.out.print("Quantidade em estoque: ");
		int stockQuantity = scanner.nextInt();
		
		/*
		 * Instancia a classe 'Produto' com base nos dados inseridos. Caso o usuário digite
		 * menor ou igual a 0 (zero) no parâmetro quantityStock, deve retornar uma exceção
		 * personalizada
		 */
		try {
			product = new Product(name, description, price, stockQuantity);
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
		
		/*
		 * Solicita ao usuário a quantidade de produtos que deseja comprar e, em seguida,
		 * chama o método comprar() para atualizar a quantidade em estoque. Se o usuário digitar
		 * uma quantidade inválida, uma exceção personalizada deverá ser exibida
		 */
		try {
			System.out.println();
			System.out.printf("Quantos %s deseja comprar: ",product.getName());
			int quantityProduct = scanner.nextInt();
			
			try {
				product.buy(quantityProduct);

				System.out.printf("%nPreço a pagar: %.2f",product.calcTotalPrice(quantityProduct));
				System.out.printf("%nNova quantidade em estoque: %d",product.getStockQuantity());
			} catch (BusinessException e) {
				System.out.println(e.getMessage());
			}
		}
		
		/* 
		 * Caso não seja possível instanciar o Produto o sistema não deverá mostrar nada. 
		 * Ou então, deverá mostrar a exceção NullPointerException
		 */
		catch (NullPointerException e) {
			// Cannot invoke "entities.Product.getName()" because "pro" is null
			//System.out.println(e.getMessage());
		}
		
		scanner.close();	
		
	}

}
