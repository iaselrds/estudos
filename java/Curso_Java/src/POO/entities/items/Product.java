package POO.entities.items;

public class Product {

	private String name;
	private double price;
	private int quantity;
	
	public Product() {
		
	}
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	
	public int getQuantity() {
		return this.quantity;
	}
	
	public double totalValueInStock() {
		return (price * quantity);
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
		System.out.printf("Updated data: " + name +", $ %.2f, %d, Total: $ %.2f%n", this.price, this.quantity, totalValueInStock());
	}
	
	public void removeProducts(int quantity) {
		if (this.quantity < quantity) {
			System.out.printf("You can't remove more than %d items%n", this.quantity);
		}else {
			double prevTotal = totalValueInStock();
			this.quantity -= quantity;
			System.out.printf("Updated data: " + name +", $ %.2f, %d, Total: $ %.2f%n", this.price, this.quantity, totalValueInStock());
			System.out.printf("Value obtained after sale: $ %.2f%n", prevTotal - totalValueInStock());
		}
	}
	
	public void showInfo() {
		System.out.printf("Product data: " + name +", $ %.2f, %d, Total: $ %.2f%n", this.price, this.quantity, totalValueInStock());
	}
	
	public String toString() {
		return this.name;
	}
	
}
