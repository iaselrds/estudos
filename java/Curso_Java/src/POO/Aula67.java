package POO;
import POO.entities.items.Product;
import java.util.Scanner;
import java.util.Locale;

public class Aula67 {
	public static void main(String args[]) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Product p1 = new Product();
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		//p1.name = sc.nextLine();
		System.out.print("Price: R$ ");
		//p1.price = sc.nextDouble();
		sc.nextLine();
		System.out.print("Quantity in stock: ");
		//p1.quantity = sc.nextInt();
		sc.nextLine();
		
		p1.showInfo();
		
		p1.addProducts(120);
		
		p1.removeProducts(130);
		
		sc.close();
	}
}
