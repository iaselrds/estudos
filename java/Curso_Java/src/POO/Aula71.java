package POO;
import java.util.Scanner;
import java.util.Locale;
import POO.entities.items.Calculator;

public class Aula71 {
	
	public static void main(String args[]) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double raio = 0;
		
		System.out.print("Enter radius: ");
		raio = sc.nextDouble();
		sc.nextLine();
		
		
		System.out.printf("Circumference: %.2f%n", Calculator.circumference(raio));
		System.out.printf("Volume: %.2f%n", Calculator.volume(raio));
		System.out.printf("PI Value: %.2f%n", Calculator.PI);
		
		sc.close();
	}
}
