package entities;

import exceptions.BusinessException;

public class Product {
	
	private String name;
	private String description;
	private Double price;
	private Integer stockQuantity;
	
	public Product() {
	}

	public Product(String name, String description, Double price, Integer stockQuantity) throws BusinessException {
		this.name = name;
		this.description = description;
		setPrice(price);
		setQuantityStock(stockQuantity);
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

	public void setPrice(Double price) throws BusinessException {
		validatePrice(price);
		this.price = price;
	}

	public Integer getStockQuantity() {
		return stockQuantity;
	}

	public void setQuantityStock(Integer stockQuantity) throws BusinessException {
		validateStock(stockQuantity);
		this.stockQuantity = stockQuantity;
	}
	
	/*
	 * Main methods
	 * ========================================
	 */
	public void buy(int quantityProduct) throws BusinessException {
		validateBuy(quantityProduct);
		stockQuantity -= quantityProduct;
	}

	public double calcTotalPrice(int quantityProduct) {
		double finalPrice = quantityProduct * getPrice();
		
		return finalPrice;
	}
	
	/*
	 * Exception Methods
	 * ========================================
	 */
	private void validateBuy(int quantityProduct) throws BusinessException {
		if (quantityProduct > getStockQuantity()) {
			throw new BusinessException("Erro de compra: Quantidade insuficiente em estoque");
		}
		if (quantityProduct <= 0) {
			throw new BusinessException("Erro de compra: Quantidade desejada do produto deve ser pelo menos 1");
		}
	}
	
	private void validateStock(int stockQuantity) throws BusinessException {
		if (stockQuantity <= 0) {
			throw new BusinessException("Erro de cadastro: Quantidade em estoque deve ser pelo menos 1");
		}
	}
	
	private void validatePrice(double price) throws BusinessException {
		if (price <= 0) {
			throw new BusinessException("Erro de cadastro: Preço do produto deve ser maior que 0");
		}
	}
	
}
