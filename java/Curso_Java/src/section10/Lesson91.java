package section10;
import POO.entities.items.SimpleProduct;
import java.util.Scanner;
import java.util.Locale;

public class Lesson91 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		SimpleProduct[] vect = new SimpleProduct[n];
		
		for (int i=0; i < vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new SimpleProduct(name, price);
		}
		
		double sum = 0.0;
		for(int i=0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}
		
		double media = sum/vect.length;
		
		System.out.printf("Average Price = %.2f%n", media);
		
		sc.close(); 
	}

}
