package entities;

import java.math.BigDecimal;

import exceptions.InsufficientStockException;
import exceptions.InvalidQuantityException;

public class Product {
	
	private String name;
	private String description;
	private BigDecimal price;
	private Integer stockQuantity;
	
	public Product() {
	}

	public Product(String name, String description, BigDecimal price, Integer stockQuantity) {
		setName(name);
		setDescription(name);
		setPrice(price);
		setQuantityStock(stockQuantity);
	}

	/*
	 * O método chama o método 'ValidatePurchase' para validar exceções. Caso não retorne uma exceção,
	 * o método reduz o estoque e calcula o preço final da compra, retornando um BigDecimal.
	 */
	public BigDecimal purchase(int purchaseQuantity) {
		validatePurchase(purchaseQuantity);		
		
		stockQuantity -= purchaseQuantity;
		BigDecimal finalPrice = price.multiply(new BigDecimal(purchaseQuantity));
		
		return finalPrice;
	}
	
	/*
	 * O método verifica se a quantidade desejada é menor ou igual a zero e se é maior 
	 * que a quantidade em estoque, lançando exceções personalizadas do tipo 
	 * InvalidQuantityException e InsufficientStockException.
	 */
	private void validatePurchase(int purchaseProduct) throws InvalidQuantityException, InsufficientStockException {
		if (purchaseProduct <= 0) {
			throw new InvalidQuantityException("Erro de compra: Quantidade desejada do produto deve ser pelo menos 1");
		}
		if (purchaseProduct > stockQuantity) {
			throw new InsufficientStockException("Erro de compra: Quantidade insuficiente em estoque");
		}
	}
	
	/*
	 * Getters / Setters
	 * ========================================
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null || name.isBlank()) {
			throw new IllegalArgumentException("Erro de cadastro: O nome do produto não pode ser vazio");
		}
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		if (price.compareTo(BigDecimal.ZERO) <= 0) {
			throw new IllegalArgumentException("Erro de cadastro: O preço do produto deve ser maior que 0");
		}
		this.price = price;
	}

	public Integer getStockQuantity() {
		return stockQuantity;
	}

	public void setQuantityStock(Integer stockQuantity) {
		if (stockQuantity <= 0) {
			throw new IllegalArgumentException("Erro de cadastro: Quantidade em estoque deve ser pelo menos 1");
		}
		this.stockQuantity = stockQuantity;
	}
	
}
