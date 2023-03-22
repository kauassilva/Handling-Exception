package entities;

import exceptions.BusinessException;

public class Product {
	
	private String name;
	private String description;
	private Double price;
	private Integer quantityStock;
	
	public Product() {
	}

	public Product(String name, String description, Double price, Integer quantityStock) throws BusinessException {
		this.name = name;
		this.description = description;
		this.price = price;
		setQuantityStock(quantityStock);
	}

	/*
	 * Getters / Setters
	 * ========================================
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantityStock() {
		return quantityStock;
	}

	public void setQuantityStock(Integer quantityStock) throws BusinessException {
		validateStock(quantityStock);
		this.quantityStock = quantityStock;
	}
	
	/*
	 * Main methods
	 * ========================================
	 */
	public void buy(int quantityProduct) throws BusinessException {
		validateBuy(quantityProduct);
		quantityStock -= quantityProduct;
	}
	
	public double calcTotalPrice(int quantityProduct) {
		double finalPrice = quantityProduct * getPrice();
		
		return finalPrice;
	}
	
	private void validateBuy(int quantityProduct) throws BusinessException {
		if (quantityProduct > getQuantityStock()) {
			throw new BusinessException("Erro de compra: Quantidade insuficiente em estoque");
		}
		if (quantityProduct <= 0) {
			throw new BusinessException("Erro de compra: Quantidade desejada do produto deve ser pelo menos 1");
		}
	}
	
	private void validateStock(int quantityStock) throws BusinessException {
		if (quantityStock <= 0) {
			throw new BusinessException("Erro de estoque: Quantidade em estoque deve ser pelo menos 1");
		}
	}
	
}
