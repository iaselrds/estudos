package POO;
import java.util.Scanner;

import POO.entities.forms.Triangle;

import java.util.Locale;

public class Aula65 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Triangle x, y;
		
		double areaX, areaY;
		
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Digite as medidas do triângulo X: ");
		
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
			
		areaX = x.area();
		
		System.out.println("Digite as medidas do triângulo Y: ");
		
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		areaY = y.area();
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");
		}
		
		sc.close();
	}
}
