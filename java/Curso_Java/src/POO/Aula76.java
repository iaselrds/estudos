package POO;

import java.util.Locale;
import java.util.Scanner;
import POO.entities.items.Product;

public class Aula76 {
	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();
		
		Product product = new Product(name, price, quantity);
		System.out.println();
		product.showInfo();
		System.out.println();
		
		System.out.print("Enter the number of products to be added in stock: ");
		int num = sc.nextInt();
		product.addProducts(num);
		
		System.out.print("Enter the number of products to be removed from stock: ");
		num = sc.nextInt();
		product.removeProducts(num);
		sc.close();
		}
}
