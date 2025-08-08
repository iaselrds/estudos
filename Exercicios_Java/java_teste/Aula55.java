package java_teste;
import java.util.Scanner;

public class Aula55 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char confirma = ' ';
		
		do {
			double temperatura, fahrenheit = 0;
			
			System.out.print("Digite a temperatura em Celsius: ");
			temperatura = sc.nextDouble();
			sc.nextLine();
			fahrenheit = ((9*temperatura)/5) + 32;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", fahrenheit);
			
			System.out.print("Deseja repetir (s/n)?: ");
			confirma = sc.next().charAt(0);
			
		} while(confirma == 's');
		
		sc.close();
	}
	
}
