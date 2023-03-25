/*
 * Exercício 5
 * ========================================
 * Crie uma classe Retangulo que possua os atributos base e altura. Adicione um método
 * para calcular a área do retângulo e um método para calcular o perímetro. No método
 * para calcular a área, caso a base ou a altura seja menor ou igual a zero, deve ser
 * lançada uma exceção com a mensagem "Base ou altura inválida". No método para calcular
 * o perímetro, caso a base ou a altura seja menor ou igual a zero, deve ser lançada uma
 * exceção com a mensagem "Base ou altura inválida".
 */

package application;

import java.util.Scanner;

import entities.Rectangle;
import exceptions.RectangleDataException;

public class Program {
	
	public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("\nInformações para o retângulo");
    System.out.print("Digite a base: ");
    double base = sc.nextDouble();
    System.out.print("Digite a altura: ");
    double height = sc.nextDouble();

    Rectangle rec = null;

    try {
      rec = new Rectangle(base, height);
    } catch (RectangleDataException e) {
      System.out.println(e.getMessage());
    }

    try {
      System.out.printf("%nÁrea do retângulo: %.2f",rec.calcArea());
      System.out.printf("%nPerímetro do retângulo: %.2f",rec.calcPerimeter());
    } catch (NullPointerException e) {      
    }

    sc.close();

  }

}
