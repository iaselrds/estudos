package POO.entities.items;

public class Product {

	public String name;
	public double price;
	public int quantity;
	
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
			this.quantity -= quantity;
			System.out.printf("Updated data: " + name +", $ %.2f, %d, Total: $ %.2f%n", this.price, this.quantity, totalValueInStock());
		}
	}
	
	public void showInfo() {
		System.out.printf("Product data: " + name +", $ %.2f, %d, Total: $ %.2f%n", this.price, this.quantity, totalValueInStock());
	}
	
}
