package POO;

import java.util.Locale;
import java.util.Scanner;

import POO.entities.items.Product;

public class Aula68 {
public static void main(String args[]) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Product p1 = new Product();
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		String tName = sc.nextLine();
		p1.setName(tName);
		System.out.print("Price: R$ ");
		double tPrice = sc.nextDouble();
		sc.nextLine();
		p1.setPrice(tPrice);
		
		System.out.print("Enter the number of products to be added in stock: ");
		int num = sc.nextInt();
		sc.nextLine();
		p1.addProducts(num);
		
		System.out.print("Enter the number of products to be removed from stock: ");
		num = sc.nextInt();
		sc.nextLine();
		p1.removeProducts(num);
		
		
		sc.close();
	}

}
